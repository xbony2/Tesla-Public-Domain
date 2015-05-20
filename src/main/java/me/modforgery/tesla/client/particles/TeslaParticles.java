package me.modforgery.tesla.client.particles;


import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class TeslaParticles {

    public static void plasa(World par1World, double x, double y, double z, double tx, double ty, double tz) {
        PlasmaFX plasmaFX = new PlasmaFX(par1World, x, y, z, tx, ty, tz , 10);
        Minecraft.getMinecraft().effectRenderer.addEffect(plasmaFX);
    }
}
