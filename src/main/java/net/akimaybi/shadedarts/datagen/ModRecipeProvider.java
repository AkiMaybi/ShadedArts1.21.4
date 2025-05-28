package net.akimaybi.shadedarts.datagen;

import net.akimaybi.shadedarts.block.ModBlocks;
import net.akimaybi.shadedarts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> SHADED_SHARD_CRAFTABLES = List.of(ModItems.SHADED_SHARD);

                offerReversibleCompactingRecipes(RecipeCategory.MISC, ModItems.SHADED_SHARD, RecipeCategory.MISC, ModItems.SHADE_GEM);

                createShaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.SHADE_TILE, 8)
                        .pattern("RRR")
                        .pattern("RAR")
                        .pattern("RRR")
                        .input('R', Items.WHITE_WOOL)
                        .input('A', ModItems.SHADE_GEM)
                        .criterion(hasItem(ModItems.SHADE_GEM), conditionsFromItem(ModItems.SHADE_GEM))
                        .offerTo(exporter);




            }
        };
    }

    @Override
    public String getName() {
        return "Shaded Recipes";
    }
}
