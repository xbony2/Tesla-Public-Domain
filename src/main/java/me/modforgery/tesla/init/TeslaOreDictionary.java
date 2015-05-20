package me.modforgery.tesla.init;

import net.minecraftforge.oredict.OreDictionary;

/**
 * File by ModForgery for Minecraft on 13/09/2014.
 * 
 * Created by xbony2 for ModForgery :p
 * May they distribute this code forever
 */
public class TeslaOreDictionary {

	public static void init(){
		OreDictionary.registerOre("oreCopper", TeslaBlocks.oreCopper);
		
		OreDictionary.registerOre("ingotCopper", TeslaItems.copper_ingot);
	}
}
