package com.github.neutrinokillerino.entitytest.client;


import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import com.github.neutrinokillerino.entitytest.EntityTestMod;
import com.github.neutrinokillerino.entitytest.client.render.entity.TestEntityRenderer;
import com.github.neutrinokillerino.entitytest.init.ModEntityTypes;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;



@EventBusSubscriber(modid = EntityTestMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEventSubscriber {
	
	@SubscribeEvent
	public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEST_ENTITY.get(), TestEntityRenderer::new);
	}
}
