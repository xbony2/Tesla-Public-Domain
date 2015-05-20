import net.minecraftforge.oredict.ShapedOreRecipe;

  private static final String[] helmet = new String[]{"xxx", "x x"};
  private static final String[] chestplate = new String[]{"x x", "xxx", "xxx"};
  private static final String[] leggings = new String[]{"xxx", "x x", "x x"};
  private static final String[] boots = new String[]{"x x", "x x"};
  private static final String[] pickaxe = new String[]{"xxx", " s ", " s "};
  private static final String[] sword = new String[]{" x ", " x ", " s "};
  private static final String[] shovel = new String[]{"x", "s", "s"};
  private static final String[] axe = new String[]{"xx", "xs", " s"};
  private static final String[] block = new String[]{"xxx", "xxx", "xxx"};
  
  GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TeslaBlocks.blockCopper), new Object[]{
		block, 'x', "ingotCopper"}));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TeslaBlocks.blockTin), new Object[]{
	  block, 'x', "ingotTin"}));
	  
	GameRegistry.addSmelting(TeslaBlocks.oreTin, new ItemStack(TeslaItems.tin_ingot), 0.6F);
