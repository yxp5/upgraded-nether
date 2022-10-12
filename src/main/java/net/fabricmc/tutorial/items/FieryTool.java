package net.fabricmc.tutorial.items;

import net.fabricmc.tutorial.Main;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FieryTool implements ToolMaterial {

    public static final FieryTool INSTANCE = new FieryTool();

    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.5f;
    }

    @Override
    public float getAttackDamage() {
        return 3.5f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 19;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Main.FIERY_INGOT);
    }
}
