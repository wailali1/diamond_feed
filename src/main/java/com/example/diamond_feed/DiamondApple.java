package com.example.diamond_feed;

import com.example.diamond_feed.Item.ModCreativeModeTabs;
import com.example.diamond_feed.Item.ModItems;
import com.example.diamond_feed.food.ModFood;
import com.example.diamond_feed.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.resources.Identifier;

import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondApple implements ModInitializer {
	public static final String MOD_ID = "diamond_feed";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModPotions.registerPotions();

		FabricPotionBrewingBuilder.BUILD.register(builder -> {
			builder.addMix(
					Potions.AWKWARD,
					ModItems.DIAMOND_MELON_SLICE,
					ModPotions.MASIER_HEALING
			);
		});
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);


	}


}
