package com.example.diamond_feed.food;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFood {
    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.0625f).alwaysEdible().build();
    public static final FoodProperties DIAMOND_CARROT = new FoodProperties.Builder().nutrition(10).saturationModifier(1f).alwaysEdible().build();

    public static final Consumable DIAMOND_APPLE_COM = Consumables.defaultFood()
            .consumeSeconds(1.6f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION ,4800,3 ),1.0F ))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE ,2400,1 ),1.0F ))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION,1200,0 ),1.0F ))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH ,2,2 ),0.75F ))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST ,9600,2 ),0.25F ))
            .build();
    public static final Consumable DIAMOND_CAROOT_COM = Consumables.defaultFood()
            .consumeSeconds(1.6f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION,4800,0),1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION,600,1),1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE,2400,0),0.1F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,2,1),0.3F))
            .build();


}
