package com.wailali01.diamond_feed.item;

import com.wailali01.diamond_feed.DiamondApple;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DiamondApple.MOD_ID);

    public static final DeferredItem<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_MELON_SLICE = ITEMS.register("diamond_melon_slice",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMOND_APPLE).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMOND_CARROT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
