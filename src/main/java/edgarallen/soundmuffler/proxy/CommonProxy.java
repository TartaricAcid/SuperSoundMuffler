package edgarallen.soundmuffler.proxy;

import edgarallen.soundmuffler.bauble.ItemSoundMufflerBauble;
import edgarallen.soundmuffler.block.BlockSoundMuffler;
import edgarallen.soundmuffler.block.TileEntitySoundMuffler;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public BlockSoundMuffler blockSoundMuffler;
    public ItemBlock itemSoundMuffler;
    public ItemSoundMufflerBauble itemSoundMufflerBauble;

    public void preInit() {
        blockSoundMuffler = new BlockSoundMuffler();
        itemSoundMuffler = new ItemBlock(blockSoundMuffler);
        itemSoundMuffler.setRegistryName(blockSoundMuffler.getRegistryName());

        GameRegistry.register(blockSoundMuffler);
        GameRegistry.register(itemSoundMuffler);
        GameRegistry.registerTileEntity(TileEntitySoundMuffler.class, BlockSoundMuffler.NAME);

        itemSoundMufflerBauble = new ItemSoundMufflerBauble();
        GameRegistry.register(itemSoundMufflerBauble);
    }

    public void registerRecipes() {
        blockSoundMuffler.registerRecipes();
        itemSoundMufflerBauble.registerRecipes();
    }
}
