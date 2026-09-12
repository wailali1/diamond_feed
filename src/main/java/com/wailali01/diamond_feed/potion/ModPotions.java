package com.wailali01.diamond_feed.potion;

import com.wailali01.diamond_feed.DiamondApple;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(BuiltInRegistries.POTION, DiamondApple.MOD_ID);

    public static final Holder<Potion> MASTER_HEALING = POTIONS.register(
            "diamond_melon_master",
            () -> new Potion(
                    new MobEffectInstance(MobEffects.REGENERATION, 600, 2),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0)
            )
    );

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}