package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
//                .add(ModBlocks.RED_LOG.getId(), new FurnaceFuel(300), false)
//                .add(ModBlocks.RED_WOOD.getId(), new FurnaceFuel(300), false)
//                .add(ModBlocks.STRIPPED_RED_LOG.getId(), new FurnaceFuel(300), false)
//                .add(ModBlocks.STRIPPED_RED_WOOD.getId(), new FurnaceFuel(300), false)
//                .add(ModBlocks.RED_PLANK.getId(), new FurnaceFuel(300), false)
                ;
                
    }
}
