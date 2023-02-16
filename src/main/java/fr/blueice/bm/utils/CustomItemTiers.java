package fr.blueice.bm.utils;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public enum CustomItemTiers implements Tier {



    COPPER(8, 3160, 16.0F, 6.0F, 25, new LazyLoadedValue<>(() -> {
        return Ingredient.of(Items.COPPER_INGOT);
    })),

    AMETHYSM(6, 3060, 16.0F, 10.0F, 25, new LazyLoadedValue<>(() -> {
        return Ingredient.of(Items.AMETHYST_SHARD);
    }));
   private final int harvestLevel;
   private final int maxUses;
   private final float afficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyLoadedValue<Ingredient> repairMaterial;

    CustomItemTiers(int harvestLevel, int maxUses, float afficiency, float attackDamage, int enchantability, LazyLoadedValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.afficiency = afficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return afficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
