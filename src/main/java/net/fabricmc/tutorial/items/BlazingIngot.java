package net.fabricmc.tutorial.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class BlazingIngot extends Item {

    public BlazingIngot(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        // playerEntity.setVelocity(playerEntity.getVelocity().x, 5, playerEntity.getVelocity().z);
        playerEntity.playSound(SoundEvents.BLOCK_LAVA_POP, 1.0F, 1.4F/(RANDOM.nextFloat()*.4F+.8F));

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // Basic Info
        tooltip.add(new TranslatableText("Commonly used by novice explorers to upgrade their iron equipments"));

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("Tier 1 Material").formatted(Formatting.GRAY));
        } else {
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }

    }

}
