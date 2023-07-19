package net.pod.authenticsmithing.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pod.authenticsmithing.AuthenticSmithingMod;
import net.pod.authenticsmithing.registry.CreativeTabLists;
import net.pod.authenticsmithing.registry.ModItems;
import net.pod.authenticsmithing.util.FileHelper;

import java.io.File;
import java.net.URL;
import java.util.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AuthenticSmithingMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Set<RegistryObject<Item>> simpleItems = new HashSet<>();
        simpleItems.addAll(CreativeTabLists.FOOD);
        simpleItems.addAll(CreativeTabLists.SPAWN);
        simpleItems.addAll(CreativeTabLists.INGREDIENTS);
        Map<String, RegistryObject<Item>> customItems = new HashMap<>();
        // add custom model items here...

        simpleItems.removeAll(customItems.values());
        for (RegistryObject<Item> item : simpleItems) {
            simpleItem(item);
        }
        for (Map.Entry<String, RegistryObject<Item>> entry : customItems.entrySet()) {
            customModelItem(entry.getValue(), entry.getKey());
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AuthenticSmithingMod.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder customModelItem(RegistryObject<Item> item, String path) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AuthenticSmithingMod.MODID, path));

    }


}
