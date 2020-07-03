package hugman.mubble.init;

import hugman.mubble.Mubble;
import hugman.mubble.init.data.MubbleSoundTypes;
import hugman.mubble.objects.block.CakeBlock;
import hugman.mubble.objects.block.CropsBlock;
import hugman.mubble.objects.block.DirectionalBlock;
import hugman.mubble.objects.block.DoorBlock;
import hugman.mubble.objects.block.GrassBlock;
import hugman.mubble.objects.block.MushroomBlock;
import hugman.mubble.objects.block.NoteBlock;
import hugman.mubble.objects.block.OreBlock;
import hugman.mubble.objects.block.PressurePlateBlock;
import hugman.mubble.objects.block.SaplingBlock;
import hugman.mubble.objects.block.StairsBlock;
import hugman.mubble.objects.block.StoneButtonBlock;
import hugman.mubble.objects.block.TrapDoorBlock;
import hugman.mubble.objects.block.WoodButtonBlock;
import hugman.mubble.objects.block.*;
import hugman.mubble.objects.world.trees.*;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;

import java.util.ArrayList;
import java.util.List;

public class MubbleBlocks {
	/* All Content Bag */
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	/* Sorting Item Lists */
	public static final List<BlockItem> CUBES = new ArrayList<BlockItem>();
	public static final List<BlockItem> STAIRS = new ArrayList<BlockItem>();
	public static final List<BlockItem> SLABS = new ArrayList<BlockItem>();
	public static final List<BlockItem> VERTICAL_SLABS = new ArrayList<BlockItem>();
	public static final List<BlockItem> FENCES = new ArrayList<BlockItem>();
	public static final List<BlockItem> WALLS = new ArrayList<BlockItem>();
	public static final List<BlockItem> SAPLINGS = new ArrayList<BlockItem>();
	public static final List<BlockItem> LEAVES = new ArrayList<BlockItem>();
	public static final List<BlockItem> LEAF_PILES = new ArrayList<BlockItem>();
	public static final List<BlockItem> PRESSURE_PLATES = new ArrayList<BlockItem>();
	public static final List<BlockItem> TRAPDOORS = new ArrayList<BlockItem>();
	public static final List<BlockItem> BUTTONS = new ArrayList<BlockItem>();
	public static final List<BlockItem> FENCE_GATES = new ArrayList<BlockItem>();
	public static final List<BlockItem> DOORS = new ArrayList<BlockItem>();
	public static final List<BlockItem> FLOWERS = new ArrayList<BlockItem>();
	public static final List<BlockItem> FLOWER_PILES = new ArrayList<BlockItem>();
	public static final List<BlockItem> CLOUD_BLOCKS = new ArrayList<BlockItem>();
	public static final List<BlockItem> BALLOONS = new ArrayList<BlockItem>();
	public static final List<BlockItem> OTHERS = new ArrayList<BlockItem>();

	/* Potted Plants (used for render layering) */
	public static final List<Block> POTTED_PLANTS = new ArrayList<Block>();

	/* Templates */
	protected static final Block.Properties pLeaves = Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid();
	protected static final Block.Properties pWoodenButton = Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
	protected static final Block.Properties pStoneButton = Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F);

	/* MUBBLE */
	public static final Block OAK_VERTICAL_SLAB = register("oak_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block SPRUCE_VERTICAL_SLAB = register("spruce_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SPRUCE_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block BIRCH_VERTICAL_SLAB = register("birch_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BIRCH_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block JUNGLE_VERTICAL_SLAB = register("jungle_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.JUNGLE_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block ACACIA_VERTICAL_SLAB = register("acacia_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.ACACIA_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block DARK_OAK_VERTICAL_SLAB = register("dark_oak_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.DARK_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block STONE_VERTICAL_SLAB = register("stone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SMOOTH_STONE_VERTICAL_SLAB = register("smooth_stone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block COBBLESTONE_VERTICAL_SLAB = register("cobblestone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.COBBLESTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = register("mossy_cobblestone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.MOSSY_COBBLESTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block STONE_BRICK_VERTICAL_SLAB = register("stone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = register("mossy_stone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.MOSSY_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRANITE_VERTICAL_SLAB = register("granite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.GRANITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block POLISHED_GRANITE_VERTICAL_SLAB = register("polished_granite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.POLISHED_GRANITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block DIORITE_VERTICAL_SLAB = register("diorite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.DIORITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block POLISHED_DIORITE_VERTICAL_SLAB = register("polished_diorite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.POLISHED_DIORITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ANDESITE_VERTICAL_SLAB = register("andesite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.ANDESITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = register("polished_andesite_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.POLISHED_ANDESITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BRICK_VERTICAL_SLAB = register("brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SANDSTONE_VERTICAL_SLAB = register("sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CUT_SANDSTONE_VERTICAL_SLAB = register("cut_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = register("smooth_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SMOOTH_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_SANDSTONE_VERTICAL_SLAB = register("red_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = register("cut_red_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = register("smooth_red_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block NETHER_BRICK_VERTICAL_SLAB = register("nether_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = register("red_nether_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.RED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block QUARTZ_VERTICAL_SLAB = register("quartz_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = register("smooth_quartz_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SMOOTH_QUARTZ)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block END_STONE_BRICK_VERTICAL_SLAB = register("end_stone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPUR_VERTICAL_SLAB = register("purpur_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PRISMARINE_VERTICAL_SLAB = register("prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = register("prismarine_brick_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PRISMARINE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block DARK_PRISMARINE_VERTICAL_SLAB = register("dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new WallBlock(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);

	public static final Block OAK_WOOD_STAIRS = register("oak_wood_stairs", new StairsBlock(Blocks.OAK_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block SPRUCE_WOOD_STAIRS = register("spruce_wood_stairs", new StairsBlock(Blocks.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block BIRCH_WOOD_STAIRS = register("birch_wood_stairs", new StairsBlock(Blocks.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block JUNGLE_WOOD_STAIRS = register("jungle_wood_stairs", new StairsBlock(Blocks.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block ACACIA_WOOD_STAIRS = register("acacia_wood_stairs", new StairsBlock(Blocks.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block DARK_OAK_WOOD_STAIRS = register("dark_oak_wood_stairs", new StairsBlock(Blocks.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);

	public static final Block OAK_WOOD_SLAB = register("oak_wood_slab", new SlabBlock(Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block SPRUCE_WOOD_SLAB = register("spruce_wood_slab", new SlabBlock(Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block BIRCH_WOOD_SLAB = register("birch_wood_slab", new SlabBlock(Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block JUNGLE_WOOD_SLAB = register("jungle_wood_slab", new SlabBlock(Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block ACACIA_WOOD_SLAB = register("acacia_wood_slab", new SlabBlock(Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block DARK_OAK_WOOD_SLAB = register("dark_oak_wood_slab", new SlabBlock(Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);

	public static final Block OAK_WOOD_VERTICAL_SLAB = register("oak_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block SPRUCE_WOOD_VERTICAL_SLAB = register("spruce_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block BIRCH_WOOD_VERTICAL_SLAB = register("birch_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block JUNGLE_WOOD_VERTICAL_SLAB = register("jungle_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block ACACIA_WOOD_VERTICAL_SLAB = register("acacia_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block DARK_OAK_WOOD_VERTICAL_SLAB = register("dark_oak_wood_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);

	public static final Block OAK_WOOD_BUTTON = register("oak_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block SPRUCE_WOOD_BUTTON = register("spruce_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BIRCH_WOOD_BUTTON = register("birch_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block JUNGLE_WOOD_BUTTON = register("jungle_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block ACACIA_WOOD_BUTTON = register("acacia_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block DARK_OAK_WOOD_BUTTON = register("dark_oak_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block OAK_LEAF_PILE = register("oak_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block SPRUCE_LEAF_PILE = register("spruce_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block BIRCH_LEAF_PILE = register("birch_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block JUNGLE_LEAF_PILE = register("jungle_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block ACACIA_LEAF_PILE = register("acacia_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block DARK_OAK_LEAF_PILE = register("dark_oak_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);

	public static final Block COBBLESTONE_BRICKS = register("cobblestone_bricks", new Block(Properties.from(Blocks.COBBLESTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new StairsBlock(COBBLESTONE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new SlabBlock(Properties.from(COBBLESTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block COBBLESTONE_BRICK_VERTICAL_SLAB = register("cobblestone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(COBBLESTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new WallBlock(Properties.from(COBBLESTONE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new Block(Properties.from(Blocks.MOSSY_COBBLESTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new StairsBlock(MOSSY_COBBLESTONE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new SlabBlock(Properties.from(MOSSY_COBBLESTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB = register("mossy_cobblestone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(MOSSY_COBBLESTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new WallBlock(Properties.from(MOSSY_COBBLESTONE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GRANITE_BRICKS = register("granite_bricks", new Block(Properties.from(Blocks.GRANITE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GRANITE_BRICK_STAIRS = register("granite_brick_stairs", new StairsBlock(GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRANITE_BRICK_SLAB = register("granite_brick_slab", new SlabBlock(Properties.from(GRANITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRANITE_BRICK_VERTICAL_SLAB = register("granite_brick_vertical_slab", new VerticalSlabBlock(Properties.from(GRANITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRANITE_BRICK_WALL = register("granite_brick_wall", new WallBlock(Properties.from(GRANITE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block DIORITE_BRICKS = register("diorite_bricks", new Block(Properties.from(Blocks.DIORITE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", new StairsBlock(DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block DIORITE_BRICK_SLAB = register("diorite_brick_slab", new SlabBlock(Properties.from(DIORITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block DIORITE_BRICK_VERTICAL_SLAB = register("diorite_brick_vertical_slab", new VerticalSlabBlock(Properties.from(DIORITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block DIORITE_BRICK_WALL = register("diorite_brick_wall", new WallBlock(Properties.from(DIORITE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ANDESITE_BRICKS = register("andesite_bricks", new Block(Properties.from(Blocks.ANDESITE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new StairsBlock(ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new SlabBlock(Properties.from(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ANDESITE_BRICK_VERTICAL_SLAB = register("andesite_brick_vertical_slab", new VerticalSlabBlock(Properties.from(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ANDESITE_BRICK_WALL = register("andesite_brick_wall", new WallBlock(Properties.from(ANDESITE_BRICKS)), ItemGroup.DECORATIONS, WALLS);

	public static final Block SANDSTONE_BRICKS = register("sandstone_bricks", new Block(Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", new StairsBlock(SANDSTONE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new SlabBlock(Properties.from(SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block SANDSTONE_BRICK_VERTICAL_SLAB = register("sandstone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new WallBlock(Properties.from(SANDSTONE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block POLISHED_SANDSTONE = register("polished_sandstone", new Block(Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new StairsBlock(POLISHED_SANDSTONE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new SlabBlock(Properties.from(POLISHED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block POLISHED_SANDSTONE_VERTICAL_SLAB = register("polished_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(POLISHED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new Block(Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", new StairsBlock(RED_SANDSTONE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new SlabBlock(Properties.from(RED_SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_SANDSTONE_BRICK_VERTICAL_SLAB = register("red_sandstone_brick_vertical_slab", new VerticalSlabBlock(Properties.from(RED_SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new WallBlock(Properties.from(RED_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new Block(Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new StairsBlock(POLISHED_RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new SlabBlock(Properties.from(POLISHED_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block POLISHED_RED_SANDSTONE_VERTICAL_SLAB = register("polished_red_sandstone_vertical_slab", new VerticalSlabBlock(Properties.from(POLISHED_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block SMOOTH_STONE_PAVING = register("smooth_stone_paving", new Block(Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMOOTH_STONE_PAVING_STAIRS = register("smooth_stone_paving_stairs", new StairsBlock(SMOOTH_STONE_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block SMOOTH_STONE_PAVING_SLAB = register("smooth_stone_paving_slab", new SlabBlock(Properties.from(SMOOTH_STONE_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block SMOOTH_STONE_PAVING_VERTICAL_SLAB = register("smooth_stone_paving_vertical_slab", new VerticalSlabBlock(Properties.from(SMOOTH_STONE_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block CHISELED_PRISMARINE = register("chiseled_prismarine", new Block(Properties.from(Blocks.PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CHISELED_PRISMARINE_STAIRS = register("chiseled_prismarine_stairs", new StairsBlock(CHISELED_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CHISELED_PRISMARINE_SLAB = register("chiseled_prismarine_slab", new SlabBlock(Properties.from(CHISELED_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CHISELED_PRISMARINE_VERTICAL_SLAB = register("chiseled_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(CHISELED_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CHISELED_PRISMARINE_WALL = register("chiseled_prismarine_wall", new WallBlock(Properties.from(CHISELED_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);

	public static final Block PRISMARINE_BRICK_PAVING = register("prismarine_brick_paving", new Block(Properties.from(Blocks.PRISMARINE_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PRISMARINE_BRICK_PAVING_STAIRS = register("prismarine_brick_paving_stairs", new StairsBlock(PRISMARINE_BRICK_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PRISMARINE_BRICK_PAVING_SLAB = register("prismarine_brick_paving_slab", new SlabBlock(Properties.from(PRISMARINE_BRICK_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PRISMARINE_BRICK_PAVING_VERTICAL_SLAB = register("prismarine_brick_paving_vertical_slab", new VerticalSlabBlock(Properties.from(PRISMARINE_BRICK_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block BLUNITE = register("blunite", new Block(Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CARBONITE = register("carbonite", new Block(Properties.create(Material.ROCK, MaterialColor.OBSIDIAN).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUNITE_STAIRS = register("blunite_stairs", new StairsBlock(BLUNITE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CARBONITE_STAIRS = register("carbonite_stairs", new StairsBlock(CARBONITE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUNITE_SLAB = register("blunite_slab", new SlabBlock(Properties.from(BLUNITE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CARBONITE_SLAB = register("carbonite_slab", new SlabBlock(Properties.from(CARBONITE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUNITE_VERTICAL_SLAB = register("blunite_vertical_slab", new VerticalSlabBlock(Properties.from(BLUNITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CARBONITE_VERTICAL_SLAB = register("carbonite_vertical_slab", new VerticalSlabBlock(Properties.from(CARBONITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUNITE_WALL = register("blunite_wall", new WallBlock(Properties.from(BLUNITE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block CARBONITE_WALL = register("carbonite_wall", new WallBlock(Properties.from(CARBONITE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block POLISHED_BLUNITE = register("polished_blunite", new Block(Properties.from(BLUNITE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block POLISHED_CARBONITE = register("polished_carbonite", new Block(Properties.from(CARBONITE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block POLISHED_BLUNITE_STAIRS = register("polished_blunite_stairs", new StairsBlock(POLISHED_BLUNITE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block POLISHED_CARBONITE_STAIRS = register("polished_carbonite_stairs", new StairsBlock(POLISHED_CARBONITE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block POLISHED_BLUNITE_SLAB = register("polished_blunite_slab", new SlabBlock(Properties.from(POLISHED_BLUNITE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block POLISHED_CARBONITE_SLAB = register("polished_carbonite_slab", new SlabBlock(Properties.from(POLISHED_CARBONITE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block POLISHED_BLUNITE_VERTICAL_SLAB = register("polished_blunite_vertical_slab", new VerticalSlabBlock(Properties.from(POLISHED_BLUNITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block POLISHED_CARBONITE_VERTICAL_SLAB = register("polished_carbonite_vertical_slab", new VerticalSlabBlock(Properties.from(POLISHED_CARBONITE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block PERMAROCK = register("permarock", new Block(Properties.create(Material.ROCK, MaterialColor.ICE).hardnessAndResistance(0.4F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PERMAFROST_BRICKS = register("permafrost_bricks", new Block(Properties.from(Blocks.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PERMAFROST_BRICK_STAIRS = register("permafrost_brick_stairs", new StairsBlock(PERMAFROST_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PERMAFROST_BRICK_SLAB = register("permafrost_brick_slab", new SlabBlock(Properties.from(PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PERMAFROST_BRICK_VERTICAL_SLAB = register("permafrost_brick_vertical_slab", new VerticalSlabBlock(Properties.from(PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PERMAFROST_BRICK_FENCE = register("permafrost_brick_fence", new FenceBlock(Properties.from(PERMAFROST_BRICKS)), ItemGroup.DECORATIONS, FENCES);
	public static final Block BLUE_PERMAFROST_BRICKS = register("blue_permafrost_bricks", new Block(Properties.from(PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_PERMAFROST_BRICK_STAIRS = register("blue_permafrost_brick_stairs", new StairsBlock(BLUE_PERMAFROST_BRICKS), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_PERMAFROST_BRICK_SLAB = register("blue_permafrost_brick_slab", new SlabBlock(Properties.from(BLUE_PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_PERMAFROST_BRICK_VERTICAL_SLAB = register("blue_permafrost_brick_vertical_slab", new VerticalSlabBlock(Properties.from(BLUE_PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_PERMAFROST_BRICK_WALL = register("blue_permafrost_brick_wall", new WallBlock(Properties.from(BLUE_PERMAFROST_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PERMAFROST_BISMUTH_ORE = register("permafrost_bismuth_ore", new Block(Properties.create(Material.ROCK, MaterialColor.ICE).hardnessAndResistance(0.3F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block FROZEN_OBSIDIAN = register("frozen_obsidian", new Block(Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(75.0F, 1800.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);

	public static final Block VANADIUM_ORE = register("vanadium_ore", new OreBlock(Properties.from(Blocks.DIAMOND_ORE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block VANADIUM_BLOCK = register("vanadium_block", new Block(Properties.from(Blocks.DIAMOND_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);

	public static final Block AUTUMN_OAK_SAPLING = register("autumn_oak_sapling", new SaplingBlock(new AutumnOakTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block AUTUMN_OAK_LEAVES = register("autumn_oak_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block AUTUMN_OAK_LEAF_PILE = register("autumn_oak_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);

	public static final Block AUTUMN_BIRCH_SAPLING = register("autumn_birch_sapling", new SaplingBlock(new AutumnBirchTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block AUTUMN_BIRCH_LEAVES = register("autumn_birch_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block AUTUMN_BIRCH_LEAF_PILE = register("autumn_birch_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);

	public static final Block CHERRY_OAK_PLANKS = register("cherry_oak_planks", new Block(Properties.from(Blocks.DARK_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 20);
	public static final Block PINK_CHERRY_OAK_SAPLING = register("pink_cherry_oak_sapling", new SaplingBlock(new PinkCherryOakTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block WHITE_CHERRY_OAK_SAPLING = register("white_cherry_oak_sapling", new SaplingBlock(new WhiteCherryOakTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block CHERRY_OAK_LOG = register("cherry_oak_log", new RotatedPillarBlock(Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_CHERRY_OAK_LOG = register("stripped_cherry_oak_log", new RotatedPillarBlock(Properties.from(CHERRY_OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block CHERRY_OAK_WOOD = register("cherry_oak_wood", new RotatedPillarBlock(Properties.from(CHERRY_OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_CHERRY_OAK_WOOD = register("stripped_cherry_oak_wood", new RotatedPillarBlock(Properties.from(CHERRY_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block PINK_CHERRY_OAK_LEAVES = register("pink_cherry_oak_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block PINK_CHERRY_OAK_LEAF_PILE = register("pink_cherry_oak_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block WHITE_CHERRY_OAK_LEAVES = register("white_cherry_oak_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block WHITE_CHERRY_OAK_LEAF_PILE = register("white_cherry_oak_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block CHERRY_OAK_PRESSURE_PLATE = register("cherry_oak_pressure_plate", new PressurePlateBlock(Sensitivity.EVERYTHING, Properties.from(MubbleBlocks.CHERRY_OAK_PLANKS).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block CHERRY_OAK_TRAPDOOR = register("cherry_oak_trapdoor", new TrapDoorBlock(Properties.from(MubbleBlocks.CHERRY_OAK_PLANKS).notSolid()), ItemGroup.REDSTONE, TRAPDOORS);
	public static final Block CHERRY_OAK_BUTTON = register("cherry_oak_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block CHERRY_OAK_STAIRS = register("cherry_oak_stairs", new StairsBlock(CHERRY_OAK_PLANKS), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block CHERRY_OAK_SLAB = register("cherry_oak_slab", new SlabBlock(Properties.from(CHERRY_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block CHERRY_OAK_VERTICAL_SLAB = register("cherry_oak_vertical_slab", new VerticalSlabBlock(Properties.from(CHERRY_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block CHERRY_OAK_FENCE_GATE = register("cherry_oak_fence_gate", new FenceGateBlock(Properties.from(CHERRY_OAK_PLANKS)), ItemGroup.REDSTONE, FENCE_GATES, 5, 20);
	public static final Block CHERRY_OAK_FENCE = register("cherry_oak_fence", new FenceBlock(Properties.from(CHERRY_OAK_PLANKS)), ItemGroup.DECORATIONS, FENCES, 5, 20);
	public static final Block CHERRY_OAK_DOOR = register("cherry_oak_door", new DoorBlock(Properties.from(CHERRY_OAK_PLANKS).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block CHERRY_OAK_WOOD_STAIRS = register("cherry_oak_wood_stairs", new StairsBlock(CHERRY_OAK_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block CHERRY_OAK_WOOD_SLAB = register("cherry_oak_wood_slab", new SlabBlock(Properties.from(CHERRY_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block CHERRY_OAK_WOOD_VERTICAL_SLAB = register("cherry_oak_wood_vertical_slab", new VerticalSlabBlock(Properties.from(CHERRY_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block CHERRY_OAK_WOOD_BUTTON = register("cherry_oak_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block PALM_PLANKS = register("palm_planks", new Block(Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 20);
	public static final Block PALM_SAPLING = register("palm_sapling", new SaplingBlock(new PalmTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block PALM_LOG = register("palm_log", new RotatedPillarBlock(Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_PALM_LOG = register("stripped_palm_log", new RotatedPillarBlock(Properties.from(MubbleBlocks.PALM_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block PALM_WOOD = register("palm_wood", new RotatedPillarBlock(Properties.from(MubbleBlocks.PALM_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_PALM_WOOD = register("stripped_palm_wood", new RotatedPillarBlock(Properties.from(MubbleBlocks.PALM_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block PALM_LEAVES = register("palm_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block PALM_LEAF_PILE = register("palm_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block PALM_PRESSURE_PLATE = register("palm_pressure_plate", new PressurePlateBlock(Sensitivity.EVERYTHING, Properties.from(MubbleBlocks.PALM_PLANKS).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PALM_TRAPDOOR = register("palm_trapdoor", new TrapDoorBlock(Properties.from(MubbleBlocks.PALM_PLANKS).notSolid()), ItemGroup.REDSTONE, TRAPDOORS);
	public static final Block PALM_BUTTON = register("palm_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PALM_STAIRS = register("palm_stairs", new StairsBlock(PALM_PLANKS), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block PALM_SLAB = register("palm_slab", new SlabBlock(Properties.from(PALM_PLANKS)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block PALM_VERTICAL_SLAB = register("palm_vertical_slab", new VerticalSlabBlock(Properties.from(PALM_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block PALM_FENCE_GATE = register("palm_fence_gate", new FenceGateBlock(Properties.from(PALM_PLANKS)), ItemGroup.REDSTONE, FENCE_GATES, 5, 20);
	public static final Block PALM_FENCE = register("palm_fence", new FenceBlock(Properties.from(PALM_PLANKS)), ItemGroup.DECORATIONS, FENCES, 5, 20);
	public static final Block PALM_DOOR = register("palm_door", new DoorBlock(Properties.from(PALM_PLANKS).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block PALM_WOOD_STAIRS = register("palm_wood_stairs", new StairsBlock(PALM_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block PALM_WOOD_SLAB = register("palm_wood_slab", new SlabBlock(Properties.from(PALM_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block PALM_WOOD_VERTICAL_SLAB = register("palm_wood_vertical_slab", new VerticalSlabBlock(Properties.from(PALM_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block PALM_WOOD_BUTTON = register("palm_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block WHITE_BRICKS = register("white_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_GRAY_BRICKS = register("light_gray_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GRAY_BRICKS = register("gray_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLACK_BRICKS = register("black_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BROWN_BRICKS = register("brown_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block RED_BRICKS = register("red_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block ORANGE_BRICKS = register("orange_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block YELLOW_BRICKS = register("yellow_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIME_BRICKS = register("lime_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GREEN_BRICKS = register("green_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CYAN_BRICKS = register("cyan_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_BLUE_BRICKS = register("light_blue_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_BRICKS = register("blue_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PURPLE_BRICKS = register("purple_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MAGENTA_BRICKS = register("magenta_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PINK_BRICKS = register("pink_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);

	public static final Block WHITE_BRICK_STAIRS = register("white_brick_stairs", new StairsBlock(WHITE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs", new StairsBlock(LIGHT_GRAY_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRAY_BRICK_STAIRS = register("gray_brick_stairs", new StairsBlock(GRAY_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLACK_BRICK_STAIRS = register("black_brick_stairs", new StairsBlock(BLACK_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BROWN_BRICK_STAIRS = register("brown_brick_stairs", new StairsBlock(BROWN_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_BRICK_STAIRS = register("red_brick_stairs", new StairsBlock(RED_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ORANGE_BRICK_STAIRS = register("orange_brick_stairs", new StairsBlock(ORANGE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block YELLOW_BRICK_STAIRS = register("yellow_brick_stairs", new StairsBlock(YELLOW_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIME_BRICK_STAIRS = register("lime_brick_stairs", new StairsBlock(LIME_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GREEN_BRICK_STAIRS = register("green_brick_stairs", new StairsBlock(GREEN_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CYAN_BRICK_STAIRS = register("cyan_brick_stairs", new StairsBlock(CYAN_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs", new StairsBlock(LIGHT_BLUE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUE_BRICK_STAIRS = register("blue_brick_stairs", new StairsBlock(BLUE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PURPLE_BRICK_STAIRS = register("purple_brick_stairs", new StairsBlock(PURPLE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs", new StairsBlock(MAGENTA_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PINK_BRICK_STAIRS = register("pink_brick_stairs", new StairsBlock(PINK_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);

	public static final Block WHITE_BRICK_SLAB = register("white_brick_slab", new SlabBlock(Properties.from(WHITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab", new SlabBlock(Properties.from(LIGHT_GRAY_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRAY_BRICK_SLAB = register("gray_brick_slab", new SlabBlock(Properties.from(GRAY_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLACK_BRICK_SLAB = register("black_brick_slab", new SlabBlock(Properties.from(BLACK_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BROWN_BRICK_SLAB = register("brown_brick_slab", new SlabBlock(Properties.from(BROWN_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_BRICK_SLAB = register("red_brick_slab", new SlabBlock(Properties.from(RED_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ORANGE_BRICK_SLAB = register("orange_brick_slab", new SlabBlock(Properties.from(ORANGE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block YELLOW_BRICK_SLAB = register("yellow_brick_slab", new SlabBlock(Properties.from(YELLOW_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIME_BRICK_SLAB = register("lime_brick_slab", new SlabBlock(Properties.from(LIME_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GREEN_BRICK_SLAB = register("green_brick_slab", new SlabBlock(Properties.from(GREEN_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CYAN_BRICK_SLAB = register("cyan_brick_slab", new SlabBlock(Properties.from(CYAN_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab", new SlabBlock(Properties.from(LIGHT_BLUE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUE_BRICK_SLAB = register("blue_brick_slab", new SlabBlock(Properties.from(BLUE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PURPLE_BRICK_SLAB = register("purple_brick_slab", new SlabBlock(Properties.from(PURPLE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MAGENTA_BRICK_SLAB = register("magenta_brick_slab", new SlabBlock(Properties.from(MAGENTA_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PINK_BRICK_SLAB = register("pink_brick_slab", new SlabBlock(Properties.from(PINK_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);

	public static final Block WHITE_BRICK_VERTICAL_SLAB = register("white_brick_vertical_slab", new VerticalSlabBlock(Properties.from(WHITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_GRAY_BRICK_VERTICAL_SLAB = register("light_gray_brick_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_GRAY_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRAY_BRICK_VERTICAL_SLAB = register("gray_brick_vertical_slab", new VerticalSlabBlock(Properties.from(GRAY_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLACK_BRICK_VERTICAL_SLAB = register("black_brick_vertical_slab", new VerticalSlabBlock(Properties.from(BLACK_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BROWN_BRICK_VERTICAL_SLAB = register("brown_brick_vertical_slab", new VerticalSlabBlock(Properties.from(BROWN_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_BRICK_VERTICAL_SLAB = register("red_brick_vertical_slab", new VerticalSlabBlock(Properties.from(RED_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ORANGE_BRICK_VERTICAL_SLAB = register("orange_brick_vertical_slab", new VerticalSlabBlock(Properties.from(ORANGE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block YELLOW_BRICK_VERTICAL_SLAB = register("yellow_brick_vertical_slab", new VerticalSlabBlock(Properties.from(YELLOW_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIME_BRICK_VERTICAL_SLAB = register("lime_brick_vertical_slab", new VerticalSlabBlock(Properties.from(LIME_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GREEN_BRICK_VERTICAL_SLAB = register("green_brick_vertical_slab", new VerticalSlabBlock(Properties.from(GREEN_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CYAN_BRICK_VERTICAL_SLAB = register("cyan_brick_vertical_slab", new VerticalSlabBlock(Properties.from(CYAN_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_BLUE_BRICK_VERTICAL_SLAB = register("light_blue_brick_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_BLUE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUE_BRICK_VERTICAL_SLAB = register("blue_brick_vertical_slab", new VerticalSlabBlock(Properties.from(BLUE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPLE_BRICK_VERTICAL_SLAB = register("purple_brick_vertical_slab", new VerticalSlabBlock(Properties.from(PURPLE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MAGENTA_BRICK_VERTICAL_SLAB = register("magenta_brick_vertical_slab", new VerticalSlabBlock(Properties.from(MAGENTA_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PINK_BRICK_VERTICAL_SLAB = register("pink_brick_vertical_slab", new VerticalSlabBlock(Properties.from(PINK_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block WHITE_BRICK_WALL = register("white_brick_wall", new WallBlock(Properties.from(WHITE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall", new WallBlock(Properties.from(LIGHT_GRAY_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GRAY_BRICK_WALL = register("gray_brick_wall", new WallBlock(Properties.from(GRAY_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLACK_BRICK_WALL = register("black_brick_wall", new WallBlock(Properties.from(BLACK_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BROWN_BRICK_WALL = register("brown_brick_wall", new WallBlock(Properties.from(BROWN_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block RED_BRICK_WALL = register("red_brick_wall", new WallBlock(Properties.from(RED_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ORANGE_BRICK_WALL = register("orange_brick_wall", new WallBlock(Properties.from(ORANGE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block YELLOW_BRICK_WALL = register("yellow_brick_wall", new WallBlock(Properties.from(YELLOW_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIME_BRICK_WALL = register("lime_brick_wall", new WallBlock(Properties.from(LIME_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GREEN_BRICK_WALL = register("green_brick_wall", new WallBlock(Properties.from(GREEN_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block CYAN_BRICK_WALL = register("cyan_brick_wall", new WallBlock(Properties.from(CYAN_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall", new WallBlock(Properties.from(LIGHT_BLUE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLUE_BRICK_WALL = register("blue_brick_wall", new WallBlock(Properties.from(BLUE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PURPLE_BRICK_WALL = register("purple_brick_wall", new WallBlock(Properties.from(PURPLE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block MAGENTA_BRICK_WALL = register("magenta_brick_wall", new WallBlock(Properties.from(MAGENTA_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PINK_BRICK_WALL = register("pink_brick_wall", new WallBlock(Properties.from(PINK_BRICKS)), ItemGroup.DECORATIONS, WALLS);

	public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS, STAIRS);

	public static final Block TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(Properties.from(Blocks.WHITE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(Properties.from(Blocks.GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(Properties.from(Blocks.BLACK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(Properties.from(Blocks.BROWN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(Properties.from(Blocks.RED_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(Properties.from(Blocks.ORANGE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(Properties.from(Blocks.YELLOW_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(Properties.from(Blocks.LIME_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(Properties.from(Blocks.GREEN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(Properties.from(Blocks.CYAN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(Properties.from(Blocks.BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(Properties.from(Blocks.PURPLE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(Properties.from(Blocks.MAGENTA_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(Properties.from(Blocks.PINK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, SLABS);

	public static final Block TERRACOTTA_VERTICAL_SLAB = register("terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.WHITE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block WHITE_TERRACOTTA_VERTICAL_SLAB = register("white_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.WHITE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_GRAY_TERRACOTTA_VERTICAL_SLAB = register("light_gray_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRAY_TERRACOTTA_VERTICAL_SLAB = register("gray_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLACK_TERRACOTTA_VERTICAL_SLAB = register("black_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BLACK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BROWN_TERRACOTTA_VERTICAL_SLAB = register("brown_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BROWN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_TERRACOTTA_VERTICAL_SLAB = register("red_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.RED_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ORANGE_TERRACOTTA_VERTICAL_SLAB = register("orange_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.ORANGE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block YELLOW_TERRACOTTA_VERTICAL_SLAB = register("yellow_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.YELLOW_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIME_TERRACOTTA_VERTICAL_SLAB = register("lime_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIME_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GREEN_TERRACOTTA_VERTICAL_SLAB = register("green_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.GREEN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CYAN_TERRACOTTA_VERTICAL_SLAB = register("cyan_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.CYAN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_BLUE_TERRACOTTA_VERTICAL_SLAB = register("light_blue_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUE_TERRACOTTA_VERTICAL_SLAB = register("blue_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPLE_TERRACOTTA_VERTICAL_SLAB = register("purple_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PURPLE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MAGENTA_TERRACOTTA_VERTICAL_SLAB = register("magenta_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.MAGENTA_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PINK_TERRACOTTA_VERTICAL_SLAB = register("pink_terracotta_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PINK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block TERRACOTTA_WALL = register("terracotta_wall", new WallBlock(Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", new WallBlock(Properties.from(Blocks.WHITE_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", new WallBlock(Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", new WallBlock(Properties.from(Blocks.GRAY_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", new WallBlock(Properties.from(Blocks.BLACK_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", new WallBlock(Properties.from(Blocks.BROWN_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block RED_TERRACOTTA_WALL = register("red_terracotta_wall", new WallBlock(Properties.from(Blocks.RED_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", new WallBlock(Properties.from(Blocks.ORANGE_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", new WallBlock(Properties.from(Blocks.YELLOW_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", new WallBlock(Properties.from(Blocks.LIME_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", new WallBlock(Properties.from(Blocks.GREEN_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", new WallBlock(Properties.from(Blocks.CYAN_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", new WallBlock(Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", new WallBlock(Properties.from(Blocks.BLUE_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", new WallBlock(Properties.from(Blocks.PURPLE_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", new WallBlock(Properties.from(Blocks.MAGENTA_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", new WallBlock(Properties.from(Blocks.PINK_TERRACOTTA)), ItemGroup.DECORATIONS, WALLS);

	public static final Block TERRACOTTA_PRESSURE_PLATE = register("terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block WHITE_TERRACOTTA_PRESSURE_PLATE = register("white_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.WHITE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = register("light_gray_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block GRAY_TERRACOTTA_PRESSURE_PLATE = register("gray_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.GRAY_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BLACK_TERRACOTTA_PRESSURE_PLATE = register("black_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BLACK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BROWN_TERRACOTTA_PRESSURE_PLATE = register("brown_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BROWN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block RED_TERRACOTTA_PRESSURE_PLATE = register("red_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block ORANGE_TERRACOTTA_PRESSURE_PLATE = register("orange_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.ORANGE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block YELLOW_TERRACOTTA_PRESSURE_PLATE = register("yellow_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.YELLOW_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIME_TERRACOTTA_PRESSURE_PLATE = register("lime_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIME_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block GREEN_TERRACOTTA_PRESSURE_PLATE = register("green_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block CYAN_TERRACOTTA_PRESSURE_PLATE = register("cyan_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.CYAN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = register("light_blue_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BLUE_TERRACOTTA_PRESSURE_PLATE = register("blue_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PURPLE_TERRACOTTA_PRESSURE_PLATE = register("purple_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.PURPLE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block MAGENTA_TERRACOTTA_PRESSURE_PLATE = register("magenta_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.MAGENTA_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PINK_TERRACOTTA_PRESSURE_PLATE = register("pink_terracotta_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);

	public static final Block TERRACOTTA_BUTTON = register("terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block WHITE_TERRACOTTA_BUTTON = register("white_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIGHT_GRAY_TERRACOTTA_BUTTON = register("light_gray_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block GRAY_TERRACOTTA_BUTTON = register("gray_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BLACK_TERRACOTTA_BUTTON = register("black_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BROWN_TERRACOTTA_BUTTON = register("brown_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block RED_TERRACOTTA_BUTTON = register("red_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block ORANGE_TERRACOTTA_BUTTON = register("orange_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block YELLOW_TERRACOTTA_BUTTON = register("yellow_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIME_TERRACOTTA_BUTTON = register("lime_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block GREEN_TERRACOTTA_BUTTON = register("green_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block CYAN_TERRACOTTA_BUTTON = register("cyan_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIGHT_BLUE_TERRACOTTA_BUTTON = register("light_blue_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BLUE_TERRACOTTA_BUTTON = register("blue_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PURPLE_TERRACOTTA_BUTTON = register("purple_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block MAGENTA_TERRACOTTA_BUTTON = register("magenta_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PINK_TERRACOTTA_BUTTON = register("pink_terracotta_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block WHITE_DARK_PRISMARINE = register("white_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_GRAY_DARK_PRISMARINE = register("light_gray_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GRAY_DARK_PRISMARINE = register("gray_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLACK_DARK_PRISMARINE = register("black_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BROWN_DARK_PRISMARINE = register("brown_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block RED_DARK_PRISMARINE = register("red_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block ORANGE_DARK_PRISMARINE = register("orange_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block YELLOW_DARK_PRISMARINE = register("yellow_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIME_DARK_PRISMARINE = register("lime_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GREEN_DARK_PRISMARINE = register("green_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CYAN_DARK_PRISMARINE = register("cyan_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_BLUE_DARK_PRISMARINE = register("light_blue_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_DARK_PRISMARINE = register("blue_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PURPLE_DARK_PRISMARINE = register("purple_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MAGENTA_DARK_PRISMARINE = register("magenta_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PINK_DARK_PRISMARINE = register("pink_dark_prismarine", new Block(Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, CUBES);

	public static final Block WHITE_DARK_PRISMARINE_STAIRS = register("white_dark_prismarine_stairs", new StairsBlock(WHITE_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_GRAY_DARK_PRISMARINE_STAIRS = register("light_gray_dark_prismarine_stairs", new StairsBlock(LIGHT_GRAY_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRAY_DARK_PRISMARINE_STAIRS = register("gray_dark_prismarine_stairs", new StairsBlock(GRAY_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLACK_DARK_PRISMARINE_STAIRS = register("black_dark_prismarine_stairs", new StairsBlock(BLACK_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BROWN_DARK_PRISMARINE_STAIRS = register("brown_dark_prismarine_stairs", new StairsBlock(BROWN_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_DARK_PRISMARINE_STAIRS = register("red_dark_prismarine_stairs", new StairsBlock(RED_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ORANGE_DARK_PRISMARINE_STAIRS = register("orange_dark_prismarine_stairs", new StairsBlock(ORANGE_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block YELLOW_DARK_PRISMARINE_STAIRS = register("yellow_dark_prismarine_stairs", new StairsBlock(YELLOW_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIME_DARK_PRISMARINE_STAIRS = register("lime_dark_prismarine_stairs", new StairsBlock(LIME_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GREEN_DARK_PRISMARINE_STAIRS = register("green_dark_prismarine_stairs", new StairsBlock(GREEN_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CYAN_DARK_PRISMARINE_STAIRS = register("cyan_dark_prismarine_stairs", new StairsBlock(CYAN_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_BLUE_DARK_PRISMARINE_STAIRS = register("light_blue_dark_prismarine_stairs", new StairsBlock(LIGHT_BLUE_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUE_DARK_PRISMARINE_STAIRS = register("blue_dark_prismarine_stairs", new StairsBlock(BLUE_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PURPLE_DARK_PRISMARINE_STAIRS = register("purple_dark_prismarine_stairs", new StairsBlock(PURPLE_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MAGENTA_DARK_PRISMARINE_STAIRS = register("magenta_dark_prismarine_stairs", new StairsBlock(MAGENTA_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PINK_DARK_PRISMARINE_STAIRS = register("pink_dark_prismarine_stairs", new StairsBlock(PINK_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS, STAIRS);

	public static final Block WHITE_DARK_PRISMARINE_SLAB = register("white_dark_prismarine_slab", new SlabBlock(Properties.from(WHITE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_GRAY_DARK_PRISMARINE_SLAB = register("light_gray_dark_prismarine_slab", new SlabBlock(Properties.from(LIGHT_GRAY_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRAY_DARK_PRISMARINE_SLAB = register("gray_dark_prismarine_slab", new SlabBlock(Properties.from(GRAY_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLACK_DARK_PRISMARINE_SLAB = register("black_dark_prismarine_slab", new SlabBlock(Properties.from(BLACK_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BROWN_DARK_PRISMARINE_SLAB = register("brown_dark_prismarine_slab", new SlabBlock(Properties.from(BROWN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_DARK_PRISMARINE_SLAB = register("red_dark_prismarine_slab", new SlabBlock(Properties.from(RED_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ORANGE_DARK_PRISMARINE_SLAB = register("orange_dark_prismarine_slab", new SlabBlock(Properties.from(ORANGE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block YELLOW_DARK_PRISMARINE_SLAB = register("yellow_dark_prismarine_slab", new SlabBlock(Properties.from(YELLOW_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIME_DARK_PRISMARINE_SLAB = register("lime_dark_prismarine_slab", new SlabBlock(Properties.from(LIME_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GREEN_DARK_PRISMARINE_SLAB = register("green_dark_prismarine_slab", new SlabBlock(Properties.from(GREEN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CYAN_DARK_PRISMARINE_SLAB = register("cyan_dark_prismarine_slab", new SlabBlock(Properties.from(CYAN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_BLUE_DARK_PRISMARINE_SLAB = register("light_blue_dark_prismarine_slab", new SlabBlock(Properties.from(LIGHT_BLUE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUE_DARK_PRISMARINE_SLAB = register("blue_dark_prismarine_slab", new SlabBlock(Properties.from(BLUE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PURPLE_DARK_PRISMARINE_SLAB = register("purple_dark_prismarine_slab", new SlabBlock(Properties.from(PURPLE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MAGENTA_DARK_PRISMARINE_SLAB = register("magenta_dark_prismarine_slab", new SlabBlock(Properties.from(MAGENTA_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PINK_DARK_PRISMARINE_SLAB = register("pink_dark_prismarine_slab", new SlabBlock(Properties.from(PINK_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, SLABS);

	public static final Block WHITE_DARK_PRISMARINE_VERTICAL_SLAB = register("white_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(WHITE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_GRAY_DARK_PRISMARINE_VERTICAL_SLAB = register("light_gray_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_GRAY_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRAY_DARK_PRISMARINE_VERTICAL_SLAB = register("gray_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(GRAY_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLACK_DARK_PRISMARINE_VERTICAL_SLAB = register("black_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(BLACK_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BROWN_DARK_PRISMARINE_VERTICAL_SLAB = register("brown_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(BROWN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_DARK_PRISMARINE_VERTICAL_SLAB = register("red_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(RED_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ORANGE_DARK_PRISMARINE_VERTICAL_SLAB = register("orange_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(ORANGE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block YELLOW_DARK_PRISMARINE_VERTICAL_SLAB = register("yellow_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(YELLOW_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIME_DARK_PRISMARINE_VERTICAL_SLAB = register("lime_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(LIME_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GREEN_DARK_PRISMARINE_VERTICAL_SLAB = register("green_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(GREEN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CYAN_DARK_PRISMARINE_VERTICAL_SLAB = register("cyan_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(CYAN_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_BLUE_DARK_PRISMARINE_VERTICAL_SLAB = register("light_blue_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_BLUE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUE_DARK_PRISMARINE_VERTICAL_SLAB = register("blue_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(BLUE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPLE_DARK_PRISMARINE_VERTICAL_SLAB = register("purple_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(PURPLE_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MAGENTA_DARK_PRISMARINE_VERTICAL_SLAB = register("magenta_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(MAGENTA_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PINK_DARK_PRISMARINE_VERTICAL_SLAB = register("pink_dark_prismarine_vertical_slab", new VerticalSlabBlock(Properties.from(PINK_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block WHITE_DARK_PRISMARINE_WALL = register("white_dark_prismarine_wall", new WallBlock(Properties.from(WHITE_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_GRAY_DARK_PRISMARINE_WALL = register("light_gray_dark_prismarine_wall", new WallBlock(Properties.from(LIGHT_GRAY_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GRAY_DARK_PRISMARINE_WALL = register("gray_dark_prismarine_wall", new WallBlock(Properties.from(GRAY_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLACK_DARK_PRISMARINE_WALL = register("black_dark_prismarine_wall", new WallBlock(Properties.from(BLACK_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BROWN_DARK_PRISMARINE_WALL = register("brown_dark_prismarine_wall", new WallBlock(Properties.from(BROWN_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block RED_DARK_PRISMARINE_WALL = register("red_dark_prismarine_wall", new WallBlock(Properties.from(RED_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ORANGE_DARK_PRISMARINE_WALL = register("orange_dark_prismarine_wall", new WallBlock(Properties.from(ORANGE_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block YELLOW_DARK_PRISMARINE_WALL = register("yellow_dark_prismarine_wall", new WallBlock(Properties.from(YELLOW_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIME_DARK_PRISMARINE_WALL = register("lime_dark_prismarine_wall", new WallBlock(Properties.from(LIME_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GREEN_DARK_PRISMARINE_WALL = register("green_dark_prismarine_wall", new WallBlock(Properties.from(GREEN_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block CYAN_DARK_PRISMARINE_WALL = register("cyan_dark_prismarine_wall", new WallBlock(Properties.from(CYAN_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_BLUE_DARK_PRISMARINE_WALL = register("light_blue_dark_prismarine_wall", new WallBlock(Properties.from(LIGHT_BLUE_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLUE_DARK_PRISMARINE_WALL = register("blue_dark_prismarine_wall", new WallBlock(Properties.from(BLUE_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PURPLE_DARK_PRISMARINE_WALL = register("purple_dark_prismarine_wall", new WallBlock(Properties.from(PURPLE_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block MAGENTA_DARK_PRISMARINE_WALL = register("magenta_dark_prismarine_wall", new WallBlock(Properties.from(MAGENTA_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PINK_DARK_PRISMARINE_WALL = register("pink_dark_prismarine_wall", new WallBlock(Properties.from(PINK_DARK_PRISMARINE)), ItemGroup.DECORATIONS, WALLS);

	public static final Block WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_CONCRETE_STAIRS = register("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE), ItemGroup.BUILDING_BLOCKS, STAIRS);

	public static final Block WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(Properties.from(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(Properties.from(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(Properties.from(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(Properties.from(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(Properties.from(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(Properties.from(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(Properties.from(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(Properties.from(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(Properties.from(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(Properties.from(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(Properties.from(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(Properties.from(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(Properties.from(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(Properties.from(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS, SLABS);

	public static final Block WHITE_CONCRETE_VERTICAL_SLAB = register("white_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_GRAY_CONCRETE_VERTICAL_SLAB = register("light_gray_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRAY_CONCRETE_VERTICAL_SLAB = register("gray_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLACK_CONCRETE_VERTICAL_SLAB = register("black_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BROWN_CONCRETE_VERTICAL_SLAB = register("brown_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_CONCRETE_VERTICAL_SLAB = register("red_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ORANGE_CONCRETE_VERTICAL_SLAB = register("orange_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block YELLOW_CONCRETE_VERTICAL_SLAB = register("yellow_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIME_CONCRETE_VERTICAL_SLAB = register("lime_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GREEN_CONCRETE_VERTICAL_SLAB = register("green_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CYAN_CONCRETE_VERTICAL_SLAB = register("cyan_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_BLUE_CONCRETE_VERTICAL_SLAB = register("light_blue_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUE_CONCRETE_VERTICAL_SLAB = register("blue_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPLE_CONCRETE_VERTICAL_SLAB = register("purple_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MAGENTA_CONCRETE_VERTICAL_SLAB = register("magenta_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PINK_CONCRETE_VERTICAL_SLAB = register("pink_concrete_vertical_slab", new VerticalSlabBlock(Properties.from(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block WHITE_CONCRETE_WALL = register("white_concrete_wall", new WallBlock(Properties.from(Blocks.WHITE_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", new WallBlock(Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GRAY_CONCRETE_WALL = register("gray_concrete_wall", new WallBlock(Properties.from(Blocks.GRAY_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLACK_CONCRETE_WALL = register("black_concrete_wall", new WallBlock(Properties.from(Blocks.BLACK_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BROWN_CONCRETE_WALL = register("brown_concrete_wall", new WallBlock(Properties.from(Blocks.BROWN_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block RED_CONCRETE_WALL = register("red_concrete_wall", new WallBlock(Properties.from(Blocks.RED_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ORANGE_CONCRETE_WALL = register("orange_concrete_wall", new WallBlock(Properties.from(Blocks.ORANGE_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", new WallBlock(Properties.from(Blocks.YELLOW_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIME_CONCRETE_WALL = register("lime_concrete_wall", new WallBlock(Properties.from(Blocks.LIME_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block GREEN_CONCRETE_WALL = register("green_concrete_wall", new WallBlock(Properties.from(Blocks.GREEN_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block CYAN_CONCRETE_WALL = register("cyan_concrete_wall", new WallBlock(Properties.from(Blocks.CYAN_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", new WallBlock(Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block BLUE_CONCRETE_WALL = register("blue_concrete_wall", new WallBlock(Properties.from(Blocks.BLUE_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PURPLE_CONCRETE_WALL = register("purple_concrete_wall", new WallBlock(Properties.from(Blocks.PURPLE_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", new WallBlock(Properties.from(Blocks.MAGENTA_CONCRETE)), ItemGroup.DECORATIONS, WALLS);
	public static final Block PINK_CONCRETE_WALL = register("pink_concrete_wall", new WallBlock(Properties.from(Blocks.PINK_CONCRETE)), ItemGroup.DECORATIONS, WALLS);

	public static final Block WHITE_CONCRETE_PRESSURE_PLATE = register("white_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.WHITE_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = register("light_gray_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIGHT_GRAY_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block GRAY_CONCRETE_PRESSURE_PLATE = register("gray_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.GRAY_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BLACK_CONCRETE_PRESSURE_PLATE = register("black_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BLACK_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BROWN_CONCRETE_PRESSURE_PLATE = register("brown_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BROWN_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block RED_CONCRETE_PRESSURE_PLATE = register("red_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.RED_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = register("orange_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.ORANGE_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = register("yellow_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.YELLOW_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIME_CONCRETE_PRESSURE_PLATE = register("lime_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIME_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block GREEN_CONCRETE_PRESSURE_PLATE = register("green_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.GREEN_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block CYAN_CONCRETE_PRESSURE_PLATE = register("cyan_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.CYAN_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = register("light_blue_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.LIGHT_BLUE_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block BLUE_CONCRETE_PRESSURE_PLATE = register("blue_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.BLUE_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = register("purple_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.PURPLE_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = register("magenta_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.MAGENTA_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PINK_CONCRETE_PRESSURE_PLATE = register("pink_concrete_pressure_plate", new PressurePlateBlock(Sensitivity.MOBS, Properties.from(Blocks.PINK_CONCRETE).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);

	public static final Block WHITE_CONCRETE_BUTTON = register("white_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIGHT_GRAY_CONCRETE_BUTTON = register("light_gray_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block GRAY_CONCRETE_BUTTON = register("gray_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BLACK_CONCRETE_BUTTON = register("black_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BROWN_CONCRETE_BUTTON = register("brown_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block RED_CONCRETE_BUTTON = register("red_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block ORANGE_CONCRETE_BUTTON = register("orange_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block YELLOW_CONCRETE_BUTTON = register("yellow_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIME_CONCRETE_BUTTON = register("lime_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block GREEN_CONCRETE_BUTTON = register("green_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block CYAN_CONCRETE_BUTTON = register("cyan_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block LIGHT_BLUE_CONCRETE_BUTTON = register("light_blue_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block BLUE_CONCRETE_BUTTON = register("blue_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PURPLE_CONCRETE_BUTTON = register("purple_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block MAGENTA_CONCRETE_BUTTON = register("magenta_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PINK_CONCRETE_BUTTON = register("pink_concrete_button", new StoneButtonBlock(pStoneButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block WHITE_QUARTZ_PAVING = register("white_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_GRAY_QUARTZ_PAVING = register("light_gray_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GRAY_QUARTZ_PAVING = register("gray_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLACK_QUARTZ_PAVING = register("black_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BROWN_QUARTZ_PAVING = register("brown_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block RED_QUARTZ_PAVING = register("red_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block ORANGE_QUARTZ_PAVING = register("orange_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block YELLOW_QUARTZ_PAVING = register("yellow_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIME_QUARTZ_PAVING = register("lime_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GREEN_QUARTZ_PAVING = register("green_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CYAN_QUARTZ_PAVING = register("cyan_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_BLUE_QUARTZ_PAVING = register("light_blue_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_QUARTZ_PAVING = register("blue_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PURPLE_QUARTZ_PAVING = register("purple_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MAGENTA_QUARTZ_PAVING = register("magenta_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PINK_QUARTZ_PAVING = register("pink_quartz_paving", new Block(Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);

	public static final Block WHITE_QUARTZ_PAVING_STAIRS = register("white_quartz_paving_stairs", new StairsBlock(WHITE_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_GRAY_QUARTZ_PAVING_STAIRS = register("light_gray_quartz_paving_stairs", new StairsBlock(LIGHT_GRAY_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GRAY_QUARTZ_PAVING_STAIRS = register("gray_quartz_paving_stairs", new StairsBlock(GRAY_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLACK_QUARTZ_PAVING_STAIRS = register("black_quartz_paving_stairs", new StairsBlock(BLACK_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BROWN_QUARTZ_PAVING_STAIRS = register("brown_quartz_paving_stairs", new StairsBlock(BROWN_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block RED_QUARTZ_PAVING_STAIRS = register("red_quartz_paving_stairs", new StairsBlock(RED_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block ORANGE_QUARTZ_PAVING_STAIRS = register("orange_quartz_paving_stairs", new StairsBlock(ORANGE_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block YELLOW_QUARTZ_PAVING_STAIRS = register("yellow_quartz_paving_stairs", new StairsBlock(YELLOW_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIME_QUARTZ_PAVING_STAIRS = register("lime_quartz_paving_stairs", new StairsBlock(LIME_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block GREEN_QUARTZ_PAVING_STAIRS = register("green_quartz_paving_stairs", new StairsBlock(GREEN_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block CYAN_QUARTZ_PAVING_STAIRS = register("cyan_quartz_paving_stairs", new StairsBlock(CYAN_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block LIGHT_BLUE_QUARTZ_PAVING_STAIRS = register("light_blue_quartz_paving_stairs", new StairsBlock(LIGHT_BLUE_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block BLUE_QUARTZ_PAVING_STAIRS = register("blue_quartz_paving_stairs", new StairsBlock(BLUE_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PURPLE_QUARTZ_PAVING_STAIRS = register("purple_quartz_paving_stairs", new StairsBlock(PURPLE_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MAGENTA_QUARTZ_PAVING_STAIRS = register("magenta_quartz_paving_stairs", new StairsBlock(MAGENTA_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block PINK_QUARTZ_PAVING_STAIRS = register("pink_quartz_paving_stairs", new StairsBlock(PINK_QUARTZ_PAVING), ItemGroup.BUILDING_BLOCKS, STAIRS);

	public static final Block WHITE_QUARTZ_PAVING_SLAB = register("white_quartz_paving_slab", new SlabBlock(Properties.from(WHITE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_GRAY_QUARTZ_PAVING_SLAB = register("light_gray_quartz_paving_slab", new SlabBlock(Properties.from(LIGHT_GRAY_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GRAY_QUARTZ_PAVING_SLAB = register("gray_quartz_paving_slab", new SlabBlock(Properties.from(GRAY_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLACK_QUARTZ_PAVING_SLAB = register("black_quartz_paving_slab", new SlabBlock(Properties.from(BLACK_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BROWN_QUARTZ_PAVING_SLAB = register("brown_quartz_paving_slab", new SlabBlock(Properties.from(BROWN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block RED_QUARTZ_PAVING_SLAB = register("red_quartz_paving_slab", new SlabBlock(Properties.from(RED_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block ORANGE_QUARTZ_PAVING_SLAB = register("orange_quartz_paving_slab", new SlabBlock(Properties.from(ORANGE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block YELLOW_QUARTZ_PAVING_SLAB = register("yellow_quartz_paving_slab", new SlabBlock(Properties.from(YELLOW_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIME_QUARTZ_PAVING_SLAB = register("lime_quartz_paving_slab", new SlabBlock(Properties.from(LIME_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block GREEN_QUARTZ_PAVING_SLAB = register("green_quartz_paving_slab", new SlabBlock(Properties.from(GREEN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block CYAN_QUARTZ_PAVING_SLAB = register("cyan_quartz_paving_slab", new SlabBlock(Properties.from(CYAN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block LIGHT_BLUE_QUARTZ_PAVING_SLAB = register("light_blue_quartz_paving_slab", new SlabBlock(Properties.from(LIGHT_BLUE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block BLUE_QUARTZ_PAVING_SLAB = register("blue_quartz_paving_slab", new SlabBlock(Properties.from(BLUE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PURPLE_QUARTZ_PAVING_SLAB = register("purple_quartz_paving_slab", new SlabBlock(Properties.from(PURPLE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MAGENTA_QUARTZ_PAVING_SLAB = register("magenta_quartz_paving_slab", new SlabBlock(Properties.from(MAGENTA_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block PINK_QUARTZ_PAVING_SLAB = register("pink_quartz_paving_slab", new SlabBlock(Properties.from(PINK_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, SLABS);

	public static final Block WHITE_QUARTZ_PAVING_VERTICAL_SLAB = register("white_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(WHITE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_GRAY_QUARTZ_PAVING_VERTICAL_SLAB = register("light_gray_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_GRAY_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GRAY_QUARTZ_PAVING_VERTICAL_SLAB = register("gray_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(GRAY_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLACK_QUARTZ_PAVING_VERTICAL_SLAB = register("black_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(BLACK_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BROWN_QUARTZ_PAVING_VERTICAL_SLAB = register("brown_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(BROWN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block RED_QUARTZ_PAVING_VERTICAL_SLAB = register("red_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(RED_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block ORANGE_QUARTZ_PAVING_VERTICAL_SLAB = register("orange_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(ORANGE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block YELLOW_QUARTZ_PAVING_VERTICAL_SLAB = register("yellow_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(YELLOW_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIME_QUARTZ_PAVING_VERTICAL_SLAB = register("lime_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(LIME_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block GREEN_QUARTZ_PAVING_VERTICAL_SLAB = register("green_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(GREEN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block CYAN_QUARTZ_PAVING_VERTICAL_SLAB = register("cyan_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(CYAN_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block LIGHT_BLUE_QUARTZ_PAVING_VERTICAL_SLAB = register("light_blue_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(LIGHT_BLUE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block BLUE_QUARTZ_PAVING_VERTICAL_SLAB = register("blue_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(BLUE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PURPLE_QUARTZ_PAVING_VERTICAL_SLAB = register("purple_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(PURPLE_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MAGENTA_QUARTZ_PAVING_VERTICAL_SLAB = register("magenta_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(MAGENTA_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block PINK_QUARTZ_PAVING_VERTICAL_SLAB = register("pink_quartz_paving_vertical_slab", new VerticalSlabBlock(Properties.from(PINK_QUARTZ_PAVING)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);

	public static final Block BLUE_CHRISTMAS_BAUBLE = register("blue_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block LIGHT_BLUE_CHRISTMAS_BAUBLE = register("light_blue_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block PURPLE_CHRISTMAS_BAUBLE = register("purple_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block MAGENTA_CHRISTMAS_BAUBLE = register("magenta_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.MAGENTA_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block PINK_CHRISTMAS_BAUBLE = register("pink_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block RED_CHRISTMAS_BAUBLE = register("red_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block ORANGE_CHRISTMAS_BAUBLE = register("orange_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block YELLOW_CHRISTMAS_BAUBLE = register("yellow_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block GREEN_CHRISTMAS_BAUBLE = register("green_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);
	public static final Block WHITE_CHRISTMAS_BAUBLE = register("white_christmas_bauble", new Block(Properties.create(Material.GLASS, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS, CUBES);

	public static final Block RED_SHINY_GARLAND = register("red_shiny_garland", new GarlandBlock(Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 10;
	}).notSolid()), ItemGroup.DECORATIONS, OTHERS, 30, 60);
	public static final Block SILVER_SHINY_GARLAND = register("silver_shiny_garland", new GarlandBlock(Properties.create(Material.LEAVES, MaterialColor.CLAY).hardnessAndResistance(0.2F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 10;
	}).notSolid()), ItemGroup.DECORATIONS, OTHERS, 30, 60);
	public static final Block GOLD_SHINY_GARLAND = register("gold_shiny_garland", new GarlandBlock(Properties.create(Material.LEAVES, MaterialColor.GOLD).hardnessAndResistance(0.2F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 10;
	}).notSolid()), ItemGroup.DECORATIONS, OTHERS, 30, 60);

	public static final Block WHITE_PRESENT = register("white_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block BLACK_PRESENT = register("black_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.BLACK_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block BLUE_PRESENT = register("blue_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block GREEN_PRESENT = register("green_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block YELLOW_PRESENT = register("yellow_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block RED_PRESENT = register("red_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block PURPLE_PRESENT = register("purple_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);
	public static final Block GOLDEN_PRESENT = register("golden_present", new PresentBlock(Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.8F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, OTHERS, 60, 60);

	public static final Block FOOTBLOCK = register("footblock", new Block(Properties.from(Blocks.WHITE_WOOL)), ItemGroup.DECORATIONS, OTHERS, 60, 60);

	public static final Block WHITE_CLOUD_BLOCK = register("white_cloud_block", new CloudBlock(DyeColor.WHITE), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block LIGHT_GRAY_CLOUD_BLOCK = register("light_gray_cloud_block", new CloudBlock(DyeColor.LIGHT_GRAY), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block GRAY_CLOUD_BLOCK = register("gray_cloud_block", new CloudBlock(DyeColor.GRAY), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block BLACK_CLOUD_BLOCK = register("black_cloud_block", new CloudBlock(DyeColor.BLACK), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block BROWN_CLOUD_BLOCK = register("brown_cloud_block", new CloudBlock(DyeColor.BROWN), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block RED_CLOUD_BLOCK = register("red_cloud_block", new CloudBlock(DyeColor.RED), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block ORANGE_CLOUD_BLOCK = register("orange_cloud_block", new CloudBlock(DyeColor.ORANGE), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block YELLOW_CLOUD_BLOCK = register("yellow_cloud_block", new CloudBlock(DyeColor.YELLOW), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block LIME_CLOUD_BLOCK = register("lime_cloud_block", new CloudBlock(DyeColor.LIME), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block GREEN_CLOUD_BLOCK = register("green_cloud_block", new CloudBlock(DyeColor.GREEN), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block CYAN_CLOUD_BLOCK = register("cyan_cloud_block", new CloudBlock(DyeColor.CYAN), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block LIGHT_BLUE_CLOUD_BLOCK = register("light_blue_cloud_block", new CloudBlock(DyeColor.LIGHT_BLUE), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block BLUE_CLOUD_BLOCK = register("blue_cloud_block", new CloudBlock(DyeColor.BLUE), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block PURPLE_CLOUD_BLOCK = register("purple_cloud_block", new CloudBlock(DyeColor.PURPLE), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block MAGENTA_CLOUD_BLOCK = register("magenta_cloud_block", new CloudBlock(DyeColor.MAGENTA), ItemGroup.DECORATIONS, CLOUD_BLOCKS);
	public static final Block PINK_CLOUD_BLOCK = register("pink_cloud_block", new CloudBlock(DyeColor.PINK), ItemGroup.DECORATIONS, CLOUD_BLOCKS);

	public static final Block TOMATOES = register("tomatoes", new CropsBlock());
	public static final Block SALAD = register("salad", new CropsBlock());
	public static final Block BLUEBERRY_BUSH = register("blueberry_bush", new BerryBushBlock(Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)), 60, 100);
	public static final Block CHEESE_BLOCK = register("cheese_block", new Block(Properties.create(Material.ORGANIC, MaterialColor.YELLOW).hardnessAndResistance(0.5f).sound(SoundType.SNOW)), ItemGroup.FOOD, OTHERS, 60, 60);
	public static final Block CHOCOLATE_CAKE = register("chocolate_cake", new CakeBlock(Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)), ItemGroup.FOOD, OTHERS);
	public static final Block MINECRAFT_10TH_ANNIVERSARY_CAKE = register("minecraft_10th_anniversary_cake", new CakeBlock(Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)), ItemGroup.FOOD, OTHERS);

	public static final Block WHITE_BALLOON = register("white_balloon", new BalloonBlock(DyeColor.WHITE), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block LIGHT_GRAY_BALLOON = register("light_gray_balloon", new BalloonBlock(DyeColor.LIGHT_GRAY), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block GRAY_BALLOON = register("gray_balloon", new BalloonBlock(DyeColor.GRAY), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block BLACK_BALLOON = register("black_balloon", new BalloonBlock(DyeColor.BLACK), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block BROWN_BALLOON = register("brown_balloon", new BalloonBlock(DyeColor.BROWN), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block RED_BALLOON = register("red_balloon", new BalloonBlock(DyeColor.RED), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block ORANGE_BALLOON = register("orange_balloon", new BalloonBlock(DyeColor.ORANGE), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block YELLOW_BALLOON = register("yellow_balloon", new BalloonBlock(DyeColor.YELLOW), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block LIME_BALLOON = register("lime_balloon", new BalloonBlock(DyeColor.LIME), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block GREEN_BALLOON = register("green_balloon", new BalloonBlock(DyeColor.GREEN), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block CYAN_BALLOON = register("cyan_balloon", new BalloonBlock(DyeColor.CYAN), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block LIGHT_BLUE_BALLOON = register("light_blue_balloon", new BalloonBlock(DyeColor.LIGHT_BLUE), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block BLUE_BALLOON = register("blue_balloon", new BalloonBlock(DyeColor.BLUE), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block PURPLE_BALLOON = register("purple_balloon", new BalloonBlock(DyeColor.PURPLE), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block MAGENTA_BALLOON = register("magenta_balloon", new BalloonBlock(DyeColor.MAGENTA), ItemGroup.DECORATIONS, BALLOONS, 30, 60);
	public static final Block PINK_BALLOON = register("pink_balloon", new BalloonBlock(DyeColor.PINK), ItemGroup.DECORATIONS, BALLOONS, 30, 60);

	public static final Block UNSTABLE_STONE = register("unstable_stone", new UnstableBlock(Properties.from(Blocks.STONE).hardnessAndResistance(0.1F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block FLUID_TANK = register("fluid_tank", new FluidTankBlock(Properties.from(Blocks.OBSIDIAN).notSolid()), ItemGroup.REDSTONE, OTHERS);
	public static final Block PLACER = register("placer", new PlacerBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)), ItemGroup.REDSTONE, CUBES);
	public static final Block TIMESWAP_TABLE = register("timeswap_table", new TimeswapTableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)), ItemGroup.DECORATIONS, CUBES);

	public static final Block DANDELION_PILE = register("dandelion_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block POPPY_PILE = register("poppy_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block BLUE_ORCHID_PILE = register("blue_orchid_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block ALLIUM_PILE = register("allium_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block AZURE_BLUET_PILE = register("azure_bluet_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block RED_TULIP_PILE = register("red_tulip_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block ORANGE_TULIP_PILE = register("orange_tulip_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block WHITE_TULIP_PILE = register("white_tulip_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block PINK_TULIP_PILE = register("pink_tulip_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block OXEYE_DAISY_PILE = register("oxeye_daisy_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block CORNFLOWER_PILE = register("cornflower_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block LILY_OF_THE_VALLEY_PILE = register("lily_of_the_valley_pile", new PileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);
	public static final Block WITHER_ROSE_PILE = register("wither_rose_pile", new WitherRosePileBlock(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()), ItemGroup.DECORATIONS, FLOWER_PILES, 60, 20);

	/* SUPER MARIO (MAKER) */
	public static final Block SMB_GROUND_GROUND_BLOCK = register("smb_ground_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_UNDERGROUND_GROUND_BLOCK = register("smb_underground_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_UNDERWATER_GROUND_BLOCK = register("smb_underwater_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_GHOST_HOUSE_GROUND_BLOCK = register("smb_ghost_house_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_AIRSHIP_GROUND_BLOCK = register("smb_airship_ground_block", new Block(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_NIGHT_AIRSHIP_GROUND_BLOCK = register("smb_night_airship_ground_block", new Block(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_CASTLE_GROUND_BLOCK = register("smb_castle_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_DESERT_GROUND_BLOCK = register("smb_desert_ground_block", new Block(Properties.from(Blocks.SAND)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_FOREST_GROUND_BLOCK = register("smb_forest_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_SNOW_GROUND_BLOCK = register("smb_snow_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_NIGHT_SNOW_GROUND_BLOCK = register("smb_night_snow_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_SKY_GROUND_BLOCK = register("smb_sky_ground_block", new Block(Properties.from(Blocks.WHITE_WOOL)), ItemGroup.BUILDING_BLOCKS, CUBES, 30, 60);
	public static final Block SMB3_GROUND_GROUND_BLOCK = register("smb3_ground_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_UNDERGROUND_GROUND_BLOCK = register("smb3_underground_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_UNDERWATER_GROUND_BLOCK = register("smb3_underwater_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_GHOST_HOUSE_GROUND_BLOCK = register("smb3_ghost_house_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_AIRSHIP_GROUND_BLOCK = register("smb3_airship_ground_block", new Block(Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block SMB3_NIGHT_AIRSHIP_GROUND_BLOCK = register("smb3_night_airship_ground_block", new Block(Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_CASTLE_GROUND_BLOCK = register("smb3_castle_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_NIGHT_CASTLE_GROUND_BLOCK = register("smb3_night_castle_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_DESERT_GROUND_BLOCK = register("smb3_desert_ground_block", new OverBlock(Properties.from(Blocks.SAND)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_SNOW_GROUND_BLOCK = register("smb3_snow_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_NIGHT_SNOW_GROUND_BLOCK = register("smb3_night_snow_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_SKY_GROUND_BLOCK = register("smb3_sky_ground_block", new OverBlock(Properties.from(Blocks.WHITE_WOOL)), ItemGroup.BUILDING_BLOCKS, CUBES, 30, 60);
	public static final Block SMW_GROUND_GROUND_BLOCK = register("smw_ground_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_UNDERGROUND_GROUND_BLOCK = register("smw_underground_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_UNDERWATER_GROUND_BLOCK = register("smw_underwater_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_GHOST_HOUSE_GROUND_BLOCK = register("smw_ghost_house_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_AIRSHIP_GROUND_BLOCK = register("smw_airship_ground_block", new OverBlock(Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_CASTLE_GROUND_BLOCK = register("smw_castle_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_DESERT_GROUND_BLOCK = register("smw_desert_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_FOREST_GROUND_BLOCK = register("smw_forest_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_SNOW_GROUND_BLOCK = register("smw_snow_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_NIGHT_SNOW_GROUND_BLOCK = register("smw_night_snow_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_SKY_GROUND_BLOCK = register("smw_sky_ground_block", new OverBlock(Properties.from(Blocks.WHITE_WOOL)), ItemGroup.BUILDING_BLOCKS, CUBES, 30, 60);
	public static final Block NSMBU_GROUND_GROUND_BLOCK = register("nsmbu_ground_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_UNDERGROUND_GROUND_BLOCK = register("nsmbu_underground_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_UNDERWATER_GROUND_BLOCK = register("nsmbu_underwater_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_GHOST_HOUSE_GROUND_BLOCK = register("nsmbu_ghost_house_ground_block", new OverBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_CASTLE_GROUND_BLOCK = register("nsmbu_castle_ground_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_DESERT_GROUND_BLOCK = register("nsmbu_desert_ground_block", new OverBlock(Properties.from(Blocks.SAND)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_FOREST_GROUND_BLOCK = register("nsmbu_forest_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_SNOW_GROUND_BLOCK = register("nsmbu_snow_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_NIGHT_SNOW_GROUND_BLOCK = register("nsmbu_night_snow_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_SKY_GROUND_BLOCK = register("nsmbu_sky_ground_block", new OverBlock(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_QUESTION_BLOCK = register("smb_question_block", new QuestionBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_QUESTION_BLOCK = register("smb3_question_block", new QuestionBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_QUESTION_BLOCK = register("smw_question_block", new QuestionBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_QUESTION_BLOCK = register("nsmbu_question_block", new QuestionBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_EMPTY_BLOCK = register("smb_empty_block", new EmptyBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_EMPTY_BLOCK = register("smb3_empty_block", new EmptyBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_EMPTY_BLOCK = register("smw_empty_block", new EmptyBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_EMPTY_BLOCK = register("nsmbu_empty_block", new EmptyBlock(), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_ROTATING_BLOCK = register("smb_rotating_block", new RotatingBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_ROTATING_BLOCK = register("smb3_rotating_block", new RotatingBlock(MubbleSoundTypes.SMB3_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_ROTATING_BLOCK = register("smw_rotating_block", new RotatingBlock(MubbleSoundTypes.SMW_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_ROTATING_BLOCK = register("nsmbu_rotating_block", new RotatingBlock(MubbleSoundTypes.NSMBU_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_BLOCK = register("light_block", new Block(Properties.from(Blocks.STONE).func_235838_a_((p_235439_0_) -> {
		return 15;
	})), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_GROUND_BRICK_BLOCK = register("smb_ground_brick_block", new BrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_UNDERGROUND_BRICK_BLOCK = register("smb_underground_brick_block", new BrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_CASTLE_BRICK_BLOCK = register("smb_castle_brick_block", new BrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_SNOW_BRICK_BLOCK = register("smb_snow_brick_block", new BrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_NIGHT_SNOW_BRICK_BLOCK = register("smb_night_snow_brick_block", new BrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_BRICK_BLOCK = register("smb3_brick_block", new BrickBlock(MubbleSoundTypes.SMB3_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_BRICK_BLOCK = register("smw_brick_block", new BrickBlock(MubbleSoundTypes.SMW_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_BRICK_BLOCK = register("nsmbu_brick_block", new BrickBlock(MubbleSoundTypes.NSMBU_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_GOLDEN_BRICK_BLOCK = register("smb_golden_brick_block", new GoldenBrickBlock(MubbleSoundTypes.SMB_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_GOLDEN_BRICK_BLOCK = register("smb3_golden_brick_block", new GoldenBrickBlock(MubbleSoundTypes.SMB3_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_GOLDEN_BRICK_BLOCK = register("smw_golden_brick_block", new GoldenBrickBlock(MubbleSoundTypes.SMW_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_GOLDEN_BRICK_BLOCK = register("nsmbu_golden_brick_block", new GoldenBrickBlock(MubbleSoundTypes.NSMBU_BRICK_BLOCK), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_GROUND_HARD_BLOCK = register("smb_ground_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_UNDERGROUND_HARD_BLOCK = register("smb_underground_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_UNDERWATER_HARD_BLOCK = register("smb_underwater_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_CASTLE_HARD_BLOCK = register("smb_castle_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_SNOW_HARD_BLOCK = register("smb_snow_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_NIGHT_SNOW_HARD_BLOCK = register("smb_night_snow_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_HARD_BLOCK = register("smb3_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_STONE_HARD_BLOCK = register("smw_stone_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_WOOD_HARD_BLOCK = register("smw_wood_hard_block", new Block(Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 20);
	public static final Block NSMBU_HARD_BLOCK = register("nsmbu_hard_block", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_ICE_BLOCK = register("smb_ice_block", new Block(Properties.from(Blocks.PACKED_ICE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_ICE_BLOCK = register("smb3_ice_block", new Block(Properties.from(Blocks.PACKED_ICE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_ICE_BLOCK = register("smw_ice_block", new Block(Properties.from(Blocks.PACKED_ICE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_ICE_BLOCK = register("nsmbu_ice_block", new Block(Properties.from(Blocks.PACKED_ICE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_NOTE_BLOCK = register("smb_note_block", new NoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_NOTE_BLOCK = register("smb3_note_block", new NoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_NOTE_BLOCK = register("smw_note_block", new NoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_NOTE_BLOCK = register("nsmbu_note_block", new NoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_SUPER_NOTE_BLOCK = register("smb_super_note_block", new SuperNoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB3_SUPER_NOTE_BLOCK = register("smb3_super_note_block", new SuperNoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMW_SUPER_NOTE_BLOCK = register("smw_super_note_block", new SuperNoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block NSMBU_SUPER_NOTE_BLOCK = register("nsmbu_super_note_block", new SuperNoteBlock(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block SMB_DOOR = register("smb_door", new DoorBlock(Properties.from(Blocks.OAK_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block SMB3_DOOR = register("smb3_door", new DoorBlock(Properties.from(Blocks.OAK_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block SMW_DOOR = register("smw_door", new DoorBlock(Properties.from(Blocks.OAK_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block NSMBU_DOOR = register("nsmbu_door", new DoorBlock(Properties.from(Blocks.OAK_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block SMB_KEY_DOOR = register("smb_key_door", new KeyDoorBlock(Properties.from(Blocks.IRON_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block SMB3_KEY_DOOR = register("smb3_key_door", new KeyDoorBlock(Properties.from(Blocks.IRON_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block SMW_KEY_DOOR = register("smw_key_door", new KeyDoorBlock(Properties.from(Blocks.IRON_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block NSMBU_KEY_DOOR = register("nsmbu_key_door", new KeyDoorBlock(Properties.from(Blocks.IRON_DOOR).notSolid()), ItemGroup.REDSTONE, DOORS);

	/* SUPER MARIO (OTHERS) */
	public static final Block FIRE_FLOWER = register("fire_flower", new FlowerBlock(Effects.FIRE_RESISTANCE, 6, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)), ItemGroup.DECORATIONS, FLOWERS, 60, 100);
	public static final Block ICE_FLOWER = register("ice_flower", new FlowerBlock(Effects.MINING_FATIGUE, 7, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)), ItemGroup.DECORATIONS, FLOWERS, 60, 100);
	public static final Block BOOMERANG_FLOWER = register("boomerang_flower", new FlowerBlock(Effects.HASTE, 6, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)), ItemGroup.DECORATIONS, FLOWERS, 60, 100);
	public static final Block CLOUD_FLOWER = register("cloud_flower", new CloudFlowerBlock(Effects.SLOW_FALLING, 7, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)), ItemGroup.DECORATIONS, FLOWERS, 60, 100);
	public static final Block GOLD_FLOWER = register("gold_flower", new FlowerBlock(MubbleEffects.HEAVINESS, 6, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 5;
	})), ItemGroup.DECORATIONS, FLOWERS, 60, 100);
	public static final Block WHITE_MUSHROOM_BLOCK = register("white_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.WHITE).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block LIGHT_GRAY_MUSHROOM_BLOCK = register("light_gray_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.LIGHT_GRAY).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block GRAY_MUSHROOM_BLOCK = register("gray_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.GRAY).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block BLACK_MUSHROOM_BLOCK = register("black_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.BLACK).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block ORANGE_MUSHROOM_BLOCK = register("orange_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.ORANGE).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block YELLOW_MUSHROOM_BLOCK = register("yellow_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.YELLOW).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block LIME_MUSHROOM_BLOCK = register("lime_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.LIME).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block GREEN_MUSHROOM_BLOCK = register("green_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.GREEN).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block CYAN_MUSHROOM_BLOCK = register("cyan_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.CYAN).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block LIGHT_BLUE_MUSHROOM_BLOCK = register("light_blue_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.LIGHT_BLUE).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block BLUE_MUSHROOM_BLOCK = register("blue_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.BLUE).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block PURPLE_MUSHROOM_BLOCK = register("purple_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.PURPLE).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block MAGENTA_MUSHROOM_BLOCK = register("magenta_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.MAGENTA).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block PINK_MUSHROOM_BLOCK = register("pink_mushroom_block", new HugeMushroomBlock(Properties.create(Material.WOOD, DyeColor.PINK).hardnessAndResistance(0.2F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS, CUBES);
	public static final Block WHITE_MUSHROOM = register("white_mushroom", createGrowableMushroom(WHITE_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block LIGHT_GRAY_MUSHROOM = register("light_gray_mushroom", createGrowableMushroom(LIGHT_GRAY_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block GRAY_MUSHROOM = register("gray_mushroom", createGrowableMushroom(GRAY_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block BLACK_MUSHROOM = register("black_mushroom", createGrowableMushroom(BLACK_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block ORANGE_MUSHROOM = register("orange_mushroom", createGrowableMushroom(ORANGE_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block YELLOW_MUSHROOM = register("yellow_mushroom", createGrowableMushroom(YELLOW_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block LIME_MUSHROOM = register("lime_mushroom", createGrowableMushroom(LIME_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block GREEN_MUSHROOM = register("green_mushroom", createGrowableMushroom(GREEN_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block CYAN_MUSHROOM = register("cyan_mushroom", createGrowableMushroom(CYAN_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block LIGHT_BLUE_MUSHROOM = register("light_blue_mushroom", createGrowableMushroom(LIGHT_BLUE_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block BLUE_MUSHROOM = register("blue_mushroom", createGrowableMushroom(BLUE_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block PURPLE_MUSHROOM = register("purple_mushroom", createGrowableMushroom(PURPLE_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block MAGENTA_MUSHROOM = register("magenta_mushroom", createGrowableMushroom(MAGENTA_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block PINK_MUSHROOM = register("pink_mushroom", createGrowableMushroom(MubbleBlocks.PINK_MUSHROOM_BLOCK), ItemGroup.DECORATIONS, FLOWERS);

	/* KIRBY */
	public static final Block KIRBY_BLOCK = register("kirby_block", new DirectionalBlock(Properties.create(Material.CLAY, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)), ItemGroup.DECORATIONS, CUBES);

	/* TETRIS */
	public static final Block WHITE_TETRIS_BLOCK = register("white_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.WHITE).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_GRAY_TETRIS_BLOCK = register("light_gray_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GRAY_TETRIS_BLOCK = register("gray_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.GRAY).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLACK_TETRIS_BLOCK = register("black_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.BLACK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BROWN_TETRIS_BLOCK = register("brown_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.BROWN).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block RED_TETRIS_BLOCK = register("red_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.RED).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block ORANGE_TETRIS_BLOCK = register("orange_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.ORANGE).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block YELLOW_TETRIS_BLOCK = register("yellow_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.YELLOW).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIME_TETRIS_BLOCK = register("lime_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.LIME).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GREEN_TETRIS_BLOCK = register("green_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.GREEN).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block CYAN_TETRIS_BLOCK = register("cyan_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.CYAN).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block LIGHT_BLUE_TETRIS_BLOCK = register("light_blue_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block BLUE_TETRIS_BLOCK = register("blue_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.BLUE).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PURPLE_TETRIS_BLOCK = register("purple_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.PURPLE).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MAGENTA_TETRIS_BLOCK = register("magenta_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.MAGENTA).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block PINK_TETRIS_BLOCK = register("pink_tetris_block", new FallingBlock(Properties.create(Material.ROCK, DyeColor.PINK).hardnessAndResistance(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block TETRIS_GLASS = register("tetris_glass", new TetrisGlassBlock(Properties.from(Blocks.GLASS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block JAPANESE_TETRIS_CUSHION = register("japanese_tetris_cushion", new FallingBlock(Properties.from(Blocks.RED_WOOL)), ItemGroup.BUILDING_BLOCKS, CUBES, 30, 60);
	public static final Block RAINBOW_TETRIS_SCAFFOLDING = register("rainbow_tetris_scaffolding", new FallingBlock(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.DECORATIONS, CUBES);
	public static final Block MONOCHROME_TETRIS_SCAFFOLDING = register("monochrome_tetris_scaffolding", new FallingBlock(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.DECORATIONS, CUBES);

	/* CASTLEVANIA */
	public static final Block VAMPIRE_STONE = register("vampire_stone", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MEDUSA_STONE = register("medusa_stone", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MEDUSA_BRICKS = register("medusa_bricks", new Block(Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MEDUSA_BRICK_STAIRS = register("medusa_brick_stairs", new StairsBlock(MEDUSA_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MEDUSA_BRICK_SLAB = register("medusa_brick_slab", new SlabBlock(Properties.from(MEDUSA_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MEDUSA_BRICK_VERTICAL_SLAB = register("medusa_brick_vertical_slab", new VerticalSlabBlock(Properties.from(MEDUSA_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MEDUSA_BRICK_WALL = register("medusa_brick_wall", new WallBlock(Properties.from(MubbleBlocks.MEDUSA_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block WHITE_CANDY_CANE_PILLAR = register("white_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.WHITE).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block LIGHT_GRAY_CANDY_CANE_PILLAR = register("light_gray_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block GRAY_CANDY_CANE_PILLAR = register("gray_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.GRAY).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block BLACK_CANDY_CANE_PILLAR = register("black_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.BLACK).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block BROWN_CANDY_CANE_PILLAR = register("brown_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.BROWN).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block RED_CANDY_CANE_PILLAR = register("red_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.RED).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block ORANGE_CANDY_CANE_PILLAR = register("orange_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.ORANGE).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block YELLOW_CANDY_CANE_PILLAR = register("yellow_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.YELLOW).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block LIME_CANDY_CANE_PILLAR = register("lime_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.LIME).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block GREEN_CANDY_CANE_PILLAR = register("green_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.GREEN).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block CYAN_CANDY_CANE_PILLAR = register("cyan_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.CYAN).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block LIGHT_BLUE_CANDY_CANE_PILLAR = register("light_blue_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block BLUE_CANDY_CANE_PILLAR = register("blue_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.BLUE).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block PURPLE_CANDY_CANE_PILLAR = register("purple_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.PURPLE).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block MAGENTA_CANDY_CANE_PILLAR = register("magenta_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.MAGENTA).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);
	public static final Block PINK_CANDY_CANE_PILLAR = register("pink_candy_cane_pillar", new RotatedPillarBlock(Properties.create(Material.ROCK, DyeColor.PINK).hardnessAndResistance(0.2F)), ItemGroup.DECORATIONS, CUBES, 5, 10);

	/* SONIC */
	public static final Block GREEN_HILL_GRASS_BLOCK = register("green_hill_grass_block", new GrassBlock(Properties.from(Blocks.GRASS_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block GREEN_HILL_DIRT = register("green_hill_dirt", new Block(Properties.from(Blocks.DIRT)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MARBLE_ZONE_STONE = register("marble_zone_stone", new Block(Properties.from(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block YELLOW_STUDIOPOLIS_CLAPPER = register("yellow_studiopolis_clapper", new DirectionalBlock(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.DECORATIONS, CUBES);
	public static final Block BLUE_STUDIOPOLIS_CLAPPER = register("blue_studiopolis_clapper", new DirectionalBlock(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.DECORATIONS, CUBES);

	public static final Block PRESS_GARDEN_PLANKS = register("press_garden_planks", new Block(Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 20);
	public static final Block RED_PRESS_GARDEN_SAPLING = register("red_press_garden_sapling", new SaplingBlock(new RedPressGardenTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block PINK_PRESS_GARDEN_SAPLING = register("pink_press_garden_sapling", new SaplingBlock(new PinkPressGardenTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block PRESS_GARDEN_LOG = register("press_garden_log", new RotatedPillarBlock(Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_PRESS_GARDEN_LOG = register("stripped_press_garden_log", new RotatedPillarBlock(Properties.from(PRESS_GARDEN_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block PRESS_GARDEN_WOOD = register("press_garden_wood", new RotatedPillarBlock(Properties.from(PRESS_GARDEN_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_PRESS_GARDEN_WOOD = register("stripped_press_garden_wood", new RotatedPillarBlock(Properties.from(PRESS_GARDEN_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block RED_PRESS_GARDEN_LEAVES = register("red_press_garden_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block RED_PRESS_GARDEN_LEAF_PILE = register("red_press_garden_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block PINK_PRESS_GARDEN_LEAVES = register("pink_press_garden_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block PINK_PRESS_GARDEN_LEAF_PILE = register("pink_press_garden_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block PRESS_GARDEN_PRESSURE_PLATE = register("press_garden_pressure_plate", new PressurePlateBlock(Sensitivity.EVERYTHING, Properties.from(MubbleBlocks.PRESS_GARDEN_PLANKS).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block PRESS_GARDEN_TRAPDOOR = register("press_garden_trapdoor", new TrapDoorBlock(Properties.from(MubbleBlocks.PRESS_GARDEN_PLANKS).notSolid()), ItemGroup.REDSTONE, TRAPDOORS);
	public static final Block PRESS_GARDEN_BUTTON = register("press_garden_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block PRESS_GARDEN_STAIRS = register("press_garden_stairs", new StairsBlock(PRESS_GARDEN_PLANKS), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block PRESS_GARDEN_SLAB = register("press_garden_slab", new SlabBlock(Properties.from(PRESS_GARDEN_PLANKS)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block PRESS_GARDEN_VERTICAL_SLAB = register("press_garden_vertical_slab", new VerticalSlabBlock(Properties.from(PRESS_GARDEN_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block PRESS_GARDEN_FENCE_GATE = register("press_garden_fence_gate", new FenceGateBlock(Properties.from(PRESS_GARDEN_PLANKS)), ItemGroup.REDSTONE, FENCE_GATES, 5, 20);
	public static final Block PRESS_GARDEN_FENCE = register("press_garden_fence", new FenceBlock(Properties.from(PRESS_GARDEN_PLANKS)), ItemGroup.DECORATIONS, FENCES, 5, 20);
	public static final Block PRESS_GARDEN_DOOR = register("press_garden_door", new DoorBlock(Properties.from(PRESS_GARDEN_PLANKS).notSolid()), ItemGroup.REDSTONE, DOORS);
	public static final Block PRESS_GARDEN_WOOD_STAIRS = register("press_garden_wood_stairs", new StairsBlock(PRESS_GARDEN_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block PRESS_GARDEN_WOOD_SLAB = register("press_garden_wood_slab", new SlabBlock(Properties.from(PRESS_GARDEN_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block PRESS_GARDEN_WOOD_VERTICAL_SLAB = register("press_garden_wood_vertical_slab", new VerticalSlabBlock(Properties.from(PRESS_GARDEN_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block PRESS_GARDEN_WOOD_BUTTON = register("press_garden_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);

	public static final Block SPRING = register("spring", new SpringBlock(Properties.create(Material.IRON).hardnessAndResistance(4f)), ItemGroup.TRANSPORTATION, OTHERS);

	/* UNDERTALE / DELTARUNE */
	public static final Block SCARLET_PLANKS = register("scarlet_planks", new Block(Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 20);
	public static final Block SCARLET_SAPLING = register("scarlet_sapling", new SaplingBlock(new ScarletTree()), ItemGroup.DECORATIONS, SAPLINGS);
	public static final Block SCARLET_LOG = register("scarlet_log", new RotatedPillarBlock(Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_SCARLET_LOG = register("stripped_scarlet_log", new RotatedPillarBlock(Properties.from(SCARLET_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block SCARLET_WOOD = register("scarlet_wood", new RotatedPillarBlock(Properties.from(SCARLET_LOG)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block STRIPPED_SCARLET_WOOD = register("stripped_scarlet_wood", new RotatedPillarBlock(Properties.from(SCARLET_WOOD)), ItemGroup.BUILDING_BLOCKS, CUBES, 5, 5);
	public static final Block SCARLET_LEAVES = register("scarlet_leaves", createLeaves(), ItemGroup.DECORATIONS, LEAVES, 30, 60);
	public static final Block SCARLET_LEAF_PILE = register("scarlet_leaf_pile", new PileBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.1F).sound(SoundType.PLANT).doesNotBlockMovement()), ItemGroup.DECORATIONS, LEAF_PILES, 60, 20);
	public static final Block SCARLET_PRESSURE_PLATE = register("scarlet_pressure_plate", new PressurePlateBlock(Sensitivity.EVERYTHING, Properties.from(SCARLET_PLANKS).doesNotBlockMovement().hardnessAndResistance(0.5F)), ItemGroup.REDSTONE, PRESSURE_PLATES);
	public static final Block SCARLET_TRAPDOOR = register("scarlet_trapdoor", new TrapDoorBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.REDSTONE, TRAPDOORS);
	public static final Block SCARLET_BUTTON = register("scarlet_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block SCARLET_STAIRS = register("scarlet_stairs", new StairsBlock(SCARLET_PLANKS), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block SCARLET_SLAB = register("scarlet_slab", new SlabBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block SCARLET_VERTICAL_SLAB = register("scarlet_vertical_slab", new VerticalSlabBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block SCARLET_FENCE_GATE = register("scarlet_fence_gate", new FenceGateBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.REDSTONE, FENCE_GATES, 5, 20);
	public static final Block SCARLET_FENCE = register("scarlet_fence", new FenceBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.DECORATIONS, FENCES, 5, 20);
	public static final Block SCARLET_DOOR = register("scarlet_door", new DoorBlock(Properties.from(SCARLET_PLANKS)), ItemGroup.REDSTONE, DOORS);
	public static final Block SCARLET_WOOD_STAIRS = register("scarlet_wood_stairs", new StairsBlock(SCARLET_WOOD), ItemGroup.BUILDING_BLOCKS, STAIRS, 5, 20);
	public static final Block SCARLET_WOOD_SLAB = register("scarlet_wood_slab", new SlabBlock(Properties.from(SCARLET_WOOD)), ItemGroup.BUILDING_BLOCKS, SLABS, 5, 20);
	public static final Block SCARLET_WOOD_VERTICAL_SLAB = register("scarlet_wood_vertical_slab", new VerticalSlabBlock(Properties.from(SCARLET_WOOD)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS, 5, 20);
	public static final Block SCARLET_WOOD_BUTTON = register("scarlet_wood_button", new WoodButtonBlock(pWoodenButton), ItemGroup.REDSTONE, BUTTONS);
	public static final Block SCARLET_MUSHROOM = register("scarlet_mushroom", new MushroomBlock(Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 7;
	})), ItemGroup.DECORATIONS, FLOWERS);
	public static final Block SCARLET_ORCHID = register("scarlet_orchid", new FlowerBlock(Effects.GLOWING, 8, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
		return 7;
	})), ItemGroup.DECORATIONS, FLOWERS, 60, 100);

	/* CELESTE */
	public static final Block GIRDER = register("girder", new Block(Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MIRROR_TEMPLE_BRICKS = register("mirror_temple_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block MIRROR_TEMPLE_BRICK_STAIRS = register("mirror_temple_brick_stairs", new StairsBlock(MIRROR_TEMPLE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block MIRROR_TEMPLE_BRICK_SLAB = register("mirror_temple_brick_slab", new SlabBlock(Properties.from(MIRROR_TEMPLE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block MIRROR_TEMPLE_BRICK_VERTICAL_SLAB = register("mirror_temple_brick_vertical_slab", new VerticalSlabBlock(Properties.from(MIRROR_TEMPLE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block MIRROR_TEMPLE_BRICK_WALL = register("mirror_temple_brick_wall", new WallBlock(Properties.from(MIRROR_TEMPLE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block OLD_SITE_BRICKS = register("old_site_bricks", new Block(Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block OLD_SITE_BRICK_STAIRS = register("old_site_brick_stairs", new StairsBlock(OLD_SITE_BRICKS), ItemGroup.BUILDING_BLOCKS, STAIRS);
	public static final Block OLD_SITE_BRICK_SLAB = register("old_site_brick_slab", new SlabBlock(Properties.from(OLD_SITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, SLABS);
	public static final Block OLD_SITE_BRICK_VERTICAL_SLAB = register("old_site_brick_vertical_slab", new VerticalSlabBlock(Properties.from(OLD_SITE_BRICKS)), ItemGroup.BUILDING_BLOCKS, VERTICAL_SLABS);
	public static final Block OLD_SITE_BRICK_WALL = register("old_site_brick_wall", new WallBlock(Properties.from(OLD_SITE_BRICKS)), ItemGroup.DECORATIONS, WALLS);
	public static final Block ELDER_PEBBLES = register("elder_pebbles", new Block(Properties.from(Blocks.BRICKS).func_235838_a_((p_235439_0_) -> {
		return 5;
	})), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block DREAM_BLOCK = register("dream_block", new Block(Properties.create(Material.SAND).hardnessAndResistance(0.4f).sound(MubbleSoundTypes.DREAM_BLOCK)), ItemGroup.BUILDING_BLOCKS, CUBES);
	public static final Block DREAM_BEDROCK = register("dream_bedrock", new Block(Properties.create(Material.ROCK).hardnessAndResistance(-1.0F, 3600000.0F).noDrops()), ItemGroup.BUILDING_BLOCKS, CUBES);

	/* PUYO PUYO */
	public static final Block RED_PUYO = register("red_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.RED).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block YELLOW_PUYO = register("yellow_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.YELLOW).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block GREEN_PUYO = register("green_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.GREEN).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block TURQUOISE_PUYO = register("turquoise_puyo", new PuyoBlock(Properties.create(Material.CLAY, MaterialColor.EMERALD).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block BLUE_PUYO = register("blue_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.BLUE).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block PURPLE_PUYO = register("purple_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.PURPLE).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block GRAY_PUYO = register("gray_puyo", new PuyoBlock(Properties.create(Material.CLAY, DyeColor.GRAY).slipperiness(0.8F).sound(SoundType.SLIME)));
	public static final Block GARBAGE_PUYO = register("garbage_puyo", new DirectionalBlock(Properties.from(Blocks.STONE)));
	public static final Block POINT_PUYO = register("point_puyo", new DirectionalBlock(Properties.from(Blocks.STONE).func_235838_a_((p_235439_0_) -> {
		return 10;
	})));
	public static final Block HARD_PUYO = register("hard_puyo", new DirectionalBlock(Properties.from(Blocks.STONE)));
	public static final Block IRON_PUYO = register("iron_puyo", new DirectionalBlock(Properties.from(Blocks.IRON_BLOCK)));

	/* YOUTUBE */
	public static final Block KORETATO_BLOCK = register("koretato_block", new KoretatoBlock());
	public static final Block POTATO_FLOWER = register("potato_flower", new FlowerBlock(Effects.HUNGER, 9, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)), ItemGroup.DECORATIONS, FLOWERS, 60, 100);

	private static Block register(String name, Block block) {
		Block fBlock = block.setRegistryName(Mubble.MOD_ID, name);
		BLOCKS.add(fBlock);
		return fBlock;
	}

	private static Block register(String name, Block block, ItemGroup group, List<BlockItem> itemList) {
		Block fBlock = register(name, block);
		if(itemList == FLOWERS || itemList == SAPLINGS) {
			Block fullFlowerPot = new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT.delegate.get(), () -> fBlock.delegate.get(), Properties.from(Blocks.FLOWER_POT).func_235838_a_((p_235439_0_) -> {
				return fBlock.getDefaultState().getLightValue();
			})).setRegistryName(Mubble.MOD_ID, "potted_" + name);
			BLOCKS.add(fullFlowerPot);
			POTTED_PLANTS.add(fullFlowerPot);
			if(Blocks.FLOWER_POT != null) {
				((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(fBlock.getRegistryName(), () -> fullFlowerPot);
			}
		}
		itemList.add((BlockItem) new BlockItem(fBlock, new Item.Properties().group(group)).setRegistryName(Mubble.MOD_ID, name));
		return fBlock;
	}

	private static Block register(String name, Block block, int fireEncouragement, int flammability) {
		Block fBlock = register(name, block);
		FireBlock fireblock = (FireBlock) Blocks.FIRE;

		// TODO
		//fireblock.setFireInfo(block, fireEncouragement, flammability);
		return fBlock;
	}

	private static Block register(String name, Block block, ItemGroup group, List<BlockItem> itemList, int fireEncouragement, int flammability) {
		Block fBlock = register(name, block, group, itemList);
		FireBlock fireblock = (FireBlock) Blocks.FIRE;

		// TODO
		//fireblock.setFireInfo(block, fireEncouragement, flammability);
		return fBlock;
	}

	private static LeavesBlock createLeaves() {
		return new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid());
	}

	private static GrowableMushroomPlantBlock createGrowableMushroom(Block hatBlock) {
		return new GrowableMushroomPlantBlock(Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT).func_235838_a_((p_235439_0_) -> {
			return 15;
		}), hatBlock);
	}
}
