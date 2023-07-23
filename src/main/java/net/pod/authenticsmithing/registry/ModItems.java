package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.item.custom.PartItem;
import net.pod.authenticsmithing.item.custom.fun.RickItem;

import java.util.List;
import java.util.function.Supplier;

import static net.pod.authenticsmithing.registry.list.CreativeTabLists.*;
import static net.pod.authenticsmithing.registry.list.ModelLists.COMMON;
import static net.pod.authenticsmithing.registry.list.ModelLists.TOOL;
/*
    Just a template to copy

    public static final RegistryObject<Item> A = ITEMS.register("a",
            () -> new Item(new Item.Properties()));
*/

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AuthenticSmithingMod.MODID);

    //TODO: add cherry and mangrove bark
    public static final RegistryObject<Item> ACACIA_BARK = registerItem("acacia_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = registerItem("amber",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER_DUST = registerItem("amber_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_DUST = registerItem("amethyst_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARK = registerItem("birch_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = registerItem("bronze_axe",
            List.of(MOD_TOOLS), TOOL, () -> new AxeItem(ModToolTiers.BRONZE, 3.0f, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE_HEAD = registerItem("bronze_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BLADE = registerItem("bronze_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_COUNTERWEIGHT = registerItem("bronze_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_GUARD = registerItem("bronze_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = registerItem("bronze_hoe",
            List.of(MOD_TOOLS), TOOL, () -> new HoeItem(ModToolTiers.BRONZE, 1, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE_HEAD = registerItem("bronze_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            List.of(MOD_TOOLS), TOOL, () -> new PickaxeItem(ModToolTiers.BRONZE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE_HEAD = registerItem("bronze_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = registerItem("bronze_shovel",
            List.of(MOD_TOOLS), TOOL, () -> new ShovelItem(ModToolTiers.BRONZE, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL_HEAD = registerItem("bronze_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SWORD = registerItem("bronze_sword",
            List.of(MOD_TOOLS), TOOL, () -> new SwordItem(ModToolTiers.BRONZE, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> COKE_COAL = registerItem("coke_coal",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BARK = registerItem("crimson_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUCIBLE_GRIP = registerItem("crucible_grip",
            List.of(MOD_TOOLS), TOOL, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_QUARTZ = registerItem("crystal_quartz",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_AMBER = registerItem("cut_amber",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_AMETHYST = registerItem("cut_amethyst",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_CRYSTAL_QUARTZ = registerItem("cut_crystal_quartz",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_DIAMOND = registerItem("cut_diamond",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_LAPIS = registerItem("cut_lapis",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_REDSTONE_STONE = registerItem("cut_redstone_stone",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_BARK = registerItem("dark_oak_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DUST = registerItem("diamond_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_DUST = registerItem("emerald_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIBER = registerItem("fiber",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAT_BOULDER = registerItem("flat_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLINT_AXE = registerItem("flint_axe",
            List.of(MOD_TOOLS), TOOL, () -> new AxeItem(ModToolTiers.FLINT, 3.0f, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_HOE = registerItem("flint_hoe",
            List.of(MOD_TOOLS), TOOL, () -> new HoeItem(ModToolTiers.FLINT, 1, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_PICKAXE = registerItem("flint_pickaxe",
            List.of(MOD_TOOLS), TOOL, () -> new PickaxeItem(ModToolTiers.FLINT, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_SHOVEL = registerItem("flint_shovel",
            List.of(MOD_TOOLS), TOOL, () -> new ShovelItem(ModToolTiers.FLINT, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_AXE_HEAD = registerItem("golden_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BLADE = registerItem("golden_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_COUNTERWEIGHT = registerItem("golden_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_GUARD = registerItem("golden_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HOE_HEAD = registerItem("golden_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_HEAD = registerItem("golden_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_HEAD = registerItem("golden_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_AXE_HEAD = registerItem("iron_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE = registerItem("iron_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_COUNTERWEIGHT = registerItem("iron_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_GUARD = registerItem("iron_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_HOE_HEAD = registerItem("iron_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD = registerItem("iron_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD = registerItem("iron_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SMITHING_HAMMER = registerItem("iron_smithing_hammer",
            List.of(MOD_TOOLS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_TONGS = registerItem("iron_tongs",
            List.of(MOD_TOOLS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BARK = registerItem("jungle_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_DUST = registerItem("lapis_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = registerItem("lead_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = registerItem("lead_nugget",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LONG_BOULDER = registerItem("long_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MASSIVE_BOULDER = registerItem("massive_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_AXE_HEAD = registerItem("netherite_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BLADE = registerItem("netherite_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_COUNTERWEIGHT = registerItem("netherite_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GUARD = registerItem("netherite_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HOE_HEAD = registerItem("netherite_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PICKAXE_HEAD = registerItem("netherite_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_HEAD = registerItem("netherite_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> OAK_BARK = registerItem("oak_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_LAPIS = registerItem("polished_lapis",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_DUST = registerItem("quartz_dust",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = registerItem("raw_lead",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = registerItem("raw_silver",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = registerItem("raw_tin",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_STONE = registerItem("redstone_stone",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RICK = registerItem("rick",
            List.of(MOD_MATERIALS), COMMON, () -> new RickItem(new Item.Properties()));
    public static final RegistryObject<Item> ROPE = registerItem("rope",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARPEN_FLAT_BOULDER = registerItem("sharpen_flat_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARPEN_SMALL_BOULDER = registerItem("sharpen_small_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = registerItem("silver_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_BOULDER = registerItem("small_boulder",
            List.of(MOD_PARTS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BARK = registerItem("spruce_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = registerItem("steel_axe",
            List.of(MOD_TOOLS), TOOL, () -> new AxeItem(Tiers.DIAMOND, 3.0f, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE_HEAD = registerItem("steel_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BLADE = registerItem("steel_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_COUNTERWEIGHT = registerItem("steel_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_GUARD = registerItem("steel_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = registerItem("steel_hoe",
            List.of(MOD_TOOLS), TOOL, () -> new HoeItem(Tiers.DIAMOND, 1, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE_HEAD = registerItem("steel_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = registerItem("steel_pickaxe",
            List.of(MOD_TOOLS), TOOL, () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE_HEAD = registerItem("steel_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = registerItem("steel_shovel",
            List.of(MOD_TOOLS), TOOL, () -> new ShovelItem(Tiers.DIAMOND, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL_HEAD = registerItem("steel_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SMITHING_HAMMER = registerItem("steel_smithing_hammer",
            List.of(MOD_TOOLS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SWORD = registerItem("steel_sword",
            List.of(MOD_TOOLS), TOOL, () -> new SwordItem(Tiers.DIAMOND, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_TONGS = registerItem("steel_tongs",
            List.of(MOD_TOOLS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = registerItem("tin_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = registerItem("tin_nugget",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCUT_EMERALD = registerItem("uncut_emerald",
            List.of(MOD_JEWELRY), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BARK = registerItem("warped_bark",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AXE_HEAD = registerItem("wooden_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HOE_HEAD = registerItem("wooden_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_PICKAXE_HEAD = registerItem("wooden_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SHOVEL_HEAD = registerItem("wooden_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SWORD_PARTS = registerItem("wooden_sword_parts",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = registerItem("bronze_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = registerItem("electrum_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE = registerItem("silver_axe",
            List.of(MOD_TOOLS), TOOL, () -> new AxeItem(ModToolTiers.SILVER, 3.0f, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE_HEAD = registerItem("silver_axe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BLADE = registerItem("silver_blade",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_COUNTERWEIGHT = registerItem("silver_counterweight",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GUARD = registerItem("silver_guard",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE = registerItem("silver_hoe",
            List.of(MOD_TOOLS), TOOL, () -> new HoeItem(ModToolTiers.SILVER, 1, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE_HEAD = registerItem("silver_hoe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE = registerItem("silver_pickaxe",
            List.of(MOD_TOOLS), TOOL, () -> new PickaxeItem(ModToolTiers.SILVER, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE_HEAD = registerItem("silver_pickaxe_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL = registerItem("silver_shovel",
            List.of(MOD_TOOLS), TOOL, () -> new ShovelItem(ModToolTiers.SILVER, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL_HEAD = registerItem("silver_shovel_head",
            List.of(MOD_PARTS), COMMON, () -> new PartItem(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SWORD = registerItem("silver_sword",
            List.of(MOD_TOOLS), TOOL, () -> new SwordItem(ModToolTiers.SILVER, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = registerItem("steel_ingot",
            List.of(MOD_MATERIALS), COMMON, () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    private static RegistryObject<Item> registerItem(String name, List<List<RegistryObject<Item>>> tabs,
                 List<RegistryObject<Item>> model, Supplier<Item> itemSupplier) {
        RegistryObject<Item> item = ITEMS.register(name, itemSupplier);
        for (List<RegistryObject<Item>> tab : tabs) {
            tab.add(item);
        }
        model.add(item);
        return item;
    }

}
