package net.fungoussoup.starlume.worldgen;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

//    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WOOD_KEY = registerKey("red_wood");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

//        register(context, RED_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                BlockStateProvider.simple(ModBlocks.RED_LOG.get()),
//                new StraightTrunkPlacer(4,2,0),
//                BlockStateProvider.simple(ModBlocks.RED_LEAVES.get()),
//                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
//                new TwoLayersFeatureSize(1,0,1)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Starlume.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
