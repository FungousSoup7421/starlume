package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Starlume.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
//                .add(ModBlocks.RED_LOG.asItem())
//                .add(ModBlocks.RED_WOOD.asItem())
//                .add(ModBlocks.STRIPPED_RED_LOG.asItem())
//                .add(ModBlocks.STRIPPED_RED_WOOD.asItem())
        ;

        this.tag(ItemTags.PLANKS)
//                .add(ModBlocks.RED_PLANK.asItem())
                ;
    }
}
