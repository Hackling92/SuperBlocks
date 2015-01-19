package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.SlimWoodWorkerEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;

public class SlimWoodWorkerInv extends Container {
    public SlimWoodWorkerEntity tile;
    public SlimWoodWorkerInv(InventoryPlayer invPlayer, SlimWoodWorkerEntity entity)
    {
        int id = 0;
        tile = entity;
        bindPlayerInventory(invPlayer);
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                addSlotToContainer(new Slot(entity, id, i * 18 + 30, j * 18 + 17));
                id++;
            }
        }
        addSlotToContainer(new SlotCrafting(invPlayer.player, entity, invPlayer, id, 124, 35));
        id++;
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotIndex)
    {
        return null;
    }
    private void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        int id = 0;
        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, id, i * 18 + 8, 142));
            id++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, id ,j * 18 + 8, i * 18 + 83 ));
                id++;
            }
        }
    }
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}