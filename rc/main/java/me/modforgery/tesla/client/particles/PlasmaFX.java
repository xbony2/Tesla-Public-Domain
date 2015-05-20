package me.modforgery.tesla.client.particles;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class PlasmaFX extends EntityFX {

    public static final ResourceLocation texture = new ResourceLocation("tesla", "textures/particles/plasma.png");
    public int particle = 16;
    boolean updated = false;
    double movX = 0.0D;
    double movY = 0.0D;
    double movZ = 0.0D;
    private float length = 0.0F;
    private float rotYaw = 0.0F;
    private float rotPitch = 0.0F;
    private float prevYaw = 0.0F;
    private float prevPitch = 0.0F;
    private Entity targetEntity = null;
    private double tX = 0.0D;
    private double tY = 0.0D;
    private double tZ = 0.0D;
    private float endMod = 1.0F;
    private boolean reverse = false;
    private boolean pulse = true;
    private int rotationspeed = 5;
    private float prevSize = 0.0F;

    public PlasmaFX(World par1World, double x, double y, double z, double tx, double ty, double tz, int age) {
        super(par1World, x, y, z, 0.0D, 0.0D, 0.0D);

        this.particleRed = 1F;
        this.particleGreen = 1F;
        this.particleBlue = 1F;

        setSize(0.02F, 0.02F);
        this.noClip = true;
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.tX = tx;
        this.tY = ty;
        this.tZ = tz;
        float xd = (float) (this.posX - this.tX);
        float yd = (float) (this.posY - this.tY);
        float zd = (float) (this.posZ - this.tZ);
        this.length = MathHelper.sqrt_float(xd * xd + yd * yd + zd * zd);
        double var7 = MathHelper.sqrt_double(xd * xd + zd * zd);
        this.rotYaw = ((float) (Math.atan2(xd, zd) * 180.0D / 3.141592653589793D));
        this.rotPitch = ((float) (Math.atan2(yd, var7) * 180.0D / 3.141592653589793D));
        this.prevYaw = this.rotYaw;
        this.prevPitch = this.rotPitch;

        this.particleMaxAge = age;

        EntityLivingBase renderentity = FMLClientHandler.instance().getClient().renderViewEntity;
        int visibleDistance = 100;
        if (!FMLClientHandler.instance().getClient().gameSettings.fancyGraphics)
            visibleDistance = 300;
        if (renderentity.getDistance(this.posX, this.posY, this.posZ) > visibleDistance)
            this.particleMaxAge = 0;
    }

    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.updated) {
            this.posX = this.movX;
            this.posY = this.movY;
            this.posZ = this.movZ;
            this.updated = false;
        }

        this.prevYaw = this.rotYaw;
        this.prevPitch = this.rotPitch;

        if (this.targetEntity != null) {
            this.tX = this.targetEntity.posX;
            this.tY = (this.targetEntity.posY + this.targetEntity.getEyeHeight() - this.targetEntity.height / 2.0F);
            this.tZ = this.targetEntity.posZ;
        }

        float xd = (float) (this.posX - this.tX);
        float yd = (float) (this.posY - this.tY);
        float zd = (float) (this.posZ - this.tZ);

        this.length = MathHelper.sqrt_float(xd * xd + yd * yd + zd * zd);

        double var7 = MathHelper.sqrt_double(xd * xd + zd * zd);

        this.rotYaw = ((float) (Math.atan2(xd, zd) * 180.0D / 3.141592653589793D));
        this.rotPitch = ((float) (Math.atan2(yd, var7) * 180.0D / 3.141592653589793D));

        if (this.particleAge++ >= this.particleMaxAge) {
            setDead();
        }
    }

    public void renderParticle(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5) {
        tessellator.draw();

        GL11.glPushMatrix();
        float var9 = 1.0F;
        float slide = (float) this.worldObj.getTotalWorldTime();
        float rot = (float) (this.worldObj.provider.getWorldTime() % (360 / this.rotationspeed) * this.rotationspeed) + this.rotationspeed * f;

        float size = 1.0F;
        if (this.pulse) {
            size = Math.min(this.particleAge / 4.0F, 1.0F);
            size = (float) (this.prevSize + (size - this.prevSize) * f);
        }

        float op = 0.4F;
        if ((this.pulse) && (this.particleMaxAge - this.particleAge <= 4)) {
            op = 0.4F - (4 - (this.particleMaxAge - this.particleAge)) * 0.1F;
        }

        Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        GL11.glTexParameterf(3553, 10242, 10497.0F);
        GL11.glTexParameterf(3553, 10243, 10497.0F);

        GL11.glDisable(2884);

        float var11 = slide + f;
        if (this.reverse)
            var11 *= -1.0F;
        float var12 = -var11 * 0.2F - MathHelper.floor_float(-var11 * 0.1F);

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 1);
        GL11.glDepthMask(false);

        float xx = (float) (this.prevPosX + (this.posX - this.prevPosX) * f - EntityFX.interpPosX);
        float yy = (float) (this.prevPosY + (this.posY - this.prevPosY) * f - EntityFX.interpPosY);
        float zz = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * f - EntityFX.interpPosZ);
        GL11.glTranslated(xx, yy, zz);

        float ry = (float) (this.prevYaw + (this.rotYaw - this.prevYaw) * f);
        float rp = (float) (this.prevPitch + (this.rotPitch - this.prevPitch) * f);
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(180.0F + ry, 0.0F, 0.0F, -1.0F);
        GL11.glRotatef(rp, 1.0F, 0.0F, 0.0F);

        double var44 = -0.15D * size;
        double var17 = 0.15D * size;
        double var44b = -0.15D * size * this.endMod;
        double var17b = 0.15D * size * this.endMod;

        GL11.glRotatef(rot, 0.0F, 1.0F, 0.0F);
        for (int t = 0; t < 3; t++) {
            double var29 = this.length * size * var9;
            double var31 = 0.0D;
            double var33 = 1.0D;
            double var35 = -1.0F + var12 + t / 3.0F;
            double var37 = this.length * size * var9 + var35;

            GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
            tessellator.startDrawingQuads();
            tessellator.setBrightness(1200);
            tessellator.setColorRGBA_F(this.particleRed, this.particleGreen, this.particleBlue, op);
            tessellator.addVertexWithUV(var44b, var29, 0.0D, var33, var37);
            tessellator.addVertexWithUV(var44, 0.0D, 0.0D, var33, var35);
            tessellator.addVertexWithUV(var17, 0.0D, 0.0D, var31, var35);
            tessellator.addVertexWithUV(var17b, var29, 0.0D, var31, var37);
            tessellator.draw();
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glEnable(2884);

        GL11.glPopMatrix();

        Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        tessellator.startDrawingQuads();
        this.prevSize = size;
    }
}
