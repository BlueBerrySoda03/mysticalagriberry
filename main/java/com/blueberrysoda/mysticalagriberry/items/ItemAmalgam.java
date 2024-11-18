package com.blueberrysoda.mysticalagriberry.items;

import com.blueberrysoda.mysticalagriberry.MysticalAgriBerry;
import com.blueberrysoda.mysticalagriberry.init.ModItems;
import com.blueberrysoda.mysticalagriberry.util.IHasModel;
import net.minecraft.item.Item;

import java.util.Objects;

public class ItemAmalgam extends Item implements IHasModel {
    public ItemAmalgam(String name){
        setRegistryName(name);
        setUnlocalizedName(MysticalAgriBerry.MOD_ID + "." + name);
        setCreativeTab(MysticalAgriBerry.CREATIVE_TAB);
        this.setMaxStackSize(1);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        MysticalAgriBerry.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
