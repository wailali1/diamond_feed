package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget",
      new Item(new Item.Settings()));
    public static  final  Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new Item.Settings().food(ModFoodComponent.DIAMOND_APPLE).rarity(Rarity.UNCOMMON)));
    public static final  Item DIAMOND_CARROT = registerItem("diamond_carrot",
            new Item(new Item.Settings().food(ModFoodComponent.DIAMOND_CARROT)));
    public static final Item  DIAMOND_MELON_SLICE = registerItem("diamond_melon_slice",
            new Item(new Item.Settings()));

    public static final Item DEBRIS_APPLE = registerItem("debris_apple",
            new Item(new Item.Settings().food(ModFoodComponent.DEBRIS_APPLE).rarity(Rarity.EPIC)));
    public static final Item DEBRIS_CARROT = registerItem("debris_carrot",
            new Item(new Item.Settings().food(ModFoodComponent.DEBRIS_CARROT).rarity(Rarity.RARE)));
    public static final Item DEBRIS_CARROT_COOKED = registerItem("debris_carrot_cooked",
            new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item DEBRIS_MELON_SLICE = registerItem("debris_melon_slice",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item DEBRIS_NUGGET = registerItem("debris_nugget",
            new Item(new Item.Settings()));


    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings().food(ModFoodComponent.NETHERITE_APPLE).rarity(Rarity.EPIC)));
    public static final Item NETHERITE_CARROT = registerItem("netherite_carrot",
            new Item(new Item.Settings().food(ModFoodComponent.NETHERITE_CARROT).rarity(Rarity.EPIC)));





public static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(DiamondApple.MOD_ID, name),item);
}
public static void registerModItems() {
    DiamondApple.LOGGER.info("Registering Mod items for" + DiamondApple.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
        entries.add(DIAMOND_NUGGET);
        entries.add(DIAMOND_MELON_SLICE);

        entries.add(DEBRIS_NUGGET);
        entries.add(DEBRIS_MELON_SLICE);
        entries.add(DEBRIS_CARROT_COOKED);


    });
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
        entries.add(DIAMOND_APPLE);
        entries.add(DIAMOND_CARROT);

        entries.add(DEBRIS_APPLE);
        entries.add(DEBRIS_CARROT);

        entries.add(NETHERITE_APPLE);
        entries.add(NETHERITE_CARROT);

    ;});
}
}
