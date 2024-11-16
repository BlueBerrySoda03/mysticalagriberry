package com.blueberrysoda.mysticalagriberry.proxy;

import com.blueberrysoda.mysticalagriberry.items.Amalgam;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public static void preInit(FMLPreInitializationEvent event) {
        Amalgam.init();
    }

    public static void init(FMLInitializationEvent event){

    }

    public static void postInit(FMLPostInitializationEvent event){

    }

    public void registerItemRenderer(Item item, int meta, String id){
    }
}
