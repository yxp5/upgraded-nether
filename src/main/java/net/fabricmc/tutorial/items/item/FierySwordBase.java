package net.fabricmc.tutorial.item;

import net.fabricmc.tutorial.Main;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class FierySwordBase extends SwordItem {

    public FierySwordBase(ToolMaterial material) {
        super(material, 3, -2.3f, new Settings().group(Main.BETTER_NETHER));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("An upgraded melee weapon for average explorer"));
        tooltip.add(new TranslatableText("Grant you even better chance while enchanting"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 2 Weapon").formatted(Formatting.YELLOW));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }
    }
}
