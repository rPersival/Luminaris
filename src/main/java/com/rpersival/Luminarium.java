package com.rpersival;

import com.rpersival.registry.RegistryHandler;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Luminarium implements ModInitializer {
	public static final String MOD_ID = "luminarium";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		registerEverything();
	}

	public static void registerEverything() {
		RegistryHandler.registerGroups();
		RegistryHandler.registerItems();
		RegistryHandler.registerBlocks();
	}
}