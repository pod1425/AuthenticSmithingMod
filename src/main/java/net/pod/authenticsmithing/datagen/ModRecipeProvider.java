package net.pod.authenticsmithing.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.pod.authenticsmithing.datagen.builders.DisableRecipeBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        disable(Items.DIAMOND_LEGGINGS, pWriter);
        disable(Items.DIAMOND_HELMET, pWriter);
        disable(Items.DIAMOND_BOOTS, pWriter);
        disable(Items.DIAMOND_CHESTPLATE, pWriter);
    }

    private void disable(ItemLike result, Consumer<FinishedRecipe> recipeConsumer) {
        new DisableRecipeBuilder(result.asItem())
                .save(recipeConsumer, new ResourceLocation(getItemName(result)));
    }
}
