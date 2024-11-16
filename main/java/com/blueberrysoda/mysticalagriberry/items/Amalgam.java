package com.blueberrysoda.mysticalagriberry.items;

import com.blueberrysoda.mysticalagriberry.items.base.ItemAmalgam;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Amalgam {
    public static Item ZOMBIE_AMALGAM;
    public static Item PIG_AMALGAM;
    public static Item CHICKEN_AMALGAM;
    public static Item COW_AMALGAM;
    public static Item SHEEP_AMALGAM;
    public static Item SLIME_AMALGAM;
    public static Item SKELETON_AMALGAM;
    public static Item CREEPER_AMALGAM;
    public static Item SPIDER_AMALGAM;
    public static Item RABBIT_AMALGAM;
    public static Item GUARDIAN_AMALGAM;
    public static Item BLAZE_AMALGAM;
    public static Item GHAST_AMALGAM;
    public static Item ENDERMAN_AMALGAM;
    public static Item WITHER_SKELETON_AMALGAM;
    public static Item BLIZZ_AMALGAM;
    public static Item BLITZ_AMALGAM;
    public static Item BASALZ_AMALGAM;
    public static Item WITCH_AMALGAM;
    public static Item ENDER_DRAGON_AMALGAM;
    public static Item WITHER_AMALGAM;
    //public static Item _AMALGAM;

    public static void init(){
        ZOMBIE_AMALGAM = new ItemAmalgam("amalgam_zombie");
        PIG_AMALGAM = new ItemAmalgam("amalgam_pig");
        CHICKEN_AMALGAM = new ItemAmalgam("amalgam_chicken");
        COW_AMALGAM = new ItemAmalgam("amalgam_cow");
        SHEEP_AMALGAM = new ItemAmalgam("amalgam_sheep");
        SLIME_AMALGAM = new ItemAmalgam("amalgam_slime");
        SKELETON_AMALGAM = new ItemAmalgam("amalgam_skeleton");
        CREEPER_AMALGAM = new ItemAmalgam("amalgam_creeper");
        SPIDER_AMALGAM = new ItemAmalgam("amalgam_spider");
        RABBIT_AMALGAM = new ItemAmalgam("amalgam_rabbit");
        GUARDIAN_AMALGAM = new ItemAmalgam("amalgam_guardian");
        BLAZE_AMALGAM = new ItemAmalgam("amalgam_blaze");
        GHAST_AMALGAM = new ItemAmalgam("amalgam_ghast");
        ENDERMAN_AMALGAM = new ItemAmalgam("amalgam_enderman");
        WITHER_SKELETON_AMALGAM= new ItemAmalgam("amalgam_wither_skeleton");
        BLIZZ_AMALGAM = new ItemAmalgam("amalgam_blizz");
        BLITZ_AMALGAM = new ItemAmalgam("amalgam_blitz");
        BASALZ_AMALGAM = new ItemAmalgam("amalgam_basalz");
        WITCH_AMALGAM = new ItemAmalgam("amalgam_witch");
        ENDER_DRAGON_AMALGAM = new ItemAmalgam("amalgam_ender_dragon");
        WITHER_AMALGAM = new ItemAmalgam("amalgam_wither");
        //"itemname" = new "class"("registryname");
        //= new ItemAmalgam("amalgam_");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ZOMBIE_AMALGAM);
        event.getRegistry().registerAll(PIG_AMALGAM);
        event.getRegistry().registerAll(CHICKEN_AMALGAM);
        event.getRegistry().registerAll(COW_AMALGAM);
        event.getRegistry().registerAll(SHEEP_AMALGAM);
        event.getRegistry().registerAll(SLIME_AMALGAM);
        event.getRegistry().registerAll(SKELETON_AMALGAM);
        event.getRegistry().registerAll(CREEPER_AMALGAM);
        event.getRegistry().registerAll(SPIDER_AMALGAM);
        event.getRegistry().registerAll(RABBIT_AMALGAM);
        event.getRegistry().registerAll(GUARDIAN_AMALGAM);
        event.getRegistry().registerAll(BLAZE_AMALGAM);
        event.getRegistry().registerAll(GHAST_AMALGAM);
        event.getRegistry().registerAll(ENDERMAN_AMALGAM);
        event.getRegistry().registerAll(WITHER_SKELETON_AMALGAM);
        event.getRegistry().registerAll(BLIZZ_AMALGAM);
        event.getRegistry().registerAll(BLITZ_AMALGAM);
        event.getRegistry().registerAll(BASALZ_AMALGAM);
        event.getRegistry().registerAll(WITCH_AMALGAM);
        event.getRegistry().registerAll(ENDER_DRAGON_AMALGAM);
        event.getRegistry().registerAll(WITHER_AMALGAM);
        //event.getRegistry().registerAll();
    }
}