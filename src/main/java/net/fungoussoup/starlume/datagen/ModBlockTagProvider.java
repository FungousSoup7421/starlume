package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Starlume.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
//                .add(ModBlocks.RED_LOG.get())
//                .add(ModBlocks.RED_WOOD.get())
//                .add(ModBlocks.STRIPPED_RED_WOOD.get())
//                .add(ModBlocks.STRIPPED_RED_LOG.get())
//                .add(ModBlocks.RED_PLANK.get())
//                .add(ModBlocks.RED_WOOD_STAIRS.get())
//                .add(ModBlocks.RED_WOOD_SLAB.get())
//                .add(ModBlocks.RED_WOOD_BUTTON.get())
//                .add(ModBlocks.RED_WOOD_PRESSURE_PLATE.get())
//                .add(ModBlocks.RED_WOOD_FENCE.get())
//                .add(ModBlocks.BLUE_WOOD_FENCE_GATE.get())
//                .add(ModBlocks.RED_WOOD_DOOR.get())
//                .add(ModBlocks.RED_WOOD_TRAPDOOR.get())
                ;

        tag(BlockTags.FENCES)
//                .add(ModBlocks.RED_WOOD_FENCE.get())
                ;

        tag(BlockTags.FENCE_GATES)

//                .add(ModBlocks.RED_WOOD_FENCE_GATE.get())
                ;
        
        this.tag(BlockTags.LOGS_THAT_BURN)
//                .add(ModBlocks.RED_LOG.get())
//                .add(ModBlocks.RED_WOOD.get())
//                .add(ModBlocks.STRIPPED_RED_LOG.get())
//                .add(ModBlocks.STRIPPED_RED_WOOD.get())
                ;

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.STARLIT_SOIL.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STARLIT_STONE.get());
    }
}
