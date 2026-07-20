package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget",
      new Item(new Item.Settings()));



public static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(DiamondApple.MOD_ID, name),item);
}
public static void registerModItems() {
    DiamondApple.LOGGER.info("Registering Mod items for" + DiamondApple.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
        entries.add(DIAMOND_NUGGET);
    });
}
}
