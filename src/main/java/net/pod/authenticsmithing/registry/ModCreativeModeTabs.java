package net.pod.authenticsmithing.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.registry.list.CreativeTabLists;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AuthenticSmithingMod.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CUT_QUARTZ_BLOCK.get()))
                    .title(Component.translatable("creativetab.blocks_tab"))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : CreativeTabLists.MOD_BLOCKS) {
                            output.accept(item.get());
                        }
                    }).build());
    public static final RegistryObject<CreativeModeTab> MOD_MATERIALS_TAB = CREATIVE_MODE_TABS.register("mod_materials_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OAK_BARK.get()))
                    .title(Component.translatable("creativetab.materials_tab"))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : CreativeTabLists.MOD_MATERIALS) {
                            output.accept(item.get());
                        }
                    }).build());
    public static final RegistryObject<CreativeModeTab> MOD_PARTS_TAB = CREATIVE_MODE_TABS.register("mod_parts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_PICKAXE_HEAD.get()))
                    .title(Component.translatable("creativetab.parts_tab"))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : CreativeTabLists.MOD_PARTS) {
                            output.accept(item.get());
                        }
                    }).build());
    public static final RegistryObject<CreativeModeTab> MOD_TOOLS_TAB = CREATIVE_MODE_TABS.register("mod_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_PICKAXE.get()))
                    .title(Component.translatable("creativetab.tools_tab"))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : CreativeTabLists.MOD_TOOLS) {
                            output.accept(item.get());
                        }
                    }).build());
    public static final RegistryObject<CreativeModeTab> MOD_JEWELERY_TAB = CREATIVE_MODE_TABS.register("mod_jewelery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUT_LAPIS.get()))
                    .title(Component.translatable("creativetab.jewelery_tab"))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : CreativeTabLists.MOD_JEWELRY) {
                            output.accept(item.get());
                        }
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
