package me.modforgery.tesla.block.te;

import me.modforgery.tesla.api.power.IPoweredTile;
import me.modforgery.tesla.api.power.PowedTile;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPlasmaFurnace extends TileEntity implements IPoweredTile{

    PowedTile powedTile = new PowedTile(1000);
    
    @Override
    public PowedTile getPowedTile() {
        return powedTile;
    }
