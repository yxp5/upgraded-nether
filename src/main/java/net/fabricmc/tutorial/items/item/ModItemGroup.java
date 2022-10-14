package net.fabricmc.tutorial.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.tutorial.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup TIER_1_ITEMS =
            FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "tier_1"), () -> new ItemStack(ModItems.BLAZING_INGOT));

    public static final ItemGroup TIER_2_ITEMS =
            FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "tier_2"), () -> new ItemStack(ModItems.FIERY_INGOT));

}
