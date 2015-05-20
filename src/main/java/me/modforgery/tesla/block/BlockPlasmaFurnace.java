import me.modforgery.tesla.block.te.TileEntityPlasmaFurnace;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPlasmaFurnace extends BlockContainer{

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityPlasmaFurnace();
    }
