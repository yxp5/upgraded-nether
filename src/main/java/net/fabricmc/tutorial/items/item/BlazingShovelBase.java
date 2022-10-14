package net.fabricmc.tutorial.item;

import net.fabricmc.tutorial.Main;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BlazingShovelBase extends ShovelItem {

    public BlazingShovelBase(ToolMaterial material) {
        super(material, 0.5f, -2.8f, new Settings().group(Main.BETTER_NETHER));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("Faster than iron shovel with more durability"));
        tooltip.add(new TranslatableText("Grant you better chance while enchanting"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 1 Tool").formatted(Formatting.GRAY));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }
    }
}
