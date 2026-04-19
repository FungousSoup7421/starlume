package net.fungoussoup.starlume.block;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.custom.ModFlammableRotatedPillarBlock;
import net.fungoussoup.starlume.item.ModItems;
import net.fungoussoup.starlume.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Starlume.MOD_ID);
    
    // RED
    
//    public static final DeferredBlock<Block> RED_LOG = registerBlock("red_log",
//            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
//    public static final DeferredBlock<Block> RED_WOOD = registerBlock("red_wood",
//            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
//    public static final DeferredBlock<Block> STRIPPED_RED_LOG = registerBlock("stripped_red_log",
//            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
//    public static final DeferredBlock<Block> STRIPPED_RED_WOOD = registerBlock("stripped_red_wood",
//            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
//    public static final DeferredBlock<Block> RED_PLANK = registerBlock("red_plank",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
//
//    public static final DeferredBlock<StairBlock> RED_WOOD_STAIRS = registerBlock("red_wood_stairs",
//            () -> new StairBlock(ModBlocks.RED_PLANK.get().defaultBlockState(),
//                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
//    public static final DeferredBlock<SlabBlock> RED_WOOD_SLAB = registerBlock("red_wood_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
//
//    public static final DeferredBlock<PressurePlateBlock> RED_WOOD_PRESSURE_PLATE = registerBlock("red_wood_pressure_plate",
//            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
//    public static final DeferredBlock<ButtonBlock> RED_WOOD_BUTTON = registerBlock("red_wood_button",
//            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));
//
//    public static final DeferredBlock<FenceBlock> RED_WOOD_FENCE = registerBlock("red_wood_fence",
//            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
//    public static final DeferredBlock<FenceGateBlock> RED_WOOD_FENCE_GATE = registerBlock("red_wood_fence_gate",
//            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
//
//    public static final DeferredBlock<DoorBlock> RED_WOOD_DOOR = registerBlock("red_wood_door",
//            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
//    public static final DeferredBlock<TrapDoorBlock> RED_WOOD_TRAPDOOR = registerBlock("red_wood_trapdoor",
//            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
//
//    public static final DeferredBlock<Block> MAGENTA_LEAVES = registerBlock("magenta_leaves",
//            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
//                @Override
//                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//                    return true;
//                }
//                @Override
//                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//                    return 60;
//                }
//                @Override
//                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
//                    return 30;
//                }
//            });
//    public static final DeferredBlock<Block> MAGENTA_SAPLING = registerBlock("magenta_sapling",
//            () -> new SaplingBlock(ModTreeGrowers.MAGENTA_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<Block> STARLIT_SOIL = registerBlock("starlit_soil",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));

    public static final DeferredBlock<Block> STARLIT_STONE = registerBlock("starlit_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
