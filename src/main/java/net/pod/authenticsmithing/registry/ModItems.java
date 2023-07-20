package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;

import java.util.List;
import java.util.function.Supplier;

import static net.pod.authenticsmithing.registry.list.CreativeTabLists.*;
import static net.pod.authenticsmithing.registry.list.ModelLists.COMMON;
/*
    Just a template to copy

    public static final RegistryObject<Item> A = ITEMS.register("a",
            () -> new Item(new Item.Properties()));
*/

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AuthenticSmithingMod.MODID);

    //TODO: change all items to respective tabs
    public static final RegistryObject<Item> OAK_BARK = registerItem("oak_bark", MOD_MATERIALS, COMMON,
            () -> new Item(new Item.Properties()));

    //TODO: add cherry and mangrove bark
    //public static final RegistryObject<Item> MANGROVE_BARK = registerItem("mangrove_bark", INGREDIENTS,
    //        new Item.Properties());
    //public static final RegistryObject<Item> CHERRY_BARK = registerItem("cherry_bark", INGREDIENTS,
    //        new Item.Properties());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static RegistryObject<Item> registerItem(String name, List<RegistryObject<Item>> tab,
                 List<RegistryObject<Item>> model, Supplier<Item> itemSupplier) {
        RegistryObject<Item> item = ITEMS.register(name, itemSupplier);
        tab.add(item);
        model.add(item);
        return item;
    }
}
