package com.blueberrysoda.mysticalagriberry;

import com.blueberrysoda.mysticalagriberry.items.Amalgam;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MABCreativeTab extends CreativeTabs{

    public MABCreativeTab(String label){
        super("MABCreativeTab");
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(Amalgam.ZOMBIE_AMALGAM);
    }
}
