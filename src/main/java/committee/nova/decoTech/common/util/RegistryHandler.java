package committee.nova.decoTech.common.util;

import committee.nova.decoTech.common.DecoTech;
import committee.nova.decoTech.common.block.init.BlockInit;
import committee.nova.decoTech.common.item.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, DecoTech.MODID);
    public static DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, DecoTech.MODID);

    public static void register() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.register();
        ItemInit.register();
        Blocks.register(eventBus);
        Items.register(eventBus);
    }
}
