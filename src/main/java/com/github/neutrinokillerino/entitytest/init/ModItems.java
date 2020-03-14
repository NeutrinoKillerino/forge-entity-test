package com.github.neutrinokillerino.entitytest.init;

import com.github.neutrinokillerino.entitytest.EntityTestMod;
import com.github.neutrinokillerino.entitytest.item.PlacerItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EntityTestMod.MODID);
	
	public final static RegistryObject<PlacerItem> PLACER_ITEM = ITEMS.register("placer_item", () -> new PlacerItem(new Item.Properties().group(ItemGroup.DECORATIONS)));
}

