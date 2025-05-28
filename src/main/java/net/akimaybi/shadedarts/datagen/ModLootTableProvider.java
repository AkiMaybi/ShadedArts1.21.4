package net.akimaybi.shadedarts.datagen;

import net.akimaybi.shadedarts.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SHADE_TILE);
        addDrop(ModBlocks.PURPLE_SHADE_TILE);
        addDrop(ModBlocks.GREEN_SHADE_TILE);
        addDrop(ModBlocks.YELLOW_SHADE_TILE);
        addDrop(ModBlocks.RED_SHADE_TILE);


    }
}
