import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import me.modforgery.tesla.client.particles.TeslaParticles;

    @Override
    public void updateEntity(){
       super.updateEntity();
        if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
            TeslaParticles.plasa(this.worldObj, this.xCoord + 0.5, this.yCoord + 0.3, this.zCoord + 0.5 , this.xCoord + 0.5 + 10, this.yCoord + 0.3, this.zCoord + 0.5);
    }
