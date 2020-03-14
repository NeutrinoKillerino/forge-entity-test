package com.github.neutrinokillerino.entitytest.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class TestEntity extends Entity {
	
	public boolean shorty = false;
	
	public TestEntity(EntityType<?> entityTypeIn, World worldIn) {
		super(entityTypeIn, worldIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void registerData() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void readAdditional(CompoundNBT compound) {
		// TODO Auto-generated method stub
		this.shorty = compound.getBoolean("shorty");
	}

	@Override
	protected void writeAdditional(CompoundNBT compound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		// TODO Auto-generated method stub
		return NetworkHooks.getEntitySpawningPacket(this);
	}

}
