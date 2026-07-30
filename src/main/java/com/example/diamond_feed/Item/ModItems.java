package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ModItems {

    public static final Item DIAMOND_APPLE = register("diamond_apple", Item::new,
            new Item.Settings().food(ModFoodComponent.DIAMOND_APPLE, ModConsumableComponent.DIAMOND_APPLE).rarity(Rarity.UNCOMMON));
    public static final Item DIAMOND_NUGGET = register("diamond_nugget",
            Item::new, new Item.Settings());
    public static final Item DIAMOND_CARROT = register("diamond_carrot",
            Item::new, new Item.Settings().food(ModFoodComponent.DIAMOND_CARROT,ModConsumableComponent.DIAMOND_CARROT));


    private static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        Identifier id = Identifier.of("diamond_feed", name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);


        Item item = itemFactory.apply(settings.registryKey(key));

        return Registry.register(Registries.ITEM, key, item);
    }



    public static void registerModItems () {
        DiamondApple.LOGGER.info("Registering Item Groups for " + DiamondApple.MOD_ID);
    }
}
