package com.example.diamond_feed;

import com.example.diamond_feed.Item.ModFoodComponent;
import com.example.diamond_feed.Item.ModItemGroups;
import com.example.diamond_feed.Item.ModItems;
import com.example.diamond_feed.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
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
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.DIAMOND_MELON_SLICE, ModPotions.DIAMOND_MELON_MASTER);
			builder.registerPotionRecipe(ModPotions.DIAMOND_MELON_MASTER, Items.GLOWSTONE_DUST, ModPotions.DIAMOND_MELON_MASTER_II);

			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.DEBRIS_CARROT_COOKED, ModPotions.DEBRIS_CARROT_COOKED_MASTER);
			builder.registerPotionRecipe(ModPotions.DEBRIS_CARROT_COOKED_MASTER, Items.GLOWSTONE_DUST, ModPotions.DEBRIS_CARROT_COOKED_MASTER_II);

			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.DEBRIS_MELON_SLICE, ModPotions.DEBRIS_MELON_MASTER);

		});


	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}



}

