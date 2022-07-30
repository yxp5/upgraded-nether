package net.fabricmc.tutorial.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class FieryCore extends Item {

    public FieryCore(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("Crystallized lava concentrate"));
        tooltip.add(new TranslatableText("Contains a medium amount of otherworldly energy"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 2 Energy").formatted(Formatting.YELLOW));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }

    }

}
