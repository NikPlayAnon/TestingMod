package net.nikplayanon.testmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nikplayanon.testmod.TestMod;
import net.nikplayanon.testmod.item.ModCreativeModeTab;
import net.nikplayanon.testmod.item.ModItems;

public class ModsBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

    public static final RegistryObject<Block> BIRDFEEDER_BLOCK = BLOCKS.register("bird_feeder",
            () ->  new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Item> BIRDFEEDER_BLOCK_ITEM = ModItems.ITEMS.register("bird_feeder", () -> new BlockItem(BIRDFEEDER_BLOCK.get(), new Item.Properties()));


//    public static final RegistryObject<Block> BirdFeeder_BLOCK = registryBlock("bird_feeder",
//            () -> new Block(BlockBehaviour.Properties.of()), ModCreativeModeTab.EXAMPLE_TAB.get());
//
//    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
////        ModCreativeModeTab.EXAMPLE_TAB
//        registryBlockItem(name, toReturn, tab);
//        return toReturn;
//    };
//
//
//    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
//                                                                            CreativeModeTab tab) {
//
//        return ModItems.ITEMS.register(name,
//                () -> new BlockItem(block.get(), new Item.Properties()));
//    }

//    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
//    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
