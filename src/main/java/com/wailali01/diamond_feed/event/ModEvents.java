package com.wailali01.diamond_feed.event;

import com.wailali01.diamond_feed.DiamondApple;
import com.wailali01.diamond_feed.item.ModItems;
import com.wailali01.diamond_feed.potion.ModPotions;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(
                Potions.AWKWARD,
                ModItems.DIAMOND_MELON_SLICE.get(),
                ModPotions.MASTER_HEALING
        );
    }


}
