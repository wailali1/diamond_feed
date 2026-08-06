package com.example.diamond_feed.Item;


import net.minecraft.component.type.FoodComponent;


public class ModFoodComponent {
    public static final FoodComponent DIAMOND_APPLE =new FoodComponent.Builder().nutrition(8).saturationModifier(1.0625f)
            .alwaysEdible()
            .build();


    public static final FoodComponent DIAMOND_CARROT = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f)
            .alwaysEdible()
            .build();


}
