package com.github.neutrinokillerino.entitytest.item;

import com.github.neutrinokillerino.entitytest.init.ModEntityTypes;

import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlacerItem extends Item {

	public PlacerItem(Properties properties) {
		super(properties);
	}
	
	public ActionResultType onItemUse(ItemUseContext context) {
		BlockPos blockpos = context.getPos();
		Direction direction = context.getFace();
		BlockPos blockpos1 = blockpos.offset(direction);
		World world = context.getWorld();
		
		
		if (!world.isRemote()) {
			CompoundNBT compound = new CompoundNBT();
			compound.putBoolean("shorty", true);
			ModEntityTypes.TEST_ENTITY.get().spawn(world, compound, null, null, blockpos1, SpawnReason.SPAWN_EGG, false, false);
		}
		
		return ActionResultType.SUCCESS;
	}

}
