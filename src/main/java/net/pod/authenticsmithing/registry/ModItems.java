package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;

public class ModItems {
    /*
    Just a template to copy

    public static final RegistryObject<Item> A = ITEMS.register("a",
            () -> new Item(new Item.Properties()));
     */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AuthenticSmithingMod.MODID);

    public static final RegistryObject<Item> OAK_BARK = ITEMS.register("oak_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARK = ITEMS.register("birch_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BARK = ITEMS.register("spruce_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BARK = ITEMS.register("jungle_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BARK = ITEMS.register("mangrove_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BARK = ITEMS.register("cherry_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BARK = ITEMS.register("warped_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BARK = ITEMS.register("crimson_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_BARK = ITEMS.register("dark_oak_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BARK = ITEMS.register("acacia_bark",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
