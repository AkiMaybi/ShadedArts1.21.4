package net.akimaybi.shadedarts.item;

import net.akimaybi.shadedarts.ShadedArts;
import net.akimaybi.shadedarts.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SHADED_ARTS_GENERAL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ShadedArts.MOD_ID, "shaded_arts_general"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHADE_GEM))
                    .displayName(Text.translatable("itemgroup.shadedarts.shaded_arts_general"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHADE_GEM);
                        entries.add(ModBlocks.SHADE_TILE);
                        entries.add(ModBlocks.PURPLE_SHADE_TILE);
                        entries.add(ModBlocks.GREEN_SHADE_TILE);
                        entries.add(ModBlocks.YELLOW_SHADE_TILE);
                        entries.add(ModBlocks.RED_SHADE_TILE);



                        entries.add(ModItems.SHADED_SHARD);
                        entries.add(ModItems.ARTFUL_STAFF);
                    }).build());



    public static void registerItemGroups() {
        ShadedArts.LOGGER.info("reg. item groups");
    }
}
