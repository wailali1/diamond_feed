package com.example.diamond_feed.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.example.diamond_feed.DiamondApple;
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
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", setting -> new Item(setting
            .food(ModFoodComponent.DIAMOND_APPLE,ModConsumableComponent.DIAMOND_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot",setting -> new Item(setting
            .food(ModFoodComponent.DIAMOND_CARROT,ModConsumableComponent.DIAMOND_CARROT)));
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget", Item::new);


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(DiamondApple.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DiamondApple.MOD_ID, name)))));
    }




    public static void registerModItems () {
        DiamondApple.LOGGER.info("Registering Item Groups for " + DiamondApple.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.DIAMOND_APPLE);
            entries.add(ModItems.DIAMOND_CARROT);



        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.DIAMOND_NUGGET);
        });
    }

}
