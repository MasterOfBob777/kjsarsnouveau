package com.bobvarioa.kubejsarsnouveau.recipes;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

import java.util.Map;

public interface CasterTomeRecipeJS {

    /*

    RecipeKey<String> TOME_TYPE = StringComponent.ANY.key("tome_type", ComponentRole.OTHER).optional("ars_nouveau:caster_tome").alt("tomeType");
    RecipeKey<String> NAME = StringComponent.ANY.key("name", ComponentRole.OTHER);
    RecipeKey<String> FLAVOUR_TEXT = StringComponent.ANY.key("flavour_text", ComponentRole.OTHER).alt("description", "flavor_text", "flavorText", "flavourText");

    RecipeKey<String> TYPE = StringComponent.ANY.key("type", ComponentRole.OTHER).optional("ars_nouveau:constant");

    RecipeComponentBuilder COLOR_COMPONENT = RecipeComponent.builder()
            .add(StringComponent.ANY.key("type", null).optional("ars_nouveau:constant"))
            .add(NumberComponent.INT.key("red"))
            .add(NumberComponent.INT.key("green"))
            .add(NumberComponent.INT.key("blue"));
    RecipeKey<RecipeComponentBuilder> COLOR = COLOR_COMPONENT.key("color");
    RecipeKey<String[]> SPELL = StringComponent.ANY.key("spell");

    RecipeComponentBuilder SOUND_COMPONENT = RecipeComponent.builder()
            .add(StringComponent.ANY.key("family").optional("default"))
            .add(NumberComponent.FLOAT.key("volume"))
            .add(NumberComponent.FLOAT.key("pitch"));

    RecipeKey<RecipeComponentBuilder> SOUND = SOUND_COMPONENT.key("sound");

    RecipeSchema SCHEMA = new RecipeSchema(TOME_TYPE, NAME, SPELL, FLAVOUR_TEXT, COLOR,  SOUND).constructor(NAME, SPELL, FLAVOUR_TEXT, COLOR, SOUND).constructor(NAME);

     */

}