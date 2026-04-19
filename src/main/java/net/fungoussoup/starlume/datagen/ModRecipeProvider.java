package net.fungoussoup.starlume.datagen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.fungoussoup.starlume.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> WOOD_SMELTABLES = List.of(
//                ModBlocks.RED_LOG,
//                ModBlocks.RED_WOOD,
//                ModBlocks.STRIPPED_RED_LOG,
//                ModBlocks.STRIPPED_RED_WOOD
                );

        oreSmelting(recipeOutput, WOOD_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL, 0.25f,200,"charcoal");

//        // RED
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WOOD.get(), 3)
//                .pattern("LL")
//                .pattern("LL")
//                .define('L', ModBlocks.RED_LOG.get())
//                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_RED_WOOD.get(), 3)
//                .pattern("LL")
//                .pattern("LL")
//                .define('L', ModBlocks.STRIPPED_RED_LOG.get())
//                .unlockedBy("has_stripped_red_log", has(ModBlocks.STRIPPED_RED_LOG)).save(recipeOutput);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
//                .requires(ModBlocks.RED_LOG)
//                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
//                .requires(ModBlocks.RED_WOOD)
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_WOOD)).save(recipeOutput,"tintedgrove:red_plank_from_red_wood");
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
//                .requires(ModBlocks.STRIPPED_RED_LOG)
//                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput, "tintedgrove:red_plank_from_stripped_red_log");
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
//                .requires(ModBlocks.STRIPPED_RED_WOOD)
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_WOOD)).save(recipeOutput,"tintedgrove:red_plank_from_stripped_red_wood");
//        stairBuilder(ModBlocks.RED_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.RED_PLANK)).group("red_wood")
//                        .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK)).save(recipeOutput);
//        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOD_SLAB.get(), ModBlocks.RED_PLANK.get());
//        buttonBuilder(ModBlocks.RED_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
//        pressurePlate(recipeOutput, ModBlocks.RED_WOOD_PRESSURE_PLATE.get(), ModBlocks.RED_PLANK.get());
//        fenceBuilder(ModBlocks.RED_WOOD_FENCE.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
//        fenceGateBuilder(ModBlocks.RED_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
//        doorBuilder(ModBlocks.RED_WOOD_DOOR.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
//        trapdoorBuilder(ModBlocks.RED_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
//                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_SAPLING.get())
//                .pattern(" D ")
//                .pattern("DSD")
//                .pattern(" D ")
//                .define('D', Items.MAGENTA_DYE)
//                .define('S', Blocks.OAK_SAPLING)
//                .unlockedBy("has_magenta_dye", has(Items.MAGENTA_DYE)).save(recipeOutput);

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Starlume.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
