package com.wailali01.diamond_feed;

import com.wailali01.diamond_feed.event.ModEvents;
import com.wailali01.diamond_feed.item.ModCreativeModeTabs;
import com.wailali01.diamond_feed.item.ModItems;
import com.wailali01.diamond_feed.potion.ModPotions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.Event;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.wailali01.diamond_feed.item.ModItems.*;
import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.MOD_ID;
import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.getFmlVersion;


@Mod(DiamondApple.MOD_ID)
public class DiamondApple {

    public static final String MOD_ID = "diamond_feed";
    public static final Logger LOGGER = LogUtils.getLogger();


    public DiamondApple(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        NeoForge.EVENT_BUS.register(ModEvents.class);

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModPotions.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(DIAMOND_NUGGET);
            event.accept(DIAMOND_MELON_SLICE);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(DIAMOND_APPLE);
            event.accept(DIAMOND_CARROT);
        }

    }



    private void commonSetup(FMLCommonSetupEvent event) {

    }
    @SubscribeEvent
    public void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(
                Potions.AWKWARD,
                ModItems.DIAMOND_MELON_SLICE.get(),
                ModPotions.MASTER_HEALING
        );
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }



}
