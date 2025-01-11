package com.bobvarioa.kubejsarsnouveau.recipes;

import com.bobvarioa.kubejsarsnouveau.components.ArsComponents;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public interface CrushRecipeJS {

    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.key("input", ComponentRole.INPUT);

    RecipeKey<ItemStack> CRUSH_OUTPUTS = ArsComponents.CRUSH_OUTPUT.key("output", ComponentRole.OUTPUT);

    RecipeKey<Boolean> SKIP_BLOCK_PLACE = BooleanComponent.BOOLEAN.key("skip_block_place", ComponentRole.OTHER).optional(true);

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, CRUSH_OUTPUTS, SKIP_BLOCK_PLACE);

}