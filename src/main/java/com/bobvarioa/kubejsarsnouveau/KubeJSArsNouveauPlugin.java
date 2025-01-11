package com.bobvarioa.kubejsarsnouveau;

import com.bobvarioa.kubejsarsnouveau.recipes.*;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchemaRegistry;
import net.minecraft.resources.ResourceLocation;

public class KubeJSArsNouveauPlugin implements KubeJSPlugin {
    @Override
    public void registerRecipeSchemas(RecipeSchemaRegistry event) {
        event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau", "enchanting_apparatus"), EnchantingApparatusRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau","enchantment"), EnchantmentRecipeJS.SCHEMA);
        //event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau","crush"), CrushRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau","imbuement"), ImbuementRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau","glyph"), GlyphRecipeJS.SCHEMA);
        //event.register(ResourceLocation.fromNamespaceAndPath("ars_nouveau","caster_tome"), CasterTomeRecipeJS.SCHEMA);
    }
}
