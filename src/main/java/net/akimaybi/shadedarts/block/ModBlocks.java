package net.akimaybi.shadedarts.block;

import net.akimaybi.shadedarts.ShadedArts;
import net.akimaybi.shadedarts.block.custom.BlindingTrap;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SHADE_TILE = registerBlock("shade_tile",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL));
    public static final Block PURPLE_SHADE_TILE = registerBlock("purple_shade_tile",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL));
    public static final Block GREEN_SHADE_TILE = registerBlock("green_shade_tile",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL));
    public static final Block YELLOW_SHADE_TILE = registerBlock("yellow_shade_tile",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL));
    public static final Block RED_SHADE_TILE = registerBlock("red_shade_tile",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL));





    public static final Block Blinding_Trap = registerBlock("blinding_trap",
            BlindingTrap.Settings.create().strength(3f).sounds(BlockSoundGroup.WOOL));








    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ShadedArts.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ShadedArts.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }





    public static void registerModBlocks() {
        ShadedArts.LOGGER.info("Reg. mod blocks");


    }
}
