package com.example.diamond_feed.potion;

import com.example.diamond_feed.DiamondApple;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {
        public static final Holder<Potion> MASIER_HEALING = registerPotion("master_healing",
                new Potion("master_healing", new MobEffectInstance(MobEffects.REGENERATION, 600, 2),
                        new MobEffectInstance(MobEffects.RESISTANCE,2400,0)));

        private static Holder<Potion> registerPotion(String name, Potion potion) {
            return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(DiamondApple.MOD_ID, name), potion);
        }

        public static void registerPotions() {
            DiamondApple.LOGGER.info("Registering potions for " + DiamondApple.MOD_ID);
        }
}
