package me.modforgery.tesla.item;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 13/09/2014.
 * 
 * Created by xbony2 for ModForgery :p
 * May they distribute this code forever
 */
public class CraftingItem extends Item{
    public CraftingItem(String unlocalizedName){
        super();
        this.setCreativeTab(CreativeTabTesla.TS_TAB);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("tesla:" + unlocalizedName);
    }
}
