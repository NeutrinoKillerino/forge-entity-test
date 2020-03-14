package com.github.neutrinokillerino.entitytest;

import com.github.neutrinokillerino.entitytest.init.ModEntityTypes;
import com.github.neutrinokillerino.entitytest.init.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EntityTestMod.MODID)
public class EntityTestMod {
	
	public static final String MODID = "entitytest";
	
	public EntityTestMod() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
	}
}
