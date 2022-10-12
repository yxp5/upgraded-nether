package net.fabricmc.tutorial;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.tutorial.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final ItemGroup BETTER_NETHER = FabricItemGroupBuilder.build(new Identifier("tutorial","general"),
			() -> new ItemStack(Main.BLAZING_INGOT));

	public static final Item BLAZING_INGOT = new BlazingIngot(new FabricItemSettings().group(Main.BETTER_NETHER));
	public static final Item BLAZING_CORE = new BlazingCore(new FabricItemSettings().group(Main.BETTER_NETHER));

	public static final ArmorMaterial BLAZING_ARMOR = new BlazingArmor();
	public static final ToolItem BLAZING_SWORD = new BlazingSwordBase(BlazingTool.INSTANCE);
	public static final ToolItem BLAZING_PICKAXE = new BlazingPickaxeBase(BlazingTool.INSTANCE);
	public static final ToolItem BLAZING_AXE = new BlazingAxeBase(BlazingTool.INSTANCE);
	public static final ToolItem BLAZING_SHOVEL = new BlazingShovelBase(BlazingTool.INSTANCE);
	public static final ToolItem BLAZING_DAGGER = new BlazingDaggerBase(BlazingTool.INSTANCE);

	public static final Item FIERY_INGOT = new FieryIngot(new FabricItemSettings().group(Main.BETTER_NETHER));
	public static final Item FIERY_CORE = new FieryCore(new FabricItemSettings().group(Main.BETTER_NETHER));
	public static final Item FIERY_CONDENSATE = new FieryCondensate(new FabricItemSettings().group(Main.BETTER_NETHER));

	public static final ArmorMaterial FIERY_ARMOR = new FieryArmor();
	public static final ToolItem FIERY_SWORD = new FierySwordBase(FieryTool.INSTANCE);
	public static final ToolItem FIERY_PICKAXE = new FieryPickaxeBase(FieryTool.INSTANCE);
	public static final ToolItem FIERY_AXE = new FieryAxeBase(FieryTool.INSTANCE);
	public static final ToolItem FIERY_SHOVEL = new FieryShovelBase(FieryTool.INSTANCE);
	public static final ToolItem FIERY_DAGGER = new FieryDaggerBase(FieryTool.INSTANCE);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_ingot"), BLAZING_INGOT);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_core"), BLAZING_CORE);

		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_helmet"), new BlazingArmorBase(BLAZING_ARMOR, EquipmentSlot.HEAD, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_chestplate"), new BlazingArmorBase(BLAZING_ARMOR, EquipmentSlot.CHEST, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_leggings"), new BlazingArmorBase(BLAZING_ARMOR, EquipmentSlot.LEGS, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_boots"), new BlazingArmorBase(BLAZING_ARMOR, EquipmentSlot.FEET, new FabricItemSettings().group(BETTER_NETHER)));

		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_sword"), BLAZING_SWORD);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_pickaxe"), BLAZING_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_axe"), BLAZING_AXE);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_shovel"), BLAZING_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "blazing_dagger"), BLAZING_DAGGER);

		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_ingot"), FIERY_INGOT);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_core"), FIERY_CORE);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_condensate"), FIERY_CONDENSATE);

		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_helmet"), new FieryArmorBase(FIERY_ARMOR, EquipmentSlot.HEAD, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_chestplate"), new FieryArmorBase(FIERY_ARMOR, EquipmentSlot.CHEST, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_leggings"), new FieryArmorBase(FIERY_ARMOR, EquipmentSlot.LEGS, new FabricItemSettings().group(BETTER_NETHER)));
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_boots"), new FieryArmorBase(FIERY_ARMOR, EquipmentSlot.FEET, new FabricItemSettings().group(BETTER_NETHER)));

		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_sword"), FIERY_SWORD);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_pickaxe"), FIERY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_axe"), FIERY_AXE);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_shovel"), FIERY_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "fiery_dagger"), FIERY_DAGGER);
	}
}
