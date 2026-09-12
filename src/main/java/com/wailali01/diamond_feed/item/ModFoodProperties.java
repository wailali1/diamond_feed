package com.wailali01.diamond_feed.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.0625f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,4800,3),1.0f )
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,9600,2),0.25f )
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,1200,2),1.0f )
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,4800,1),1.0f )
            .effect(() -> new MobEffectInstance(MobEffects.HEAL,2,1),0.75f )
            .alwaysEdible().build();
    public static final FoodProperties DIAMOND_CARROT = new FoodProperties.Builder().nutrition(10).saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,2400,0),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,600,1),1.0f )
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2400,0),0.10f )
            .effect(() -> new MobEffectInstance(MobEffects.HEAL,2,1),0.30f )
            .alwaysEdible().build();
}
