package mod.equinox.flamboyant.block;

import static mod.equinox.flamboyant.block.BlockProperties.BED;
import static mod.equinox.flamboyant.block.BlockProperties.CARPET;
import static mod.equinox.flamboyant.block.BlockProperties.CONCRETE;
import static mod.equinox.flamboyant.block.BlockProperties.CONCRETEPOWDER;
import static mod.equinox.flamboyant.block.BlockProperties.GLASS;
import static mod.equinox.flamboyant.block.BlockProperties.GLAZEDTERRACOTTA;
import static mod.equinox.flamboyant.block.BlockProperties.TERRACOTTA;
import static mod.equinox.flamboyant.block.BlockProperties.WOOL;

import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.StainedGlassPaneBlock;

public class ModBlocks {
    public static Block AMBERWOOL = new Block(WOOL).setRegistryName("amber_wool");
    public static Block BEIGEWOOL = new Block(WOOL).setRegistryName("beige_wool");
    public static Block CREAMWOOL = new Block(WOOL).setRegistryName("cream_wool");
    public static Block DARKGREENWOOL = new Block(WOOL).setRegistryName("dark_green_wool");
    public static Block FORESTGREENWOOL = new Block(WOOL).setRegistryName("forest_green_wool");
    public static Block HOTPINKWOOL = new Block(WOOL).setRegistryName("hot_pink_wool");
    public static Block INDIGOWOOL = new Block(WOOL).setRegistryName("indigo_wool");
    public static Block MAROONWOOL = new Block(WOOL).setRegistryName("maroon_wool");
    public static Block NAVYWOOL = new Block(WOOL).setRegistryName("navy_wool");
    public static Block OLIVEWOOL = new Block(WOOL).setRegistryName("olive_wool");
    public static Block PALEGREENWOOL = new Block(WOOL).setRegistryName("pale_green_wool");
    public static Block PALEPINKWOOL = new Block(WOOL).setRegistryName("pale_pink_wool");
    public static Block PALEYELLOWWOOL = new Block(WOOL).setRegistryName("pale_yellow_wool");
    public static Block SKYBLUEWOOL = new Block(WOOL).setRegistryName("sky_blue_wool");
    public static Block SLATEGRAYWOOL = new Block(WOOL).setRegistryName("slate_gray_wool");
    public static Block VIOLETWOOL = new Block(WOOL).setRegistryName("violet_wool");
    public static Block AMBERCARPET = new FCarpetBlock(CARPET).setRegistryName("amber_carpet");
    public static Block BEIGECARPET = new FCarpetBlock(CARPET).setRegistryName("beige_carpet");
    public static Block CREAMCARPET = new FCarpetBlock(CARPET).setRegistryName("cream_carpet");
    public static Block DARKGREENCARPET = new FCarpetBlock(CARPET).setRegistryName("dark_green_carpet");
    public static Block FORESTGREENCARPET = new FCarpetBlock(CARPET).setRegistryName("forest_green_carpet");
    public static Block HOTPINKCARPET = new FCarpetBlock(CARPET).setRegistryName("hot_pink_carpet");
    public static Block INDIGOCARPET = new FCarpetBlock(CARPET).setRegistryName("indigo_carpet");
    public static Block MAROONCARPET = new FCarpetBlock(CARPET).setRegistryName("maroon_carpet");
    public static Block NAVYCARPET = new FCarpetBlock(CARPET).setRegistryName("navy_carpet");
    public static Block OLIVECARPET = new FCarpetBlock(CARPET).setRegistryName("olive_carpet");
    public static Block PALEGREENCARPET = new FCarpetBlock(CARPET).setRegistryName("pale_green_carpet");
    public static Block PALEPINKCARPET = new FCarpetBlock(CARPET).setRegistryName("pale_pink_carpet");
    public static Block PALEYELLOWCARPET = new FCarpetBlock(CARPET).setRegistryName("pale_yellow_carpet");
    public static Block SKYBLUECARPET = new FCarpetBlock(CARPET).setRegistryName("sky_blue_carpet");
    public static Block SLATEGRAYCARPET = new FCarpetBlock(CARPET).setRegistryName("slate_gray_carpet");
    public static Block VIOLETCARPET = new FCarpetBlock(CARPET).setRegistryName("violet_carpet");
    public static Block AMBERTERRACOTTA = new Block(TERRACOTTA).setRegistryName("amber_terracotta");
    public static Block BEIGETERRACOTTA = new Block(TERRACOTTA).setRegistryName("beige_terracotta");
    public static Block CREAMTERRACOTTA = new Block(TERRACOTTA).setRegistryName("cream_terracotta");
    public static Block DARKGREENTERRACOTTA = new Block(TERRACOTTA).setRegistryName("dark_green_terracotta");
    public static Block FORESTGREENTERRACOTTA = new Block(TERRACOTTA).setRegistryName("forest_green_terracotta");
    public static Block HOTPINKTERRACOTTA = new Block(TERRACOTTA).setRegistryName("hot_pink_terracotta");
    public static Block INDIGOTERRACOTTA = new Block(TERRACOTTA).setRegistryName("indigo_terracotta");
    public static Block MAROONTERRACOTTA = new Block(TERRACOTTA).setRegistryName("maroon_terracotta");
    public static Block NAVYTERRACOTTA = new Block(TERRACOTTA).setRegistryName("navy_terracotta");
    public static Block OLIVETERRACOTTA = new Block(TERRACOTTA).setRegistryName("olive_terracotta");
    public static Block PALEGREENTERRACOTTA = new Block(TERRACOTTA).setRegistryName("pale_green_terracotta");
    public static Block PALEPINKTERRACOTTA = new Block(TERRACOTTA).setRegistryName("pale_pink_terracotta");
    public static Block PALEYELLOWTERRACOTTA = new Block(TERRACOTTA).setRegistryName("pale_yellow_terracotta");
    public static Block SKYBLUETERRACOTTA = new Block(TERRACOTTA).setRegistryName("sky_blue_terracotta");
    public static Block SLATEGRAYTERRACOTTA = new Block(TERRACOTTA).setRegistryName("slate_gray_terracotta");
    public static Block VIOLETTERRACOTTA = new Block(TERRACOTTA).setRegistryName("violet_terracotta");
    public static Block AMBERGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("amber_glazed_terracotta");
    public static Block BEIGEGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("beige_glazed_terracotta");
    public static Block CREAMGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("cream_glazed_terracotta");
    public static Block DARKGREENGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("dark_green_glazed_terracotta");
    public static Block FORESTGREENGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("forest_green_glazed_terracotta");
    public static Block HOTPINKGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("hot_pink_glazed_terracotta");
    public static Block INDIGOGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("indigo_glazed_terracotta");
    public static Block MAROONGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("maroon_glazed_terracotta");
    public static Block NAVYGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("navy_glazed_terracotta");
    public static Block OLIVEGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("olive_glazed_terracotta");
    public static Block PALEGREENGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("pale_green_glazed_terracotta");
    public static Block PALEPINKGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("pale_pink_glazed_terracotta");
    public static Block PALEYELLOWGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("pale_yellow_glazed_terracotta");
    public static Block SKYBLUEGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("sky_blue_glazed_terracotta");
    public static Block SLATEGRAYGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("slate_gray_glazed_terracotta");
    public static Block VIOLETGLAZEDTERRACOTTA = new GlazedTerracottaBlock(GLAZEDTERRACOTTA).setRegistryName("violet_glazed_terracotta");
    public static Block AMBERCONCRETE = new Block(CONCRETE).setRegistryName("amber_concrete");
    public static Block BEIGECONCRETE = new Block(CONCRETE).setRegistryName("beige_concrete");
    public static Block CREAMCONCRETE = new Block(CONCRETE).setRegistryName("cream_concrete");
    public static Block DARKGREENCONCRETE = new Block(CONCRETE).setRegistryName("dark_green_concrete");
    public static Block FORESTGREENCONCRETE = new Block(CONCRETE).setRegistryName("forest_green_concrete");
    public static Block HOTPINKCONCRETE = new Block(CONCRETE).setRegistryName("hot_pink_concrete");
    public static Block INDIGOCONCRETE = new Block(CONCRETE).setRegistryName("indigo_concrete");
    public static Block MAROONCONCRETE = new Block(CONCRETE).setRegistryName("maroon_concrete");
    public static Block NAVYCONCRETE = new Block(CONCRETE).setRegistryName("navy_concrete");
    public static Block OLIVECONCRETE = new Block(CONCRETE).setRegistryName("olive_concrete");
    public static Block PALEGREENCONCRETE = new Block(CONCRETE).setRegistryName("pale_green_concrete");
    public static Block PALEPINKCONCRETE = new Block(CONCRETE).setRegistryName("pale_pink_concrete");
    public static Block PALEYELLOWCONCRETE = new Block(CONCRETE).setRegistryName("pale_yellow_concrete");
    public static Block SKYBLUECONCRETE = new Block(CONCRETE).setRegistryName("sky_blue_concrete");
    public static Block SLATEGRAYCONCRETE = new Block(CONCRETE).setRegistryName("slate_gray_concrete");
    public static Block VIOLETCONCRETE = new Block(CONCRETE).setRegistryName("violet_concrete");
    public static Block AMBERCONCRETEPOWDER = new ConcretePowderBlock(AMBERCONCRETE, CONCRETEPOWDER).setRegistryName("amber_concrete_powder");
    public static Block BEIGECONCRETEPOWDER = new ConcretePowderBlock(BEIGECONCRETE, CONCRETEPOWDER).setRegistryName("beige_concrete_powder");
    public static Block CREAMCONCRETEPOWDER = new ConcretePowderBlock(CREAMCONCRETE, CONCRETEPOWDER).setRegistryName("cream_concrete_powder");
    public static Block DARKGREENCONCRETEPOWDER = new ConcretePowderBlock(DARKGREENCONCRETE, CONCRETEPOWDER).setRegistryName("dark_green_concrete_powder");
    public static Block FORESTGREENCONCRETEPOWDER = new ConcretePowderBlock(FORESTGREENCONCRETE, CONCRETEPOWDER).setRegistryName("forest_green_concrete_powder");
    public static Block HOTPINKCONCRETEPOWDER = new ConcretePowderBlock(HOTPINKCONCRETE, CONCRETEPOWDER).setRegistryName("hot_pink_concrete_powder");
    public static Block INDIGOCONCRETEPOWDER = new ConcretePowderBlock(INDIGOCONCRETE, CONCRETEPOWDER).setRegistryName("indigo_concrete_powder");
    public static Block MAROONCONCRETEPOWDER = new ConcretePowderBlock(MAROONCONCRETE, CONCRETEPOWDER).setRegistryName("maroon_concrete_powder");
    public static Block NAVYCONCRETEPOWDER = new ConcretePowderBlock(NAVYCONCRETE, CONCRETEPOWDER).setRegistryName("navy_concrete_powder");
    public static Block OLIVECONCRETEPOWDER = new ConcretePowderBlock(OLIVECONCRETE, CONCRETEPOWDER).setRegistryName("olive_concrete_powder");
    public static Block PALEGREENCONCRETEPOWDER = new ConcretePowderBlock(PALEGREENCONCRETE, CONCRETEPOWDER).setRegistryName("pale_green_concrete_powder");
    public static Block PALEPINKCONCRETEPOWDER = new ConcretePowderBlock(PALEPINKCONCRETE, CONCRETEPOWDER).setRegistryName("pale_pink_concrete_powder");
    public static Block PALEYELLOWCONCRETEPOWDER = new ConcretePowderBlock(PALEYELLOWCONCRETE, CONCRETEPOWDER).setRegistryName("pale_yellow_concrete_powder");
    public static Block SKYBLUECONCRETEPOWDER = new ConcretePowderBlock(SKYBLUECONCRETE, CONCRETEPOWDER).setRegistryName("sky_blue_concrete_powder");
    public static Block SLATEGRAYCONCRETEPOWDER = new ConcretePowderBlock(SLATEGRAYCONCRETE, CONCRETEPOWDER).setRegistryName("slate_gray_concrete_powder");
    public static Block VIOLETCONCRETEPOWDER = new ConcretePowderBlock(VIOLETCONCRETE, CONCRETEPOWDER).setRegistryName("violet_concrete_powder");
    public static Block AMBERGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("amber_stained_glass");
    public static Block BEIGEGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("beige_stained_glass");
    public static Block CREAMGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("cream_stained_glass");
    public static Block DARKGREENGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("dark_green_stained_glass");
    public static Block FORESTGREENGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("forest_green_stained_glass");
    public static Block HOTPINKGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("hot_pink_stained_glass");
    public static Block INDIGOGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("indigo_stained_glass");
    public static Block MAROONGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("maroon_stained_glass");
    public static Block NAVYGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("navy_stained_glass");
    public static Block OLIVEGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("olive_stained_glass");
    public static Block PALEGREENGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("pale_green_stained_glass");
    public static Block PALEPINKGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("pale_pink_stained_glass");
    public static Block PALEYELLOWGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("pale_yellow_stained_glass");
    public static Block SKYBLUEGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("sky_blue_stained_glass");
    public static Block SLATEGRAYGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("slate_gray_stained_glass");
    public static Block VIOLETGLASS = new StainedGlassBlock(null, GLASS).setRegistryName("violet_stained_glass");
    public static Block AMBERPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("amber_stained_glass_pane");
    public static Block BEIGEPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("beige_stained_glass_pane");
    public static Block CREAMPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("cream_stained_glass_pane");
    public static Block DARKGREENPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("dark_green_stained_glass_pane");
    public static Block FORESTGREENPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("forest_green_stained_glass_pane");
    public static Block HOTPINKPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("hot_pink_stained_glass_pane");
    public static Block INDIGOPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("indigo_stained_glass_pane");
    public static Block MAROONPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("maroon_stained_glass_pane");
    public static Block NAVYPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("navy_stained_glass_pane");
    public static Block OLIVEPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("olive_stained_glass_pane");
    public static Block PALEGREENPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("pale_green_stained_glass_pane");
    public static Block PALEPINKPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("pale_pink_stained_glass_pane");
    public static Block PALEYELLOWPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("pale_yellow_stained_glass_pane");
    public static Block SKYBLUEPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("sky_blue_stained_glass_pane");
    public static Block SLATEGRAYPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("slate_gray_stained_glass_pane");
    public static Block VIOLETPANE = new StainedGlassPaneBlock(null, GLASS).setRegistryName("violet_stained_glass_pane");
    public static Block AMBERBED = new FBedBlock(BED).setRegistryName("amber_bed");




}
