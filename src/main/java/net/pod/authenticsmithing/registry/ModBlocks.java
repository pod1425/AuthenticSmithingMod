package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));

    public static final RegistryObject<Block> CUT_AMBER_BLOCK = registerBlock("cut_amber_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> CUT_AMETHYST_BLOCK = registerBlock("cut_amethyst_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> CUT_DIAMOND_BLOCK = registerBlock("cut_diamond_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> CUT_LAPIS_BLOCK = registerBlock("cut_lapis_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> CUT_QUARTZ_BLOCK = registerBlock("cut_quartz_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> CUT_REDSTONE_BLOCK = registerBlock("cut_redstone_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(3f, 3f)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(4.0F, 6.0F)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", MOD_BLOCKS, BLOCK_CUBE,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));


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
