package me.modforgery.tesla.block;
import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
/**
 * File by ModForgery for Minecraft on 22/09/2014.
 * 
 * Created by xbony2 for ModForgery :p
 * May they distribute this code forever
 */
public class BlockTinOre extends Block {
public BlockTinOre() {
super(Material.rock);
        setBlockName("oreTin");
        setBlockTextureName("tesla:tin_ore");
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypePiston);
    }
}
