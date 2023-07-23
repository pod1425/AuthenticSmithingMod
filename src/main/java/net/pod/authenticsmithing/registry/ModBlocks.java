package net.pod.authenticsmithing.registry;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
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

    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> POLISHED_AMBER_BLOCK = registerBlock("polished_amber_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> POLISHED_DIAMOND_BLOCK = registerBlock("polished_diamond_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> POLISHED_LAPIS_BLOCK = registerBlock("polished_lapis_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> POLISHED_QUARTZ_BLOCK = registerBlock("polished_quartz_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> POLISHED_REDSTONE_BLOCK = registerBlock("polished_redstone_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", List.of(MOD_BLOCKS), BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));


    private static RegistryObject<Block> registerBlock(String name, List<List<RegistryObject<Item>>> tabs,
                                                       List<RegistryObject<Block>> model, Supplier<Block> block) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, block);
        RegistryObject<Item> blockItem = registerBlockItem(name, toReturn);
        for (List<RegistryObject<Item>> tab : tabs) {
            tab.add(blockItem);
        }
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
