package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;

import java.util.List;
import java.util.function.Supplier;
import static net.pod.authenticsmithing.registry.list.CreativeTabLists.*;
import static net.pod.authenticsmithing.registry.list.ModelLists.*;
/*
Template to copy

public static final RegistryObject<Block> A_BLOCK = registerBlock("a_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
 */

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AuthenticSmithingMod.MODID);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", BUILDING, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", BUILDING, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));


    private static RegistryObject<Block>
    registerBlock(String name,
                  List<RegistryObject<Item>> tab, List<RegistryObject<Block>> model, Supplier<Block> block) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, block);
        tab.add(registerBlockItem(name, toReturn));
        model.add(toReturn);
        return toReturn;
    }

    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
