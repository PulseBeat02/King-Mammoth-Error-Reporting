package com.pulsebeat_02.kingmammoth.plot.advancements;

import ibxm.Player;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.util.ResourceLocation;

public class AdvancementChecker {
	
	public static boolean hasAdvancement(Player player, Advancement adv, ResourceLocation id) {
		
		boolean isCompleted = AdvancementManager.getAdvancement(id).getProgress(adv).isDone();

        if (isCompleted) {
        	
        	
        }
        

	}
	
}
