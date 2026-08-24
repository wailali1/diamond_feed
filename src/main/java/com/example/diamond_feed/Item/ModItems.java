package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;
import com.example.diamond_feed.food.ModFood;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;


public class ModItems {
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget", Item::new);
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", properties -> new Item(properties
            .food(ModFood.DIAMOND_APPLE, ModFood.DIAMOND_APPLE_COM).rarity(Rarity.UNCOMMON)));
    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot", properties -> new Item(properties
            .food(ModFood.DIAMOND_CARROT, ModFood.DIAMOND_CAROOT_COM)));
    public static final Item DIAMOND_MELON_SLICE = registerItem("diamond_melon_slice",Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(DiamondApple.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DiamondApple.MOD_ID, name)))));
    }

    public static void registerModItems() {
        DiamondApple.LOGGER.info("Registering Item Groups for " + DiamondApple.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(DIAMOND_APPLE);
            output.accept(DIAMOND_CARROT);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(DIAMOND_NUGGET);
            output.accept(DIAMOND_MELON_SLICE);
        });




    }

}



