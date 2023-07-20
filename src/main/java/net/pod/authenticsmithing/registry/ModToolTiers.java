package net.pod.authenticsmithing.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.pod.authenticsmithing.AuthenticSmithingMod;

import java.util.List;

public class ModToolTiers {
    //TODO: replace oak bark with actual materials
    public static final Tier FLINT = TierSortingRegistry.registerTier(
            new ForgeTier(1, 212, 6.5f, 2f, 6,
                    ModTags.Blocks.NEEDS_FLINT_TOOL, () -> Ingredient.of(ModItems.OAK_BARK.get())),
            new ResourceLocation(AuthenticSmithingMod.MODID, "flint"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 511, 6.0f, 3f, 16,
                    ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.OAK_BARK.get())),
            new ResourceLocation(AuthenticSmithingMod.MODID, "bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(0, 16, 14.0f, 1f, 26,
                    ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.OAK_BARK.get())),
            new ResourceLocation(AuthenticSmithingMod.MODID, "silver"), List.of(Tiers.GOLD), List.of(Tiers.NETHERITE));
    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3602, 14.0f, 5f, 12,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.OAK_BARK.get())),
            new ResourceLocation(AuthenticSmithingMod.MODID, "titanium"), List.of(Tiers.NETHERITE), List.of());
}
