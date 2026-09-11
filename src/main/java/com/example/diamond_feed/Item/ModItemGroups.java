package com.example.diamond_feed.Item;

import com.example.diamond_feed.DiamondApple;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class ModItemGroups {
    public static final ItemGroup  DIAMOND_FOOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DiamondApple.MOD_ID, "diamond_food_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DIAMOND_APPLE))
                    .displayName(Text.translatable("itemgroup.diamond_feed.diamond_food_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DIAMOND_APPLE);
                        entries.add(ModItems.DIAMOND_CARROT);
                        entries.add(ModItems.DIAMOND_NUGGET);
                        entries.add(ModItems.DIAMOND_MELON_SLICE);

                        entries.add(ModItems.DEBRIS_APPLE);
                        entries.add(ModItems.DEBRIS_CARROT);
                        entries.add(ModItems.DEBRIS_CARROT_COOKED);
                        entries.add(ModItems.DEBRIS_NUGGET);
                        entries.add(ModItems.DEBRIS_MELON_SLICE);

                        entries.add(ModItems.NETHERITE_APPLE);
                        entries.add(ModItems.NETHERITE_CARROT);









}).build());



    public static void registerItemGroups () {
        DiamondApple.LOGGER.info("Registering Item Groups for " + DiamondApple.MOD_ID);
    }



        }


