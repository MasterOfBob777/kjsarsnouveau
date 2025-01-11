package com.bobvarioa.kubejsarsnouveau.components;

import com.google.gson.JsonObject;
import dev.latvian.mods.kubejs.recipe.KubeRecipe;
import dev.latvian.mods.kubejs.recipe.component.*;
import net.minecraft.world.item.ItemStack;

public class ArsComponents {

    public static RecipeComponent<ItemStack> CRUSH_OUTPUT = new RecipeComponentWithParent<ItemStack>() {

        @Override
        public RecipeComponent<ItemStack> parentComponent() {
            return ItemStackComponent.ITEM_STACK;
        }

        @Override
        public void writeToJson(KubeRecipe recipe, RecipeComponentValue<ItemStack> cv, JsonObject json) {
            if (cv.value != null) json.addProperty("maxRange", String.valueOf(cv.getValue()));
        }
    };
}
