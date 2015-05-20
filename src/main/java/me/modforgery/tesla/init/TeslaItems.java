import me.modforgery.tesla.item.CraftingItem;
import me.modforgery.tesla.item.TPDevice;
import me.modforgery.tesla.item.TVoltmeter;


  public static Item copper_ingot;
  public static Item tin_ingot;
  
    copper_ingot = new CopperIngot();
    tin_ingot = new TinIngot();
    
    GameRegistry.registerItem(conductor, "Conductor");
    
    GameRegistry.registerItem(copper_ingot, "copper_ingot");
    
    GameRegistry.registerItem(tin_ingot, "tin_ingot");
