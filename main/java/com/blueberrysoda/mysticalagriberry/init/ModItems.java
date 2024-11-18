package com.blueberrysoda.mysticalagriberry.init;

import com.blueberrysoda.mysticalagriberry.items.ItemAmalgam;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //amalgams
    public static final Item ZOMBIE_AMALGAM = new ItemAmalgam("amalgam_zombie");
}