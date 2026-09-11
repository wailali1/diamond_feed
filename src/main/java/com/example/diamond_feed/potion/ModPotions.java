package com.example.diamond_feed.potion;

import com.example.diamond_feed.DiamondApple;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> DIAMOND_MELON_MASTER = registerPotion("diamond_melon_master",
            new Potion(new StatusEffectInstance(StatusEffects.REGENERATION,600,2)
                    ,new StatusEffectInstance(StatusEffects.RESISTANCE,2400,0)));
    public static final RegistryEntry<Potion> DIAMOND_MELON_MASTER_II = registerPotion("diamond_melon_master_ii",
            new Potion(new StatusEffectInstance(StatusEffects.REGENERATION,300,3)
                    ,new StatusEffectInstance(StatusEffects.RESISTANCE,1200,1)));

    public static final RegistryEntry<Potion> DEBRIS_MELON_MASTER = registerPotion("debris_melon_master",
            new Potion(new StatusEffectInstance(StatusEffects.REGENERATION,300,4)
                    ,new StatusEffectInstance(StatusEffects.RESISTANCE,1200,2)));

    public static final RegistryEntry<Potion> DEBRIS_CARROT_COOKED_MASTER = registerPotion("test",
            new Potion(new StatusEffectInstance(StatusEffects.STRENGTH,3600,1)
                    ,new StatusEffectInstance(StatusEffects.SPEED,3600,2)
                    ,new StatusEffectInstance(StatusEffects.HASTE,6000,1)));
    public static final RegistryEntry<Potion> DEBRIS_CARROT_COOKED_MASTER_II = registerPotion("test_ii",
            new Potion(new StatusEffectInstance(StatusEffects.STRENGTH,1800,2)
                    ,new StatusEffectInstance(StatusEffects.SPEED,1800,3)
                    ,new StatusEffectInstance(StatusEffects.HASTE,3600,2)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(DiamondApple.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        DiamondApple.LOGGER.info("Registering Mod Potions for " + DiamondApple.MOD_ID);
    }
}

