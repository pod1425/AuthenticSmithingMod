package net.pod.authenticsmithing;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.registry.ModItems;
import net.pod.authenticsmithing.registry.ModRecipes;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static net.pod.authenticsmithing.registry.CreativeTabLists.*;
// The value here should match an entry in the META-INF/mods.toml file
@Mod(AuthenticSmithingMod.MODID)
public class AuthenticSmithingMod {
    public static final String MODID = "authenticsmithing";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AuthenticSmithingMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        LOGGER.info("Hello from Authentic Smithing Mod!");

        ModItems.register(modEventBus);
        ModRecipes.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    //TODO: Add all tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        List<RegistryObject<Item>> items = new ArrayList<>();

        if (tab.equals(CreativeModeTabs.INGREDIENTS)) {
            items.addAll(INGREDIENTS);
        } else if (tab.equals(CreativeModeTabs.COMBAT)) {
            items.addAll(COMBAT);
        } else if (tab.equals(CreativeModeTabs.FOOD_AND_DRINKS)) {
            items.addAll(FOOD);
        } else if (tab.equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            items.addAll(TOOLS);
        } else if (tab.equals(CreativeModeTabs.BUILDING_BLOCKS)) {
            //items.addAll(TOOLS);
        } else if (tab.equals(CreativeModeTabs.COLORED_BLOCKS)) {
            //items.addAll(TOOLS);
        } else if (tab.equals(CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
            //items.addAll(TOOLS);
        } else if (tab.equals(CreativeModeTabs.REDSTONE_BLOCKS)) {
            //items.addAll(TOOLS);
        } else if (tab.equals(CreativeModeTabs.SPAWN_EGGS)) {
            items.addAll(TOOLS);
        } else {
            return;
        }
        for (RegistryObject<Item> item : items) {
            event.accept(item);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
