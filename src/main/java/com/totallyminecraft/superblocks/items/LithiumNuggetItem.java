package com.totallyminecraft.superblocks.items;


import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LithiumNuggetItem extends Item{


    private String name = "lithiumnuggetItem";

    public LithiumNuggetItem() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModTabs.tabSuperBlocksItems);
        setTextureName(Constants.MODID + ":" + name);
    }

}
