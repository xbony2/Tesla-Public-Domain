import me.modforgery.tesla.item.CraftingItem;
import me.modforgery.tesla.item.TPDevice;
import me.modforgery.tesla.item.TVoltmeter;

import cpw.mods.fml.common.registry.GameRegistry;

public class TeslaItems{

  public static Item copper_ingot;
  public static Item tin_ingot;
  
  public static void init(){
    conductor = new CraftingItem("conductor");
    coil = new CraftingItem("coil");
    copper_ingot = new CraftingItem("copper_ingot");
    tin_ingot = new CraftingItem("tin_ingot");
    
    GameRegistry.registerItem(conductor, "Conductor");
    
    GameRegistry.registerItem(copper_ingot, "copper_ingot");
    
    GameRegistry.registerItem(tin_ingot, "tin_ingot");
  }
}
