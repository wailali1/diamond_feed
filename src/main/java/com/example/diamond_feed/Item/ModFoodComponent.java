package com.example.diamond_feed.Item;

import net.minecraft.component.type.FoodComponent;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class ModFoodComponent {
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().nutrition(8).saturationModifier(1.0625f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 2), 0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 9600, 2), 0.25f)
            .alwaysEdible()
            .build();
    public static final FoodComponent DIAMOND_CARROT = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 1), 0.3f)
            .alwaysEdible()
            .build();

    public static final FoodComponent DEBRIS_APPLE = new FoodComponent.Builder().nutrition(8).saturationModifier(1.0625f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 14400,0 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,4800 ,2 ), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,7200 ,4 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200,2 ),0.75f )
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,9600 ,4 ),0.2f )

            .alwaysEdible().build();
    public static final FoodComponent DEBRIS_CARROT = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,3600 ,0 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,2400 ,1 ),0.25f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,3600 ,0 ),0.45f )
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,4800  ,2 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900 ,1 ),1.0f )


            .alwaysEdible().build();

    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,21600 ,0 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,8400 ,3 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,8400 ,6 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,2400 ,4 ),0.60f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,2400 ,3 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,12000 ,6 ),0.35f )


            .alwaysEdible().build();
    public static final FoodComponent NETHERITE_CARROT = new FoodComponent.Builder().nutrition(12).saturationModifier(0.83333333333333333333333333333333333333f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,7200 ,0 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,3600 ,2 ),0.25f )
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,6000 ,3 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,4800 ,1 ),0.5f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,1200 ,2 ),0.20f )
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,1800 ,1 ),1.0f )
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,7200 ,0 ),0.1f )
            .alwaysEdible().build();
}

