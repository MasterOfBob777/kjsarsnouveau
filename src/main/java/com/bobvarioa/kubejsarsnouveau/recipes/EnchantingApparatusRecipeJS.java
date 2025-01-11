package com.bobvarioa.kubejsarsnouveau.recipes;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public interface EnchantingApparatusRecipeJS {

    RecipeKey<List<Ingredient>> PEDESTAL_ITEMS = IngredientComponent.INGREDIENT.asList().key("pedestalItems", ComponentRole.INPUT);

    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.key("reagent", ComponentRole.INPUT);

    RecipeKey<ItemStack> OUTPUT = ItemStackComponent.ITEM_STACK.key("result", ComponentRole.OUTPUT);

    RecipeKey<Integer> SOURCE = NumberComponent.INT.key("sourceCost", ComponentRole.OTHER).alt("source").optional(0);

    RecipeKey<Boolean> KEEP_NBT = BooleanComponent.BOOLEAN.key("keepNbtOfReagent", ComponentRole.OTHER).alt("keepNbt").optional(false);


    RecipeSchema SCHEMA = new RecipeSchema(PEDESTAL_ITEMS, INPUT, OUTPUT, SOURCE, KEEP_NBT);
}
