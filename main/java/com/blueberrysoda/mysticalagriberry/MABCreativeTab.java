package com.blueberrysoda.mysticalagriberry;

import com.blueberrysoda.mysticalagriberry.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MABCreativeTab extends CreativeTabs{

    public MABCreativeTab(String label){
        super("MABCreativeTab");
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ModItems.ZOMBIE_AMALGAM);
    }
}
