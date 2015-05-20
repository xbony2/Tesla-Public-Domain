package me.modforgery.tesla.item;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 22/09/2014.
 * 
 * Created by xbony2 for ModForgery :p
 * May they distribute this code forever
 */
public class TinIngot extends Item{
    public TinIngot(){
        super();
        this.setCreativeTab(CreativeTabTesla.TS_TAB);
        this.setUnlocalizedName("tin_ingot");
        this.setTextureName("tesla:tin_ingot");
    }
}
