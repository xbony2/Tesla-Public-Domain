package me.modforgery.tesla.block.te;

import me.modforgery.tesla.api.power.IPoweredTile;
import me.modforgery.tesla.api.power.PoweredTile;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPlasmaFurnace extends TileEntity implements IPoweredTile{

    PoweredTile poweredTile = new PoweredTile(1000);
    
    @Override
    public PoweredTile getPoweredTile() {
        return poweredTile;
    }
