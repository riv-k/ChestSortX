1) The getCreativeCategory() method associated with Mateerial types (import org.bukkit.Material;) returns "BUILDING_BLOCKS" for nearly all items, or atleast for the ones i thought would be in different categories such as:
    - BREWING
All items related to brewing and potions including all types of potions, their variants, and ingredients to brew them.
   - BUILDING_BLOCKS
An assortment of building blocks including dirt, bricks, planks, ores slabs, etc.
   - COMBAT
Equipment items meant for combat including armor, swords, bows, tipped arrows, and useful enchantment books for said equipment.
   - DECORATIONS
Blocks and items typically used for decorative purposes including candles, saplings, flora, fauna, fences, walls, carpets, etc.
   - FOOD
Food items consumable by the player including meats, berries, edible drops from creatures, etc.
   - MISC
Miscellaneous items and blocks that do not fit into other categories including gems, dyes, spawn eggs, discs, banner patterns, etc.
   - REDSTONE
Blocks used and associated with redstone contraptions including buttons, levers, pressure plates, redstone components, pistons, etc.
   - TOOLS
Equipment items meant for general utility including pickaxes, axes, hoes, flint and steel, and useful enchantment books for said tools.
   - TRANSPORTATION
Items pertaining to transportation including minecarts, rails, boats, elytra, etc.

Anyways, that is why I created my own mapping (using AI ofc, im not ab to sort throguh 1200+ items :') )

2) My Mapping is pretty doodoo atm because items have multiple categories and AI basically move it from one category to another

Anywyas, I've decided to go and add more definition to categories / add more cateories, as well as assign priorities so items in two or more categories get assigned to the category with the highest priority.
    - Im hoping this will stop the AI from moving items between categories

3) I was hoping that this project would be over quickly cause I needed it for my server :') but oh well, good things take time :D

Oh right, the whole point of this plugin is that most addons need players to write "/autosort" or run other commands in chat for them to sort items, or for players to Shift + Click the chest + double tap the invenroty - but my thinking is, if people download a plugin such as this THEY WANT IT TO BE ALWAYS ACTIVE! So my plugin is just going to listen to Inventory slots being closed -> and then it sorts the items, easy as. Oh another thing, main focus was to make this mobile friendly, cause double tapping on inventory slots to sort item doesn't really render for mobile, and the only addon that worked great didn't sort item for a double chest :')

Ok yap session done, I needa lock in!!