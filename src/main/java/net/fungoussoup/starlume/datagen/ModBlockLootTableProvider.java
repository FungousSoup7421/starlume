package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
//        dropSelf(ModBlocks.RED_LOG.get());
//        dropSelf(ModBlocks.RED_WOOD.get());
//        dropSelf(ModBlocks.STRIPPED_RED_LOG.get());
//        dropSelf(ModBlocks.STRIPPED_RED_WOOD.get());
//        dropSelf(ModBlocks.RED_PLANK.get());
//        dropSelf(ModBlocks.RED_WOOD_STAIRS.get());
//        add(ModBlocks.RED_WOOD_SLAB.get(),
//                block -> createSlabItemTable(ModBlocks.RED_WOOD_SLAB.get()));
//        dropSelf(ModBlocks.RED_WOOD_PRESSURE_PLATE.get());
//        dropSelf(ModBlocks.RED_WOOD_BUTTON.get());
//        dropSelf(ModBlocks.RED_WOOD_FENCE.get());
//        dropSelf(ModBlocks.RED_WOOD_FENCE_GATE.get());
//        dropSelf(ModBlocks.RED_WOOD_TRAPDOOR.get());
//        add(ModBlocks.RED_WOOD_DOOR.get(),
//                block -> createDoorTable(ModBlocks.RED_WOOD_DOOR.get()));
//        dropSelf(ModBlocks.MAGENTA_SAPLING.get());
//        this.add(ModBlocks.MAGENTA_LEAVES.get(), block ->
//                createLeavesDrops(block, ModBlocks.MAGENTA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.STARLIT_SOIL.get());
        dropSelf(ModBlocks.STARLIT_STONE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
