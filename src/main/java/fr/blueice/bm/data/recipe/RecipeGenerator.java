package fr.blueice.bm.data.recipe;

import fr.blueice.bm.init.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider implements IConditionBuilder {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(ModItems.AMETHYST_SWORD.get())
                .pattern("*")
                .pattern("*")
                .pattern("#")
                .define('#', Items.STICK)
                .define('*', Items.AMETHYST_SHARD)
                .unlockedBy("unlock_amethyst_sword", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK, Items.AMETHYST_SHARD))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COPPER_STICK.get())
                .pattern("*")
                .pattern("*")
                .define('*', Items.COPPER_INGOT)
                .unlockedBy("unlock_copper_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COPPER_PICKAXE.get())
                .pattern("///")
                .pattern(" + ")
                .pattern(" + ")
                .define('/', Items.COPPER_INGOT)
                .define('+', ModItems.COPPER_STICK.get())
                .unlockedBy("unlock_copper_pickaxe", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT, ModItems.COPPER_STICK.get()))
                .save(consumer);
    }
}
