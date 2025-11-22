package com.rvik.chestsortx;

import java.util.HashMap;
import java.util.Map;

public class MaterialCategoryMapper {

    public enum CreativeCategory {
        /**
         * All items related to brewing and potions including all types of potions,
         * their variants,
         * and ingredients to brew them.
         */
        BREWING,

        /**
         * An assortment of building blocks including dirt, bricks, planks, ores, slabs,
         * etc.
         */
        BUILDING_BLOCKS,

        /**
         * Equipment items meant for combat including armor, swords, bows, tipped
         * arrows,
         * and useful enchantment books for said equipment.
         */
        COMBAT,

        /**
         * Blocks and items typically used for decorative purposes including candles,
         * saplings,
         * flora, fauna, fences, walls, carpets, etc.
         */
        DECORATIONS,

        /**
         * Food items consumable by the player including meats, berries, edible drops
         * from creatures, etc.
         */
        FOOD,

        /**
         * Miscellaneous items and blocks that do not fit into other categories
         * including gems,
         * dyes, spawn eggs, discs, banner patterns, etc.
         */
        MISC,

        /**
         * Blocks used and associated with redstone contraptions including buttons,
         * levers,
         * pressure plates, redstone components, pistons, etc.
         */
        REDSTONE,

        /**
         * Equipment items meant for general utility including pickaxes, axes, hoes,
         * flint and steel,
         * and useful enchantment books for said tools.
         */
        TOOLS,

        /**
         * Items pertaining to transportation including minecarts, rails, boats, elytra,
         * etc.
         */
        TRANSPORTATION
    }

    // Changed to String keys
    private static final Map<String, CreativeCategory> CATEGORY_MAP = new HashMap<>();

    static {
        // BREWING
        registerBrewing();

        // BUILDING_BLOCKS
        registerBuildingBlocks();

        // COMBAT
        registerCombat();

        // DECORATIONS
        registerDecorations();

        // FOOD
        registerFood();

        // MISC
        registerMisc();

        // REDSTONE
        registerRedstone();

        // TOOLS
        registerTools();

        // TRANSPORTATION
        registerTransportation();
    }

    private static void registerBrewing() {
        // Bottles & potion containers
        CATEGORY_MAP.put("GLASS_BOTTLE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("WATER_BOTTLE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("POTION", CreativeCategory.BREWING);
        CATEGORY_MAP.put("SPLASH_POTION", CreativeCategory.BREWING);
        CATEGORY_MAP.put("LINGERING_POTION", CreativeCategory.BREWING);

        // Brewing equipment / blocks commonly used with brewing
        CATEGORY_MAP.put("BREWING_STAND", CreativeCategory.BREWING);
        CATEGORY_MAP.put("CAULDRON", CreativeCategory.BREWING);
        CATEGORY_MAP.put("WATER_CAULDRON", CreativeCategory.BREWING);
        CATEGORY_MAP.put("WATER_BUCKET", CreativeCategory.BREWING);

        // Core brewing ingredients and modifiers
        CATEGORY_MAP.put("NETHER_WART", CreativeCategory.BREWING);
        CATEGORY_MAP.put("BLAZE_POWDER", CreativeCategory.BREWING);
        CATEGORY_MAP.put("GUNPOWDER", CreativeCategory.BREWING);
        CATEGORY_MAP.put("DRAGON_BREATH", CreativeCategory.BREWING);
        CATEGORY_MAP.put("REDSTONE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("GLOWSTONE_DUST", CreativeCategory.BREWING);

        // Common potion ingredients
        CATEGORY_MAP.put("FERMENTED_SPIDER_EYE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("SPIDER_EYE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("SUGAR", CreativeCategory.BREWING);
        CATEGORY_MAP.put("GLISTERING_MELON_SLICE", CreativeCategory.BREWING);
        CATEGORY_MAP.put("MAGMA_CREAM", CreativeCategory.BREWING);
        CATEGORY_MAP.put("GHAST_TEAR", CreativeCategory.BREWING);
        CATEGORY_MAP.put("GOLDEN_CARROT", CreativeCategory.BREWING);

        CATEGORY_MAP.put("BLAZE_ROD", CreativeCategory.BREWING);
        CATEGORY_MAP.put("DRAGON_BREATH", CreativeCategory.BREWING);

    }

    private static void registerBuildingBlocks() {
        CATEGORY_MAP.put("ACACIA_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_LOG", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_LEAVES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ACACIA_SAPLING", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("AZALEA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("AZALEA_LEAVES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ANDESITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ANDESITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ANDESITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ANDESITE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ANCIENT_DEBRIS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("AMETHYST_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_MOSAIC", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_MOSAIC_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_MOSAIC_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BASALT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BEDROCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACKSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACKSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACKSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACKSTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BRICK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BAMBOO_SAPLING", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CACTUS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CALCITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_BOOKSHELF", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_NETHER_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_POLISHED_BLACKSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_QUARTZ_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_RED_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_RESIN_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_TUFF", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHISELED_TUFF_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CLAY", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COAL_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLED_DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLED_DEEPSLATE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLED_DEEPSLATE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLED_DEEPSLATE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLESTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLESTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLESTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COBBLESTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_RED_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_RED_SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CUT_SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_OAK_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_OAK_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_OAK_LOG", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_PRISMARINE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_PRISMARINE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DARK_PRISMARINE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_TILE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_TILES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_TILE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DEEPSLATE_TILE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIAMOND_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIORITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIORITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIORITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIORITE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIRT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DIRT_PATH", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("DRIPSTONE_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EMERALD_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("END_STONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("END_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("END_STONE_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("END_STONE_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("END_STONE_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FARMLAND", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FIRE_CORAL_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FIRE_CORAL_WALL_FAN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FIRE_CORAL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FIRE_CORAL_FAN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("FROGSPAWN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GILDED_BLACKSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRANITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRANITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRANITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRANITE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRASS_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAVEL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("HAY_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("HONEY_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("HONEYCOMB_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ICE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_CHISELED_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_COBBLESTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_CRACKED_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_MOSSY_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_STONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("INFESTED_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("IRON_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("IRON_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("IRON_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JACK_O_LANTERN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JIGSAW", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUKEBOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUNGLE_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUNGLE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUNGLE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUNGLE_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("LAPIS_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("LAPIS_ORE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("LAVA_CAULDRON", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_LOG", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_FENCE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_FENCE_GATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MANGROVE_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGMA_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSS_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_COBBLESTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_COBBLESTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_COBBLESTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_COBBLESTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_STONE_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_STONE_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MOSSY_STONE_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MUD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MUD_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MUD_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MUD_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MUD_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_LOG", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICK_FENCE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHERRACK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OBSIDIAN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OXIDIZED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OXIDIZED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OXIDIZED_CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OXIDIZED_CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OXIDIZED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PACKED_ICE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PACKED_MUD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_MOSS_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PETRIFIED_OAK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PODZOL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_ANDESITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_ANDESITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_ANDESITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BASALT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BLACKSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BLACKSTONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BLACKSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BLACKSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_BLACKSTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DEEPSLATE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DEEPSLATE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DEEPSLATE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DIORITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DIORITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_DIORITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_GRANITE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_GRANITE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_GRANITE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_TUFF", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_TUFF_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_TUFF_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("POLISHED_TUFF_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PURPUR_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PURPUR_PILLAR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PURPUR_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PURPUR_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PRISMARINE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ_PILLAR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("QUARTZ_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_NETHER_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_NETHER_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_NETHER_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_NETHER_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SAND", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SANDSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SANDSTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("REINFORCED_DEEPSLATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RESIN_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RESIN_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RESIN_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RESIN_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RESIN_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ROOTED_DIRT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SAND", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SANDSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SANDSTONE_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SEA_LANTERN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SEA_PICKLE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SEAGRASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SHROOMLIGHT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SHULKER_BOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SLIME_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_BASALT", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_QUARTZ", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_QUARTZ_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_QUARTZ_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_RED_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_RED_SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_RED_SANDSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_SANDSTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_SANDSTONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_SANDSTONE_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_STONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SMOOTH_STONE_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STONE_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STONE_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STONE_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STONE_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SLIME_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("STRUCTURE_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_BRICKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_BRICK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_BRICK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_BRICK_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUFF_WALL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TUBE_CORAL_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("TINTED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_FENCE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_FENCE_GATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_NYLIUM", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_WART_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WEATHERED_CHISELED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WEATHERED_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WEATHERED_CUT_COPPER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_MUSHROOM_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_WART_BLOCK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_QUARTZ_ORE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("NETHER_GOLD_ORE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("IRON_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACK_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACK_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLACK_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLUE_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLUE_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("BLUE_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHERRY_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHERRY_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CHERRY_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CYAN_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CYAN_SHULKER_BOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CYAN_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CYAN_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CYAN_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("JUNGLE_LEAVES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGENTA_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGENTA_SHULKER_BOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGENTA_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGENTA_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("MAGENTA_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("OAK_LEAVES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ORANGE_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ORANGE_SHULKER_BOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ORANGE_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ORANGE_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ORANGE_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_LEAVES", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_PLANKS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_LOG", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("PALE_OAK_WOOD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_CONCRETE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_CONCRETE_POWDER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_SHULKER_BOX", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("RED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_HYPHAE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_STEM", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("COPPER_ORE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CRIMSON_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CRIMSON_HYPHAE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CRIMSON_NYLIUM", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CRIMSON_STEM", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("CRYING_OBSIDIAN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ENCHANTING_TABLE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("ENDER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_BULB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_GOLEM_STATUE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("EXPOSED_COPPER_GRATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_COPPER_LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("EXPOSED_COPPER_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("EXPOSED_LIGHTNING_ROD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GLOW_LICHEN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_CONCRETE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_CONCRETE_POWDER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GRAY_WOOL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_CONCRETE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_CONCRETE_POWDER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_GLAZED_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_STAINED_GLASS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_STAINED_GLASS_PANE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_TERRACOTTA", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("GREEN_WOOL", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("IRON_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("LODESTONE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WARPED_BUTTON", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_BULB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_GRATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_COPPER_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_BULB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_GRATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_EXPOSED_LIGHTNING_ROD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_LIGHTNING_ROD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_BULB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_GRATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_LIGHTNING_ROD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_BARS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_BULB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_CHAIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_CHEST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_DOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_GRATE", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_TRAPDOOR", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_CUT_COPPER_SLAB", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_CUT_COPPER_STAIRS", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("WAXED_WEATHERED_LIGHTNING_ROD", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SCULK", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SCULK_CATALYST", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SCULK_SHRIEKER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SCULK_VEIN", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("LADDER", CreativeCategory.BUILDING_BLOCKS);
        CATEGORY_MAP.put("SCAFFOLDING", CreativeCategory.BUILDING_BLOCKS);
    }

    private static void registerCombat() {
        // Core combat items: weapons, armor, ammunition and trophies
        CATEGORY_MAP.put("ARROW", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("SPECTRAL_ARROW", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("BOW", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("CROSSBOW", CreativeCategory.COMBAT);

        // Armor (combat equipment)
        CATEGORY_MAP.put("CHAINMAIL_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("CHAINMAIL_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("CHAINMAIL_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("CHAINMAIL_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("LEATHER_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("LEATHER_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("LEATHER_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("LEATHER_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("DIAMOND_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("DIAMOND_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("DIAMOND_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("DIAMOND_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("NETHERITE_BOOTS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("NETHERITE_CHESTPLATE", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("NETHERITE_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("NETHERITE_LEGGINGS", CreativeCategory.COMBAT);

        // Weapons and combat tools
        CATEGORY_MAP.put("DIAMOND_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("STONE_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("WOODEN_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("NETHERITE_SWORD", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("TRIDENT", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("MACE", CreativeCategory.COMBAT);

        // Horse armor kept as combat equipment
        CATEGORY_MAP.put("DIAMOND_HORSE_ARMOR", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("GOLDEN_HORSE_ARMOR", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("IRON_HORSE_ARMOR", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("LEATHER_HORSE_ARMOR", CreativeCategory.COMBAT);

        // Utility / trophies
        CATEGORY_MAP.put("TOTEM_OF_UNDYING", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("WITHER_SKELETON_SKULL", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("SHIELD", CreativeCategory.COMBAT);

        // Keep blaze spawn egg here (was in combat originally)
        CATEGORY_MAP.put("BLAZE_SPAWN_EGG", CreativeCategory.COMBAT);

        CATEGORY_MAP.put("BLACK_HARNESS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("BLUE_HARNESS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("BROWN_HARNESS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("RED_HARNESS", CreativeCategory.COMBAT);

        CATEGORY_MAP.put("COPPER_CHESTPLATE", CreativeCategory.COMBAT);

        CATEGORY_MAP.put("COPPER_HELMET", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("COPPER_HORSE_ARMOR", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("COPPER_LEGGINGS", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("TIPPED_ARROW", CreativeCategory.COMBAT);
        CATEGORY_MAP.put("WOLF_ARMOR", CreativeCategory.COMBAT);

    }

    private static void registerDecorations() {
        CATEGORY_MAP.put("AMETHYST_CLUSTER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_FENCE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_FENCE_GATE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ACACIA_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ARMOR_STAND", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("AZURE_BLUET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_FENCE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_FENCE_GATE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BAMBOO_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BELL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLACK_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLACK_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLACK_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLACK_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLUE_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLUE_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("BLUE_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CACTUS_FLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CAMPFIRE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CARVED_PUMPKIN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CAVE_VINES", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CAVE_VINES_PLANT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHORUS_FLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHORUS_PLANT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_FENCE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_FENCE_GATE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CHERRY_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CYAN_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CYAN_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CYAN_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CYAN_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CYAN_WOOL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DANDELION", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DECORATED_POT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DEAD_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("FLOWER_POT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("FERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("FLOWERING_AZALEA", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("FLOWERING_AZALEA_LEAVES", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("FIREFLY_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GLOBE_BANNER_PATTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GRAY_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GRAY_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GRAY_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GREEN_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GREEN_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GREEN_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("HANGING_ROOTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_FENCE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_FENCE_GATE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("JUNGLE_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LECTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LARGE_FERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LEAF_LITTER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LILAC", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LILY_OF_THE_VALLEY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("LILY_PAD", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_BED", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MAGENTA_WOOL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("MOSS_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OAK_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OXEYE_DAISY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_BED", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ORANGE_WOOL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OCHRE_FROGLIGHT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("OPEN_EYEBLOSSOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PAINTING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_HANGING_MOSS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PALE_OAK_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("PEONY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_ACACIA_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_ALLIUM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_AZALEA_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_AZURE_BLUET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_BAMBOO", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_BIRCH_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_BLUE_ORCHID", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_BROWN_MUSHROOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CACTUS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CHERRY_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CLOSED_EYEBLOSSOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CORNFLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CRIMSON_FUNGUS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_CRIMSON_ROOTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_DANDELION", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_DARK_OAK_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_DEAD_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_FERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_FLOWERING_AZALEA_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_JUNGLE_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_LILY_OF_THE_VALLEY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_MANGROVE_PROPAGULE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_OAK_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_OPEN_EYEBLOSSOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_ORANGE_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_OXEYE_DAISY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_PALE_OAK_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_PINK_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_POPPY", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_RED_MUSHROOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_RED_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_SPRUCE_SAPLING", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_TORCHFLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_WARPED_FUNGUS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_WARPED_ROOTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_WHITE_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("POTTED_WITHER_ROSE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_BED", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_CANDLE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_CARPET", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_MUSHROOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_TULIP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("RED_WOOL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("ROSE_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("SHORT_DRY_GRASS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("SHORT_GRASS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("SPORE_BLOSSOM", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("SUNFLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TALL_DRY_GRASS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TALL_GRASS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TALL_SEAGRASS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TORCHFLOWER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TORCHFLOWER_CROP", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TORCHFLOWER_SEEDS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TUBE_CORAL", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TUBE_CORAL_FAN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TUBE_CORAL_WALL_FAN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TWISTING_VINES", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TWISTING_VINES_PLANT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("VINE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("TORCH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WALL_TORCH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_FUNGUS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_ROOTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_SHELF", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_WALL_HANGING_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WARPED_WALL_SIGN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WEEPING_VINES", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WEEPING_VINES_PLANT", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WILDFLOWERS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WITHER_ROSE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("SWEET_BERRY_BUSH", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("NETHER_SPROUTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("COPPER_LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CRIMSON_FUNGUS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("CRIMSON_ROOTS", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DRAGON_EGG", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DRAGON_HEAD", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("DRAGON_WALL_HEAD", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("END_ROD", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GLOW_ITEM_FRAME", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GRAY_SHULKER_BOX", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GRAY_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GREEN_SHULKER_BOX", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("GREEN_WALL_BANNER", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_COPPER_GOLEM_STATUE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_COPPER_LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_GOLEM_STATUE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_EXPOSED_COPPER_LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_GOLEM_STATUE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_OXIDIZED_COPPER_LANTERN", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_GOLEM_STATUE", CreativeCategory.DECORATIONS);
        CATEGORY_MAP.put("WAXED_WEATHERED_COPPER_LANTERN", CreativeCategory.DECORATIONS);
    }

    private static void registerFood() {
        CATEGORY_MAP.put("APPLE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BAKED_POTATO", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BEEF", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BEETROOT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BEETROOT_SEEDS", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BEETROOT_SOUP", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BEETROOTS", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BREAD", CreativeCategory.FOOD);
        CATEGORY_MAP.put("CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("CARROT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("CARROTS", CreativeCategory.FOOD);
        CATEGORY_MAP.put("DRIED_KELP", CreativeCategory.FOOD);
        CATEGORY_MAP.put("DRIED_KELP_BLOCK", CreativeCategory.FOOD);
        CATEGORY_MAP.put("EGG", CreativeCategory.FOOD);
        CATEGORY_MAP.put("GOLDEN_APPLE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("GOLDEN_CARROT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("GLOW_BERRIES", CreativeCategory.FOOD);
        CATEGORY_MAP.put("INK_SAC", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MELON", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MELON_SEEDS", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MELON_SLICE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MILK_BUCKET", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MUSHROOM_STEW", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MUTTON", CreativeCategory.FOOD);
        CATEGORY_MAP.put("POPPED_CHORUS_FRUIT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("POISONOUS_POTATO", CreativeCategory.FOOD);
        CATEGORY_MAP.put("PORKCHOP", CreativeCategory.FOOD);
        CATEGORY_MAP.put("POTATO", CreativeCategory.FOOD);
        CATEGORY_MAP.put("POTATOES", CreativeCategory.FOOD);
        CATEGORY_MAP.put("PUMPKIN_PIE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("RABBIT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("RABBIT_STEW", CreativeCategory.FOOD);
        CATEGORY_MAP.put("RABBIT_FOOT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("ROTTEN_FLESH", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SALMON", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SALMON_BUCKET", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SUGAR", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SUGAR_CANE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SWEET_BERRIES", CreativeCategory.FOOD);
        CATEGORY_MAP.put("TADPOLE_BUCKET", CreativeCategory.FOOD);
        CATEGORY_MAP.put("TROPICAL_FISH_BUCKET", CreativeCategory.FOOD);
        CATEGORY_MAP.put("WHEAT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("WHEAT_SEEDS", CreativeCategory.FOOD);
        CATEGORY_MAP.put("PUFFERFISH", CreativeCategory.FOOD);
        CATEGORY_MAP.put("PUFFERFISH_BUCKET", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SPIDER_EYE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SUGAR", CreativeCategory.FOOD);
        CATEGORY_MAP.put("HONEY_BOTTLE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("SUSPICIOUS_STEW", CreativeCategory.FOOD);
        CATEGORY_MAP.put("CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("CYAN_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("GRAY_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("GREEN_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("MAGENTA_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("ORANGE_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("RED_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BLACK_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("BLUE_CANDLE_CAKE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_BEEF", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_CHICKEN", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_COD", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_MUTTON", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_PORKCHOP", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_RABBIT", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKED_SALMON", CreativeCategory.FOOD);
        CATEGORY_MAP.put("COOKIE", CreativeCategory.FOOD);
        CATEGORY_MAP.put("ENCHANTED_GOLDEN_APPLE", CreativeCategory.FOOD);

    }

    private static void registerMisc() {
        CATEGORY_MAP.put("AIR", CreativeCategory.MISC);
        CATEGORY_MAP.put("ALLAY_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ANGLER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ARCHER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ARMS_UP_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ARMADILLO_SCUTE", CreativeCategory.MISC);
        CATEGORY_MAP.put("ARMADILLO_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("BAT_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("BEE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("BEE_NEST", CreativeCategory.MISC);
        CATEGORY_MAP.put("BEEHIVE", CreativeCategory.MISC);
        CATEGORY_MAP.put("BARREL", CreativeCategory.MISC);
        CATEGORY_MAP.put("BARRIER", CreativeCategory.MISC);
        CATEGORY_MAP.put("BOOK", CreativeCategory.MISC);
        CATEGORY_MAP.put("BOOKSHELF", CreativeCategory.MISC);
        CATEGORY_MAP.put("BORDURE_INDENTED_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("BREEZE_ROD", CreativeCategory.MISC);
        CATEGORY_MAP.put("BREEZE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("BREWER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("BURN_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("BUDDING_AMETHYST", CreativeCategory.MISC);
        CATEGORY_MAP.put("BUNDLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("BRUSH", CreativeCategory.MISC);
        CATEGORY_MAP.put("CAMEL_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("CAT_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("CAVE_AIR", CreativeCategory.MISC);
        CATEGORY_MAP.put("CAVE_SPIDER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("CHARCOAL", CreativeCategory.MISC);
        CATEGORY_MAP.put("CHICKEN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("COMMAND_BLOCK", CreativeCategory.MISC);
        CATEGORY_MAP.put("COMMAND_BLOCK_MINECART", CreativeCategory.MISC);
        CATEGORY_MAP.put("COMPASS", CreativeCategory.MISC);
        CATEGORY_MAP.put("COMPOSTER", CreativeCategory.MISC);
        CATEGORY_MAP.put("CONDUIT", CreativeCategory.MISC);
        CATEGORY_MAP.put("COD_BUCKET", CreativeCategory.MISC);
        CATEGORY_MAP.put("COD_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("COPPER_GOLEM_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("COPPER_GOLEM_STATUE", CreativeCategory.MISC);
        CATEGORY_MAP.put("COPPER_GRATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("COPPER_INGOT", CreativeCategory.MISC);
        CATEGORY_MAP.put("COPPER_NUGGET", CreativeCategory.MISC);
        CATEGORY_MAP.put("DANGER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("DIAMOND", CreativeCategory.MISC);
        CATEGORY_MAP.put("DISC_FRAGMENT_5", CreativeCategory.MISC);
        CATEGORY_MAP.put("DOLPHIN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("DONKEY_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("DRIED_GHAST", CreativeCategory.MISC);
        CATEGORY_MAP.put("DUNE_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("EMERALD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ENCHANTED_BOOK", CreativeCategory.MISC);
        CATEGORY_MAP.put("END_CRYSTAL", CreativeCategory.MISC);
        CATEGORY_MAP.put("END_GATEWAY", CreativeCategory.MISC);
        CATEGORY_MAP.put("END_PORTAL", CreativeCategory.MISC);
        CATEGORY_MAP.put("END_PORTAL_FRAME", CreativeCategory.MISC);
        CATEGORY_MAP.put("ENDER_EYE", CreativeCategory.MISC);
        CATEGORY_MAP.put("EYE_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("FIELD_MASONED_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("FLETCHING_TABLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("FLOW_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("FLOW_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("FLOW_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("FLOWER_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("FRIEND_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("GLOW_INK_SAC", CreativeCategory.MISC);
        CATEGORY_MAP.put("ECHO_SHARD", CreativeCategory.MISC);
        CATEGORY_MAP.put("EXPERIENCE_BOTTLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("GOAT_HORN", CreativeCategory.MISC);
        CATEGORY_MAP.put("FILLED_MAP", CreativeCategory.MISC);
        CATEGORY_MAP.put("GUSTER_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("GUSTER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("HEART_OF_THE_SEA", CreativeCategory.MISC);
        CATEGORY_MAP.put("HEART_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("HEARTBREAK_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("HOST_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("HOWL_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("GRAY_DYE", CreativeCategory.MISC);
        CATEGORY_MAP.put("GRAY_HARNESS", CreativeCategory.MISC);
        CATEGORY_MAP.put("GREEN_DYE", CreativeCategory.MISC);
        CATEGORY_MAP.put("GREEN_HARNESS", CreativeCategory.MISC);
        CATEGORY_MAP.put("IRON_INGOT", CreativeCategory.MISC);
        CATEGORY_MAP.put("IRON_NUGGET", CreativeCategory.MISC);
        CATEGORY_MAP.put("KNOWLEDGE_BOOK", CreativeCategory.MISC);
        CATEGORY_MAP.put("LAPIS_LAZULI", CreativeCategory.MISC);
        CATEGORY_MAP.put("LARGE_AMETHYST_BUD", CreativeCategory.MISC);
        CATEGORY_MAP.put("MAP", CreativeCategory.MISC);
        CATEGORY_MAP.put("MEDIUM_AMETHYST_BUD", CreativeCategory.MISC);
        CATEGORY_MAP.put("MINER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("MOJANG_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("MOURNER_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("MUDDY_MANGROVE_ROOTS", CreativeCategory.MISC);
        CATEGORY_MAP.put("NAME_TAG", CreativeCategory.MISC);
        CATEGORY_MAP.put("NAUTILUS_SHELL", CreativeCategory.MISC);
        CATEGORY_MAP.put("NETHER_PORTAL", CreativeCategory.MISC);
        CATEGORY_MAP.put("NETHER_STAR", CreativeCategory.MISC);
        CATEGORY_MAP.put("OCELOT_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PANDA_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PARROT_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PHANTOM_MEMBRANE", CreativeCategory.MISC);
        CATEGORY_MAP.put("PHANTOM_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIG_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIGLIN_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIGLIN_BRUTE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIGLIN_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIGLIN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PIGLIN_WALL_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PILLAGER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("PLAYER_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PLAYER_WALL_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PLENTY_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PRIZE_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("PUFFERFISH_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("RABBIT_HIDE", CreativeCategory.MISC);
        CATEGORY_MAP.put("RABBIT_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("RAVAGER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("RAISER_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("RIB_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("RESPAWN_ANCHOR", CreativeCategory.MISC);
        CATEGORY_MAP.put("SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("SHULKER_SHELL", CreativeCategory.MISC);
        CATEGORY_MAP.put("SHULKER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("SILVERFISH_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKELETON_HORSE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKELETON_SKULL", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKELETON_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKELETON_WALL_SKULL", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKULL_BANNER_PATTERN", CreativeCategory.MISC);
        CATEGORY_MAP.put("SKULL_POTTERY_SHERD", CreativeCategory.MISC);
        CATEGORY_MAP.put("SLIME_BALL", CreativeCategory.MISC);
        CATEGORY_MAP.put("SNIFFER_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SNIFFER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SNORT_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("SPAWNER", CreativeCategory.MISC);
        CATEGORY_MAP.put("SPIDER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("STRING", CreativeCategory.MISC);
        CATEGORY_MAP.put("SUSPICIOUS_GRAVEL", CreativeCategory.MISC);
        CATEGORY_MAP.put("SUSPICIOUS_SAND", CreativeCategory.MISC);
        CATEGORY_MAP.put("TADPOLE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("TRADER_LLAMA_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("TRIAL_KEY", CreativeCategory.MISC);
        CATEGORY_MAP.put("TRIAL_SPAWNER", CreativeCategory.MISC);
        CATEGORY_MAP.put("TROPICAL_FISH_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("TURTLE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("VEX_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("VILLAGER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("VINDICATOR_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("VAULT", CreativeCategory.MISC);
        CATEGORY_MAP.put("WANDERING_TRADER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("WARD_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("WARDEN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("WITCH_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("WOLF_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOGLIN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIE_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIE_HORSE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIE_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIE_VILLAGER_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIE_WALL_HEAD", CreativeCategory.MISC);
        CATEGORY_MAP.put("ZOMBIFIED_PIGLIN_SPAWN_EGG", CreativeCategory.MISC);
        CATEGORY_MAP.put("WRITABLE_BOOK", CreativeCategory.MISC);
        CATEGORY_MAP.put("WRITTEN_BOOK", CreativeCategory.MISC);
        CATEGORY_MAP.put("NETHERITE_INGOT", CreativeCategory.MISC);
        CATEGORY_MAP.put("NETHERITE_SCRAP", CreativeCategory.MISC);
        CATEGORY_MAP.put("NETHERITE_UPGRADE_SMITHING_TEMPLATE", CreativeCategory.MISC);
        CATEGORY_MAP.put("RED_DYE", CreativeCategory.MISC);
        CATEGORY_MAP.put("WATER", CreativeCategory.MISC);
        CATEGORY_MAP.put("MAGENTA_BUNDLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("ORANGE_BUNDLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("RED_BUNDLE", CreativeCategory.MISC);
        CATEGORY_MAP.put("CHAIN_COMMAND_BLOCK", CreativeCategory.MISC);
        CATEGORY_MAP.put("REPEATING_COMMAND_BLOCK", CreativeCategory.MISC);
    }

    private static void registerRedstone() {
        CATEGORY_MAP.put("BAMBOO_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("BAMBOO_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("BIRCH_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("BIRCH_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("CALIBRATED_SCULK_SENSOR", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("SCULK_SENSOR", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("COMPARATOR", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("CRIMSON_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("CHERRY_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("CHERRY_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("DAYLIGHT_DETECTOR", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("HEAVY_WEIGHTED_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("HOPPER", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("JUNGLE_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("LEVER", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("LIGHT_WEIGHTED_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("LIGHTNING_ROD", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("MANGROVE_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("MOVING_PISTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("OAK_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("OBSERVER", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("OXIDIZED_LIGHTNING_ROD", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("PALE_OAK_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("PALE_OAK_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("PISTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("PISTON_HEAD", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_BLOCK", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_LAMP", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_ORE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_TORCH", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_WALL_TORCH", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REDSTONE_WIRE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("REPEATER", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("STONE_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("STONE_PRESSURE_PLATE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("STICKY_PISTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("TARGET", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("TNT", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("TRIPWIRE", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("TRIPWIRE_HOOK", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("TRAPPED_CHEST", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("OAK_BUTTON", CreativeCategory.REDSTONE);
        CATEGORY_MAP.put("WARPED_PRESSURE_PLATE", CreativeCategory.REDSTONE);
    }

    private static void registerTools() {
        CATEGORY_MAP.put("ANVIL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("BLAST_FURNACE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("BUCKET", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_SWORD", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_TRAPDOOR", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("COPPER_WALL_TORCH", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DEBUG_STICK", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DAMAGED_ANVIL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DISPENSER", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DROPPER", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("FISHING_ROD", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("FLINT_AND_STEEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("FURNACE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("FURNACE_MINECART", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("GRINDSTONE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("FLINT_AND_STEEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("LOOM", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("SHEARS", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("STONE_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("STONE_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("STONE_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("STONE_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("STONECUTTER", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("RECOVERY_COMPASS", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("SPYGLASS", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("TEST_BLOCK", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("TEST_INSTANCE_BLOCK", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("NETHERITE_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("NETHERITE_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("NETHERITE_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("NETHERITE_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DIAMOND_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DIAMOND_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DIAMOND_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("DIAMOND_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("IRON_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("IRON_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("IRON_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("IRON_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("GOLDEN_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("GOLDEN_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("GOLDEN_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("GOLDEN_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("WOODEN_AXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("WOODEN_PICKAXE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("WOODEN_SHOVEL", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("WOODEN_HOE", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("LEAD", CreativeCategory.TOOLS);
        CATEGORY_MAP.put("WARPED_FUNGUS_ON_A_STICK", CreativeCategory.TOOLS);
    }

    private static void registerTransportation() {
        CATEGORY_MAP.put("ACACIA_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("ACACIA_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("ACTIVATOR_RAIL", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("BAMBOO_RAFT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("BAMBOO_CHEST_RAFT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("BIRCH_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("BIRCH_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("CHERRY_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("CHERRY_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("CHEST_MINECART", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("DARK_OAK_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("DARK_OAK_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("ELYTRA", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("FIREWORK_ROCKET", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("JUNGLE_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("JUNGLE_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("MINECART", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("MANGROVE_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("MANGROVE_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("JUNGLE_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("JUNGLE_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("DARK_OAK_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("DARK_OAK_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("OAK_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("OAK_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("PALE_OAK_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("PALE_OAK_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("SPRUCE_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("SPRUCE_CHEST_BOAT", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("CARROT_ON_A_STICK", CreativeCategory.TRANSPORTATION);

        // Rails and minecart variants belong to transportation (used for movement systems)
        CATEGORY_MAP.put("DETECTOR_RAIL", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("POWERED_RAIL", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("RAIL", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("HOPPER_MINECART", CreativeCategory.TRANSPORTATION);
        CATEGORY_MAP.put("TNT_MINECART", CreativeCategory.TRANSPORTATION);

    }

    // Updated to accept string keys
    public static CreativeCategory getCategory(String materialName) {
        return CATEGORY_MAP.get(materialName);
    }

}
