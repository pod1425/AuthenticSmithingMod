package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import static net.pod.authenticsmithing.registry.CreativeTabLists.*;
/*
    Just a template to copy

    public static final RegistryObject<Item> A = ITEMS.register("a",
            () -> new Item(new Item.Properties()));
*/

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AuthenticSmithingMod.MODID);

    //TODO: change all items to respective tabs
    public static final RegistryObject<Item> OAK_BARK = registerItem("oak_bark", INGREDIENTS,
            new Item.Properties());
    public static final RegistryObject<Item> BIRCH_BARK = registerItem("birch_bark", INGREDIENTS,
            new Item.Properties());
    public static final RegistryObject<Item> SPRUCE_BARK = registerItem("spruce_bark", INGREDIENTS,
            new Item.Properties());
    public static final RegistryObject<Item> JUNGLE_BARK = registerItem("jungle_bark", INGREDIENTS,
            new Item.Properties());
    public static final RegistryObject<Item> MANGROVE_BARK = registerItem("mangrove_bark", INGREDIENTS,
            new Item.Properties());
    public static final RegistryObject<Item> CHERRY_BARK = registerItem("cherry_bark", INGREDIENTS,
            new Item.Properties());

    public static final RegistryObject<Item> WARPED_BARK = registerItem("warped_bark", COMBAT,
            new Item.Properties());
    public static final RegistryObject<Item> CRIMSON_BARK = registerItem("crimson_bark", COMBAT,
            new Item.Properties());
    public static final RegistryObject<Item> DARK_OAK_BARK = registerItem("dark_oak_bark", COMBAT,
            new Item.Properties());
    public static final RegistryObject<Item> ACACIA_BARK = registerItem("acacia_bark", COMBAT,
            new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static RegistryObject<Item> registerItem(String name, List<RegistryObject<Item>> tab, Item.Properties itemProperties) {
        RegistryObject<Item> item = ITEMS.register(name, () -> new Item(itemProperties));
        tab.add(item);
        return item;
    }
}
