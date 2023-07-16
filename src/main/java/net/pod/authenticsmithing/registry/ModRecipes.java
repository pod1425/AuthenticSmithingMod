package net.pod.authenticsmithing.registry;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.recipe.DisableRecipe;


public class ModRecipes {
        public static final DeferredRegister<RecipeSerializer<?>> RECIPES = DeferredRegister.create(
                ForgeRegistries.RECIPE_SERIALIZERS, AuthenticSmithingMod.MODID);
        public static void register(IEventBus eventBus){
            RECIPES.register(eventBus);
        }

        public static final RegistryObject<RecipeSerializer<?>> DISABLE_SERIALIZER = RECIPES.register(
                "disable", () -> DisableRecipe.SERIALIZER);
}
