import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import me.modforgery.tesla.client.particles.TeslaParticles;

public class TileEntityTeslaCoil extends TileEntity implements IPoweredTile {
    
    //This is the powered tile instance
    PoweredTile poweredTile;
    
    public TileEntityTeslaCoil() {
        poweredTile = new PoweredTile(10000);
    }

    @Override
    public void updateEntity(){
       super.updateEntity();
        for (int x = -scanRadius; x < scanRadius; x++) {
            for (int y = -scanRadius; y < scanRadius; y++) {
                for (int z = -scanRadius; z < scanRadius; z++) {
                   TileEntity tile = this.worldObj.getTileEntity(this.xCoord + x, this.yCoord + y, this.zCoord + z);
                   if(tile != null && tile instanceof IPoweredTile){
                       if(tile instanceof TileEntityTeslaCoil){
                           //TODO balace the power here
                           //TODO Find out how many it is connected to here
                       }else {
                           //TODO move the power here to all of the powered tiles
                           if (FMLCommonHandler.instance().getSide() == Side.CLIENT){
                               TeslaParticles.plasa(this.worldObj, this.xCoord + 0.5, this.yCoord + 0.3, this.zCoord + 0.5 , tile.xCoord + 0.5, tile.yCoord + 0.5, tile.zCoord + 0.5);
                           }
                       }
                   }
                }
            }
        }
    }
    
    @Override
    public PoweredTile getPoweredTile() {
        return poweredTile;
    }
}
