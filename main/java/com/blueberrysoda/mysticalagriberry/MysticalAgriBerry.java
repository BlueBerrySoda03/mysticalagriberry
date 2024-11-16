package com.blueberrysoda.mysticalagriberry;

import com.blueberrysoda.mysticalagriberry.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MysticalAgriBerry.MOD_ID, name = MysticalAgriBerry.NAME, version = MysticalAgriBerry.VERSION)
public class MysticalAgriBerry {

    public static final String MOD_ID = "mysticalagriberry";
    public static final String NAME = "Mystical Agriculture: BlueBerry Additions";
    public static final String VERSION = "0.1";
    //public static final String DEPENDENCIES = "required-after:cucumber" + "required-after:mysticalagriculture" + "required-after:mysticalagradditions";
    //, dependencies = MysticalAgriBerry.DEPENDENCIES
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.blueberrysoda.mysticalagriberry.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.blueberrysoda.mysticalagriberry.proxy.CommonProxy";
    public static final CreativeTabs CREATIVE_TAB = new MABCreativeTab("MABCreativeTab");

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS,
                serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        CommonProxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
