package com.rvik.chestsortx;

import com.rvik.chestsortx.MaterialCategoryMapper;
import com.rvik.chestsortx.MaterialCategoryMapper.CreativeCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;

public class ChestSortX extends JavaPlugin implements Listener {

  private static final List<String> CATEGORY_ORDER = Arrays.asList(
      "FOOD", "TOOLS", "COMBAT", "BUILDING_BLOCKS", "DECORATIONS", "REDSTONE", "BREWING", "TRANSPORTATION",  "MISC");

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "! This plugin - ChestSortX - is still under development. :P"));
  }

  @EventHandler
  public void onInventoryClose(InventoryCloseEvent event) {

    // Create a map from category number to list of items
    Map<String, List<ItemStack>> categoryMap = new HashMap<>();
    for (String category : CATEGORY_ORDER) {
      categoryMap.put(category, new ArrayList<>());
    }

    // Returns: The upper inventory.
    Inventory closedInventory = event.getInventory();

    // Returns: An array of ItemStacks from the inventory. Individual items may be
    // null.
    ItemStack[] items = closedInventory.getContents();

    // Filter out null/air items and collect into a list
    List<ItemStack> validItems = new ArrayList<>();
    for (ItemStack item : items) {
      if (item == null || item.isEmpty()) {
        continue;
      }
      validItems.add(item);
    }

    // TODO :Compress items (stack similar items together)

    // Categorize items
    for (ItemStack item : validItems) {
      Material mat = item.getType();
      String matName = mat.toString().toUpperCase();

      // Look up the category in your mapper
      CreativeCategory category = MaterialCategoryMapper.getCategory(matName);

      // Fallback if null
      String categoryName = category != null ? category.toString() : "MISC";

      // Add to your categoryMap
      categoryMap.getOrDefault(categoryName, categoryMap.get("MISC")).add(item);

      // Debug
      // event.getPlayer().sendMessage(Component.text(matName + " -> " + categoryName));
    }

    // Sort items within each category alphabetically by material name
    for (String category : CATEGORY_ORDER) {
      List<ItemStack> itemList = categoryMap.get(category);
      itemList.sort((item1, item2) -> {
        String name1 = item1.getType().toString();
        String name2 = item2.getType().toString();
        return name1.compareTo(name2);
      });
    }

    // Clear the inventory before re-adding items
    closedInventory.clear();

    int slot = 0;
    // Put items back
    for (String category : CATEGORY_ORDER) {
      if (categoryMap.get(category).isEmpty()) {
        continue;
      }
      for (ItemStack item : categoryMap.get(category)) {
        if (slot < closedInventory.getSize()) {
          closedInventory.setItem(slot, item);
          slot++;
        }
      }
    }

    event.getPlayer().sendMessage(Component.text("Inventory SORTEDDDD!"));
  }
}