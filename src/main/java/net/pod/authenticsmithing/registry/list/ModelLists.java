package net.pod.authenticsmithing.registry.list;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModelLists {
    public static final List<RegistryObject<Item>> COMMON = new ArrayList<>();
    public static final List<RegistryObject<Item>> TOOL = new ArrayList<>();
    public static final List<RegistryObject<Item>> CUSTOM = new ArrayList<>();
    public static final List<RegistryObject<Block>> BLOCK_CUBE = new ArrayList<>();
    public static final List<RegistryObject<Block>> BLOCK_CUSTOM = new ArrayList<>();
}
