package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Starlume.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        
//        // RED
//        logBlock(((RotatedPillarBlock) ModBlocks.RED_LOG.get()));
//        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_LOG.get()));
//        axisBlock(((RotatedPillarBlock)ModBlocks.RED_WOOD.get()), blockTexture(ModBlocks.RED_LOG.get()));
//        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_RED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_RED_LOG.get()));
//        blockItem(ModBlocks.RED_LOG);
//        blockItem(ModBlocks.RED_WOOD);
//        blockItem(ModBlocks.STRIPPED_RED_LOG);
//        blockItem(ModBlocks.STRIPPED_RED_WOOD);
//        blockWithItem(ModBlocks.RED_PLANK);
//        stairsBlock(ModBlocks.RED_WOOD_STAIRS.get(), blockTexture(ModBlocks.RED_PLANK.get()));
//        slabBlock(ModBlocks.RED_WOOD_SLAB.get(), blockTexture(ModBlocks.RED_PLANK.get()), blockTexture(ModBlocks.RED_PLANK.get()));
//        buttonBlock(ModBlocks.RED_WOOD_BUTTON.get(), blockTexture(ModBlocks.RED_PLANK.get()));
//        pressurePlateBlock(ModBlocks.RED_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RED_PLANK.get()));
//        fenceBlock(ModBlocks.RED_WOOD_FENCE.get(), blockTexture(ModBlocks.RED_PLANK.get()));
//        fenceGateBlock(ModBlocks.RED_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.RED_PLANK.get()));
//        doorBlockWithRenderType(ModBlocks.RED_WOOD_DOOR.get(), modLoc("block/red_wood_door_bottom"), modLoc("block/red_wood_door_top"), "cutout");
//        trapdoorBlockWithRenderType(ModBlocks.RED_WOOD_TRAPDOOR.get(), modLoc("block/red_wood_trapdoor"), true, "cutout");
//        blockItem(ModBlocks.RED_WOOD_STAIRS);
//        blockItem(ModBlocks.RED_WOOD_SLAB);
//        blockItem(ModBlocks.RED_WOOD_PRESSURE_PLATE);
//        blockItem(ModBlocks.RED_WOOD_FENCE_GATE);
//        blockItem(ModBlocks.RED_WOOD_TRAPDOOR, "_bottom");
//        leavesBlock(ModBlocks.MAGENTA_LEAVES);
//        saplingBlock(ModBlocks.MAGENTA_SAPLING);

        blockWithItem(ModBlocks.STARLIT_SOIL);
        blockWithItem(ModBlocks.STARLIT_STONE);

    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("starlume:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("starlume:block/" + deferredBlock.getId().getPath() + appendix));
    }
}