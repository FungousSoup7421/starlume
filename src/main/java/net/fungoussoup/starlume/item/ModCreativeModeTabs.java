package net.fungoussoup.starlume.item;

import net.fungoussoup.starlume.Starlume;
import net.fungoussoup.starlume.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Starlume.MOD_ID);

    public static final Supplier<CreativeModeTab> STARLUME_TAB = CREATIVE_MODE_TAB.register("starlume_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STARLIT_STONE.get()))
                    .title(Component.translatable("creativetab.starlume.starlume"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STARLIT_SOIL);
                        output.accept(ModBlocks.STARLIT_STONE);
                    }).build());

//    public static final Supplier<CreativeModeTab> TINTED_GROVE_TREES_TAB = CREATIVE_MODE_TAB.register("tinted_grove_trees_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CYAN_SAPLING.get()))
//                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Starlume.MOD_ID, "tinted_grove_tab"))
//                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_trees"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
