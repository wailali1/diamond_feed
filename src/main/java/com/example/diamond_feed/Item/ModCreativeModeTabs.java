package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTabs {

    public static final CreativeModeTab DIAMOND_FOOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DiamondApple.MOD_ID, "diamond_food_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_APPLE))
                    .title(Component.translatable("creativemodetab.diamond_feed.diamond_food_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DIAMOND_APPLE);
                        output.accept(ModItems.DIAMOND_CARROT);
                        output.accept(ModItems.DIAMOND_NUGGET);
                        output.accept(ModItems.DIAMOND_MELON_SLICE);



                    }).build());



    public static void registerModCreativeModeTabs() {
        DiamondApple.LOGGER.info("Registering Creative Mode Tabs for " + DiamondApple.MOD_ID);
    }
}


