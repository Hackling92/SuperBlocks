package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.TileEntityTestBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class TestBlock extends Block implements ITileEntityProvider{

    private String name = "testBlock";

    public TestBlock(){
        super(Material.rock);
        this.setCreativeTab(SuperBlocks.tabSuperBlocks);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",1);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta){
        return new TileEntityTestBlock();
    }

    @Override
    public boolean hasTileEntity(int metadata){
        return true;
    }

}
