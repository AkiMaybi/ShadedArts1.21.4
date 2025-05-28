package net.akimaybi.shadedarts.datagen;

import net.akimaybi.shadedarts.block.ModBlocks;
import net.akimaybi.shadedarts.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHADE_TILE);



        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_SHADE_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_SHADE_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_SHADE_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SHADE_TILE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ARTFUL_STAFF, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADED_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADE_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOID_STAR, Models.GENERATED);
    }
}
