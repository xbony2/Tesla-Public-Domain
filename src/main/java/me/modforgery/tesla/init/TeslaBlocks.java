import me.modforgery.tesla.block.te.TileEntityPlasmaFurnace;

        public static Block oreTin;
        public static Block blockCopper;
        public static Block blockTin;
        
	oreTin = new BlockTinOre();
	blockCopper = new BlockDecorative("blockCopper");
	blockTin = new BlockDecorative("blockTin");
	
	GameRegistry.registerBlock(oreTin, "oreTin");
	GameRegistry.registerBlock(blockCopper, "blockCopper");
	GameRegistry.registerBlock(blockTin, "blockTin");

        GameRegistry.registerTileEntity(TileEntityPlasmaFurnace.class, "te_plasmaFurnace");
