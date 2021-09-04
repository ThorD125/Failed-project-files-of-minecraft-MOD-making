package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
 
    // an instance of our new item
    public static final Item Baguette = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(15).saturationModifier(18f).build()));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("thormod", "baguette"), Baguette);
    } 
}