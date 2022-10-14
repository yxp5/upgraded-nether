package net.fabricmc.tutorial.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BLAZING_BLOCK =
            registerBlock("blazing_block",
                    new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.TIER_1_ITEMS);

    private static Block registerBlock(String pName, Block pBlock, ItemGroup pGroup) {
        registerBlockItem(pName, pBlock, pGroup);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, pName), pBlock);
    }

    private static Item registerBlockItem(String pName, Block pBlock, ItemGroup pGroup) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, pName),
                new BlockItem(pBlock, new FabricItemSettings().group(pGroup)));
    }

    public static void registerModBlocks() {}
}
