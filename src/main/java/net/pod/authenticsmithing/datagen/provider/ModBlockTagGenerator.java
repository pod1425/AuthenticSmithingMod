package net.pod.authenticsmithing.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.registry.ModBlocks;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AuthenticSmithingMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add();

        //this.tag(BlockTags.NEEDS_IRON_TOOL).add();

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add();
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}