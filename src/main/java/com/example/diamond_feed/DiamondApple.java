package com.example.diamond_feed;

import com.example.diamond_feed.Item.ModCreativeModeTabs;
import com.example.diamond_feed.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondApple implements ModInitializer {
	public static final String MOD_ID = "diamond_feed";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModCreativeModeTabs.registerModCreativeModeTabs();






		}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
