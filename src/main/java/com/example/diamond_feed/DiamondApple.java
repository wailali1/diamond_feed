package com.example.diamond_feed;

import com.example.diamond_feed.Item.ModItemGroups;
import com.example.diamond_feed.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondApple implements ModInitializer {
	public static final String MOD_ID = "diamond_feed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();








	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
