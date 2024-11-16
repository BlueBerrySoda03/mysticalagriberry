package com.blueberrysoda.mysticalagriberry.items.base;

import com.blueberrysoda.mysticalagriberry.MysticalAgriBerry;
import com.blueberrysoda.mysticalagriberry.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    @Override
    public void registerModels(){
        MysticalAgriBerry.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
