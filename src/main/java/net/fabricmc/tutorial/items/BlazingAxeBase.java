package net.fabricmc.tutorial.items;

import net.fabricmc.tutorial.Main;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BlazingAxeBase extends AxeItem {

    public BlazingAxeBase(ToolMaterial material) {
        super(material, 5.5f, -3f, new Settings().group(Main.NEW_ITEM_GROUP));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("Faster than iron axe with more durability"));
        tooltip.add(new TranslatableText("Grant you better luck while enchanting this axe"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 1 Tool").formatted(Formatting.GRAY));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }
    }
}
