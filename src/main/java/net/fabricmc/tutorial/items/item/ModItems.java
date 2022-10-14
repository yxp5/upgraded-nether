package net.fabricmc.tutorial.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.tutorial.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // TIER 1 ITEMS
    public static final Item BLAZING_INGOT =
            registerItem("blazing_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TIER_1_ITEMS)));
    public static final Item BLAZING_CORE =
            registerItem("blazing_core", new Item(new FabricItemSettings().group(ModItemGroup.TIER_1_ITEMS)));
    // TIER 2 ITEMS
    public static final Item FIERY_INGOT =
            registerItem("fiery_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TIER_2_ITEMS)));
    public static final Item FIERY_CORE =
            registerItem("fiery_core", new Item(new FabricItemSettings().group(ModItemGroup.TIER_2_ITEMS)));
    public static final Item FIERY_CONDENSATE =
            registerItem("fiery_condensate", new Item(new FabricItemSettings().group(ModItemGroup.TIER_2_ITEMS)));

    private static Item registerItem(String pName, Item pItem) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, pName), pItem);
    }

    public static void registerModItems() {}
}
