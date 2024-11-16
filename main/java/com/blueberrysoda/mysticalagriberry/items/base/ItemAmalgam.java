package com.blueberrysoda.mysticalagriberry.items.base;

import com.blueberrysoda.mysticalagriberry.MysticalAgriBerry;
import com.blueberrysoda.mysticalagriberry.util.IHasModel;
import net.minecraft.item.Item;

public class ItemAmalgam extends Item implements IHasModel {
    public ItemAmalgam(String name){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(MysticalAgriBerry.CREATIVE_TAB);
        this.setMaxStackSize(1);
    }

    @Override
    public void registerModels() {
        MysticalAgriBerry.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
