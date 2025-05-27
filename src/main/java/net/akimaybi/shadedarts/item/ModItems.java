package net.akimaybi.shadedarts.item;

import net.akimaybi.shadedarts.ShadedArts;
import net.akimaybi.shadedarts.item.custom.ArtfulStaff;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHADE_GEM = registerItem("shade_gem",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(ShadedArts.MOD_ID,"shade_gem")))));
    public static final Item SHADED_SHARD = registerItem("shaded_shard",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(ShadedArts.MOD_ID,"shaded_shard")))));
    public static final Item ARTFUL_STAFF = registerItem("artful_staff",
            new ArtfulStaff(new Item.Settings().maxDamage(16).registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(ShadedArts.MOD_ID,"artful_staff")))));
    public static final Item VOID_STAR = registerItem("void_star",
            new Item(new Item.Settings().food(ModFoodComponents.VOIDSTAR, ModConsumableComponents.VOIDSTAR).registryKey(RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(ShadedArts.MOD_ID,"void_star")))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShadedArts.MOD_ID, name), item);
    }

    public static void registerModItems() {

        ShadedArts.LOGGER.info("Reg. mod items");


    }
}
