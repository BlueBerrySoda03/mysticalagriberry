package com.blueberrysoda.mysticalagriberry.items;

import com.blueberrysoda.mysticalagriberry.items.base.ItemAmalgam;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ZOMBIE_AMALGAM, 0, new ModelResourceLocation(ZOMBIE_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PIG_AMALGAM, 0, new ModelResourceLocation(PIG_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CHICKEN_AMALGAM, 0, new ModelResourceLocation(CHICKEN_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COW_AMALGAM, 0, new ModelResourceLocation(COW_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SHEEP_AMALGAM, 0, new ModelResourceLocation(SHEEP_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SLIME_AMALGAM, 0, new ModelResourceLocation(SLIME_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SKELETON_AMALGAM, 0, new ModelResourceLocation(SKELETON_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CREEPER_AMALGAM, 0, new ModelResourceLocation(CREEPER_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SPIDER_AMALGAM, 0, new ModelResourceLocation(SPIDER_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RABBIT_AMALGAM, 0, new ModelResourceLocation(RABBIT_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(GUARDIAN_AMALGAM, 0, new ModelResourceLocation(GUARDIAN_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BLAZE_AMALGAM, 0, new ModelResourceLocation(BLAZE_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(GHAST_AMALGAM, 0, new ModelResourceLocation(GHAST_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ENDERMAN_AMALGAM, 0, new ModelResourceLocation(ENDERMAN_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(WITHER_SKELETON_AMALGAM, 0, new ModelResourceLocation(WITHER_SKELETON_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BLIZZ_AMALGAM, 0, new ModelResourceLocation(BLIZZ_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BLITZ_AMALGAM, 0, new ModelResourceLocation(BLITZ_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BASALZ_AMALGAM, 0, new ModelResourceLocation(BASALZ_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(WITCH_AMALGAM, 0, new ModelResourceLocation(WITCH_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ENDER_DRAGON_AMALGAM, 0, new ModelResourceLocation(ENDER_DRAGON_AMALGAM.delegate.name(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(WITHER_AMALGAM, 0, new ModelResourceLocation(WITHER_AMALGAM.delegate.name(), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(, 0, new ModelResourceLocation(.delegate.name(), "inventory"));
    }
}