package com.rvik.chestsortx.mappers;

import org.bukkit.Material;
import java.util.EnumMap;

/**
 * Mapper for Minecraft Materials to enhanced creative-style categories.
 * Categories are fully defined with comments for clarity and mapping accuracy.
 */
public class BetterCategoriesMapper {

    /**
     * High-level creative-style categories to classify items.
     * Each category includes a detailed description for mapping and automation.
     */
    public enum CreativeCategory {

        /**
         * Blocks used primarily for construction and architecture.
         * Includes:
         * - Wood variants: logs, planks, stripped logs, stems, hyphae
         * - Wood decorations: doors, trapdoors, fences, slabs, stairs
         * - Stone, cobblestone, bricks, sandstone, terracotta
         * - Glass & panes, concrete & concrete powder, clay, hardened clay
         * - Wool (non-colored), basalt, blackstone, deepslate
         * - Purpur blocks, prismarine blocks
         */
        BUILDING_BLOCKS,

        /**
         * Color-variant blocks.
         * Includes:
         * - Wool, carpet, beds, concrete, concrete powder
         * - Terracotta, stained glass & panes
         * - Banners, candles
         */
        COLORED_BLOCKS,

        /**
         * Naturally generated world blocks + plants/crops.
         * Includes:
         * - Dirt, grass, sand, gravel
         * - Leaves, saplings
         * - Flowers, mushrooms
         * - Sugar cane, bamboo, cactus, mangrove roots
         * - Ice, packed ice, snow
         * - Coral, sea pickles
         * - Crops: wheat, carrots, potatoes
         * - Seeds: wheat, melon, beetroot
         * - Apples, sticks, other natural drops
         * - Spore blossom, hanging roots, moss, vines
         * - Natural stones: tuff, dripstone
         */
        NATURAL_BLOCKS,

        /**
         * Functional or interactive blocks (inventory or special use).
         * Includes:
         * - Crafting table, furnaces (normal, blast, smoker)
         * - Smithing table, grindstone, loom, cartography table
         * - Stonecutter, fletching table
         * - Enchanting table, brewing stand, cauldron
         * - Anvil, composter, barrels
         * - Chests (normal, trapped), shulker boxes (all colors)
         * - Ender chest, jukebox, lectern, beacon
         * - Campfires, hopper, dropper, dispenser
         * - Bell, respawn anchor, lodestone
         */
        FUNCTIONAL_BLOCKS,

        /**
         * Redstone components and contraptions.
         * Includes:
         * - Redstone dust, repeaters, comparators
         * - Pistons, sticky pistons, redstone lamps, note blocks, observers
         * - Buttons (stone, wood), levers, pressure plates
         * - Daylight detector, target block, sculk sensors
         * - Tripwire hook, TNT, rails, activator rails, detector rails
         */
        REDSTONE,

        /**
         * Tools the player holds that aren't weapons.
         * Includes:
         * - Pickaxes, axes, shovels, hoes
         * - Shears, flint & steel, fishing rod, compass, clock
         * - Bucket variants, spyglass, brush, name tag, lead
         * - Maps (empty/filled)
         * Notes:
         * - Movement-related items (boats, minecarts, elytra, saddles) → TRANSPORTATION
         * - Shields → COMBAT
         */
        TOOLS_AND_UTILITIES,

        /**
         * Weapons, armor, shields, and combat equipment.
         * Includes:
         * - Swords, bows, crossbows, tridents, shields
         * - All armor pieces, arrows & tipped arrows, fire charges
         * - Totem of Undying, armor trims
         * Notes:
         * - Combat-related enchanted books optional; general enchanted books → MISC
         */
        COMBAT,

        /**
         * Consumable food & drink items.
         * Includes:
         * - All edible foods, milk buckets, honey bottles, suspicious stews
         * - Golden apples, bread, cookies, cake
         * - Raw & cooked meats, beetroot soup
         */
        FOOD_AND_DRINK,

        /**
         * Items used to craft or brew potions.
         * Includes:
         * - Gunpowder, blaze powder, ghast tear, nether wart
         * - Magma cream, slimeballs, feathers, leather, string
         * - Dyes, ink sacs, bones, bone meal, potions & potion bottles
         * - Rabbit hide, echo shards
         */
        INGREDIENTS,

        /**
         * Raw and refined ores.
         * Includes:
         * - Raw iron, raw gold, raw copper
         * - Iron ingot, gold ingot, netherite scrap
         * - Coal, diamonds, emeralds, lapis lazuli
         * - Nether quartz, nether gold ore, ancient debris
         * - Netherite ingot
         */
        ORES,

        /** All spawn eggs only. */
        SPAWN_EGGS,

        /**
         * Transport or movement-related equipment.
         * Includes:
         * - All boats, all minecarts, rails, elytra
         * - Saddle, carrot on a stick, warped fungus on a stick
         */
        TRANSPORTATION,

        /**
         * Items with no other natural category.
         * Includes:
         * - Music discs, banner patterns, player heads
         * - Written books, knowledge books
         * - Heart of the sea, dragon's breath
         */
        MISC,

        /**
         * Creative-only / unobtainable admin items.
         * Includes:
         * - Bedrock, barrier, command blocks, structure block & void
         * - Light block, debug stick, end portal frame
         * - Border block, jigsaw block, trial spawner
         * - Brushable archaeology blocks
         */
        UNOBTAINABLE
    }

    private static final EnumMap<Material, CreativeCategory> CATEGORY_MAP = new EnumMap<>(Material.class);

    public static void init() {
        registerBuildingBlocks();
        registerColoredBlocks();
        registerNaturalBlocks();
        registerFunctionalBlocks();
        registerRedstone();
        registerToolsAndUtilities();
        registerCombat();
        registerFoodAndDrink();
        registerIngredients();
        registerSpawnEggs();
        registerTransportation();
        registerMisc();
        registerUnobtainable();
        registerOres();
    }

    // ─────────────────────────────────────────────────────────────
    // REGISTER FUNCTIONS (EMPTY STUBS)
    // Fill using Copilot or manually later.
    // ─────────────────────────────────────────────────────────────

    private static void registerBuildingBlocks() {
    }

    private static void registerColoredBlocks() {
    }

    private static void registerNaturalBlocks() {
    }

    private static void registerFunctionalBlocks() {
    }

    private static void registerRedstone() {
    }

    private static void registerToolsAndUtilities() {
    }

    private static void registerCombat() {
    }

    private static void registerFoodAndDrink() {
    }

    private static void registerIngredients() {
    }

    private static void registerSpawnEggs() {
    }

    private static void registerTransportation() {
    }

    private static void registerMisc() {
    }

    private static void registerUnobtainable() {
    }

    private static void registerOres() {
    }

    // ─────────────────────────────────────────────────────────────
    // ACCESSOR
    // ─────────────────────────────────────────────────────────────

    public static CreativeCategory getCategory(Material material) {
        return CATEGORY_MAP.getOrDefault(material, CreativeCategory.MISC);
    }
}
