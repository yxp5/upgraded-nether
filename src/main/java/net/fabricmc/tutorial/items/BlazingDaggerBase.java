package net.fabricmc.tutorial.items;

import net.fabricmc.tutorial.Main;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BlazingDaggerBase extends SwordItem {

    public BlazingDaggerBase(ToolMaterial material) {
        super(material, 0, -1f, new Settings().group(Main.BETTER_NETHER));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("Favorite weapon of Nether Hunters"));
        tooltip.add(new TranslatableText("Deals Insane damage per second"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 1 Weapon").formatted(Formatting.GRAY));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.knockbackVelocity = 0;
        target.setHealth(target.getHealth()-1);
        return super.postHit(stack, target, attacker);
    }
}
