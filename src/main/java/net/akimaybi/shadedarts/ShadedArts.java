package net.akimaybi.shadedarts;

import net.akimaybi.shadedarts.block.ModBlocks;
import net.akimaybi.shadedarts.item.ModItemGroups;
import net.akimaybi.shadedarts.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadedArts implements ModInitializer {
	public static final String MOD_ID = "shadedarts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}