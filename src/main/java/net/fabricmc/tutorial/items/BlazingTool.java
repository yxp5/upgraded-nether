package net.fabricmc.tutorial.items;

import net.fabricmc.tutorial.Main;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BlazingTool implements ToolMaterial {

    public static final BlazingTool INSTANCE = new BlazingTool();

    @Override
    public int getDurability() {
        return 275;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Main.BLAZING_INGOT);
    }
}
