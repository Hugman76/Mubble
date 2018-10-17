package hugman.mod.init;

import java.util.ArrayList;
import java.util.List;

import hugman.mod.objects.items.ItemBandage;
import hugman.mod.objects.items.ItemCapeFeather;
import hugman.mod.objects.items.ItemEdible;
import hugman.mod.objects.items.ItemEdibleEffect;
import hugman.mod.objects.items.ItemHelmet;
import hugman.mod.objects.items.ItemMusicDisc;
import hugman.mod.objects.items.ItemSimple;
import hugman.mod.objects.items.ItemSmashBall;
import hugman.mod.objects.items.ItemSuperStar;
import hugman.mod.util.handlers.SoundHandler;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// VANILLA
	public static final Item VANADIUM = new ItemSimple("vanadium");
	public static final Item WHEAT_FLOUR = new ItemSimple("wheat_flour");
	public static final Item CARAMEL_CUBE = new ItemEdible("caramel_cube", 4, 2.8f, false);
	public static final Item CREPE = new ItemEdible("crepe", 3, 0.5f, false);
	public static final Item CHOCOLATE_CREPE = new ItemEdible("chocolate_crepe", 8, 2f, false);
	public static final Item CARAMEL_CREPE = new ItemEdible("caramel_crepe", 9, 3.4f, false);
	public static final Item CANDY_CANE = new ItemEdible("candy_cane", 4, 1.8f, true);
	public static final Item BANDAGE = new ItemBandage();
	
	// SUPER MARIO
	public static final Item SUPER_MUSHROOM = new ItemEdibleEffect("super_mushroom", 3, 1f, false, new PotionEffect(Potion.getPotionById(8), 550, 1));
	public static final Item PEACH = new ItemEdible("peach", 4, 2.4f, true);
	public static final Item CAPE_FEATHER = new ItemCapeFeather();
	public static final Item SUPER_STAR = new ItemSuperStar();
	public static final Item YELLOW_COIN = new ItemSimple("yellow_coin");
	public static final Item RED_COIN = new ItemSimple("red_coin");
	public static final Item BLUE_COIN = new ItemSimple("blue_coin");
	public static final Item CAPPY = new ItemHelmet("cappy", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
	public static final Item LUIGI_CAP = new ItemHelmet("luigi_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, new PotionEffect(Potion.getPotionById(8), 1, 0), new PotionEffect(Potion.getPotionById(1), 1, 0));
	public static final Item WARIO_CAP = new ItemHelmet("wario_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, new PotionEffect(Potion.getPotionById(2), 1, 0), new PotionEffect(Potion.getPotionById(5), 1, 0));
	public static final Item WALUIGI_CAP = new ItemHelmet("waluigi_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, new PotionEffect(Potion.getPotionById(8), 1, 1));
	public static final Item VANISH_CAP = new ItemHelmet("vanish_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
	public static final Item WING_CAP = new ItemHelmet("wing_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
	public static final Item GOOIGI_CAP = new ItemHelmet("gooigi_cap", SoundEvents.BLOCK_SLIME_PLACE);
	public static final Item PRINCESS_PEACH_CROWN = new ItemHelmet("princess_peach_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON);
	public static final Item PRINCESS_DAISY_CROWN = new ItemHelmet("princess_daisy_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON);
	public static final Item SUPER_CROWN = new ItemHelmet("super_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON);
	
	// KIRBY
	public static final Item BANDANA = new ItemHelmet("bandana", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);

	// SUPER SMASH BROS.
	public static final Item SMASH_BALL = new ItemSmashBall();
	
	// OTHER
	public static final Item HEADPHONES = new ItemHelmet("headphones", SoundEvents.ITEM_ARMOR_EQUIP_IRON);
	public static final Item RECORD_BLANK = new ItemSimple("record_blank", 1);
	public static final Item RECORD_CHAMPIONS_ROAD = new ItemMusicDisc("champions_road", SoundHandler.RECORD_CHAMPIONS_ROAD);
	public static final Item RECORD_VAMPIRE_KILLER = new ItemMusicDisc("vampire_killer", SoundHandler.RECORD_VAMPIRE_KILLER);
	public static final Item RECORD_FLY_OCTO_FLY = new ItemMusicDisc("fly_octo_fly", SoundHandler.RECORD_FLY_OCTO_FLY);
	
	// YOUTUBE
	public static final Item MAYRO_CAP = new ItemHelmet("mayro_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, new PotionEffect(Potion.getPotionById(12), 1, 0));
	public static final Item NOTEBLOCK_HEAD = new ItemHelmet("noteblock_head", SoundEvents.ITEM_ARMOR_EQUIP_IRON);
	public static final Item RECORD_NB_SWEDEN = new ItemMusicDisc("nb_sweden", SoundHandler.RECORD_NB_SWEDEN);
	public static final Item RECORD_NB_BUOY_BASE_GALAXY = new ItemMusicDisc("nb_buoy_base_galaxy", SoundHandler.RECORD_NB_BUOY_BASE_GALAXY);
	public static final Item RECORD_NB_WALUIGI_PINBALL = new ItemMusicDisc("nb_waluigi_pinball", SoundHandler.RECORD_NB_WALUIGI_PINBALL);
	public static final Item RECORD_NB_HARVEST_HAZARDS = new ItemMusicDisc("nb_harvest_hazards", SoundHandler.RECORD_NB_HARVEST_HAZARDS);
}
