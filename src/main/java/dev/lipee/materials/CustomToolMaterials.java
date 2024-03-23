package dev.lipee.materials;

import com.google.common.base.Supplier;

import dev.lipee.Firstmod;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum CustomToolMaterials implements ToolMaterial {
  AMETHYST_PICKAXE(3, 1000, 9, 0F, 12,
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
  AMETHYST_SWORD(1, 1000, 1, 0F, 12,
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
  AMETHYST_SHOVEL(3, 1000, 8, 0F, 12,
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
  AMETHYST_AXE(2, 1000, 7, 0F, 12,
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
  AMETHYST_HOE(2, 1000, 8, 0F, 12,
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),

  LUNAR_STONE_PICKAXE(5, 1400, 11, 0F, 17,
      () -> Ingredient.ofItems(Firstmod.LUNAR_STONE)),
  LUNAR_STONE_SWORD(1, 1400, 1, 0F, 12,
      () -> Ingredient.ofItems(Firstmod.LUNAR_STONE)),
  LUNAR_STONE_SHOVEL(5, 1400, 10, 0F, 12,
      () -> Ingredient.ofItems(Firstmod.LUNAR_STONE)),
  LUNAR_STONE_AXE(3, 1400, 10, 0F, 12,
      () -> Ingredient.ofItems(Firstmod.LUNAR_STONE)),
  LUNAR_STONE_HOE(3, 1400, 9, 0F, 12,
      () -> Ingredient.ofItems(Firstmod.LUNAR_STONE));

  private final float attackDamage;
  private final int durability;
  private final int enchantability;
  private final int miningLevel;
  private final int miningSpeedMultiplier;
  private final Supplier<Ingredient> repairIngredient;

  CustomToolMaterials(
      int miningLevel,
      int durability,
      int miningSpeedMultiplier,
      float attackDamage,
      int enchantability,
      Supplier<Ingredient> repairIngredient) {
    this.miningLevel = miningLevel;
    this.durability = durability;
    this.miningSpeedMultiplier = miningSpeedMultiplier;
    this.attackDamage = attackDamage;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public float getAttackDamage() {
    return this.attackDamage;
  }

  @Override
  public int getDurability() {
    return this.durability;
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public int getMiningLevel() {
    return this.miningLevel;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return this.miningSpeedMultiplier;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient.get();
  }

}
