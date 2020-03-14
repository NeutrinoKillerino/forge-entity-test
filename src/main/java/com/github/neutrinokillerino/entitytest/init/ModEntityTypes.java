package com.github.neutrinokillerino.entitytest.init;

import com.github.neutrinokillerino.entitytest.EntityTestMod;
import com.github.neutrinokillerino.entitytest.entity.TestEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, EntityTestMod.MODID);

	public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = ENTITY_TYPES.register("test_entity", () -> EntityType.Builder.<TestEntity>create(TestEntity::new, EntityClassification.MISC).build(new ResourceLocation(EntityTestMod.MODID, "test_entity").toString()));
}
