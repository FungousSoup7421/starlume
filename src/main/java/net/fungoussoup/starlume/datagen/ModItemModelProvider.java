package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.fungoussoup.starlume.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Starlume.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        basicItem(ModItems.BISMUTH.get());
//
//        buttonItem(ModBlocks.RED_WOOD_BUTTON, ModBlocks.RED_PLANK);
//        fenceItem(ModBlocks.RED_WOOD_FENCE, ModBlocks.RED_PLANK);
//        basicItem(ModBlocks.RED_WOOD_DOOR.asItem());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Starlume.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Starlume.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Starlume.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}