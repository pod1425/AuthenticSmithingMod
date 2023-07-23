package net.pod.authenticsmithing.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.registry.ModBlocks;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AuthenticSmithingMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.AMBER_ORE.get(),
                ModBlocks.POLISHED_QUARTZ_BLOCK.get(),
                ModBlocks.POLISHED_REDSTONE_BLOCK.get(),
                ModBlocks.POLISHED_LAPIS_BLOCK.get(),
                ModBlocks.POLISHED_DIAMOND_BLOCK.get(),
                ModBlocks.POLISHED_AMBER_BLOCK.get(),
                ModBlocks.POLISHED_AMETHYST_BLOCK.get(),
                ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),
                ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                ModBlocks.DEEPSLATE_AMBER_ORE.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.LEAD_ORE.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.SILVER_ORE.get(),
                ModBlocks.TIN_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.POLISHED_REDSTONE_BLOCK.get(),
                ModBlocks.POLISHED_LAPIS_BLOCK.get(),
                ModBlocks.POLISHED_DIAMOND_BLOCK.get(),
                ModBlocks.POLISHED_AMBER_BLOCK.get(),
                ModBlocks.POLISHED_QUARTZ_BLOCK.get(),
                ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                ModBlocks.DEEPSLATE_AMBER_ORE.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.LEAD_ORE.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.SILVER_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.POLISHED_AMETHYST_BLOCK.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.TIN_ORE.get()
        );

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add();
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}