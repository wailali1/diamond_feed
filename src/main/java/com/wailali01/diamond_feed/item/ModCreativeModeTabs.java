package com.wailali01.diamond_feed.item;

import com.wailali01.diamond_feed.DiamondApple;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiamondApple.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_APPLE.get()))
                    .title(Component.translatable("creativetab.diamond_feed.diamond_food_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DIAMOND_APPLE);
                        output.accept(ModItems.DIAMOND_CARROT);
                        output.accept(ModItems.DIAMOND_NUGGET);
                        output.accept(ModItems.DIAMOND_MELON_SLICE);



                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
