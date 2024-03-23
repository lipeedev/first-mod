package dev.lipee.materials;

import net.minecraft.item.ArmorItem.Type;

import com.google.common.base.Supplier;

import dev.lipee.Firstmod;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum CustomArmorMaterial implements ArmorMaterial {
  AMETHYST("amethyst", 18, 15, 1F, 0.2F,
      SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
      new int[] { 2, 7, 5, 2 },
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),

  LUNAR_STONE("lunar_stone", 15, 25, 0F, 0.4F,
      SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
      new int[] { 2, 9, 7, 2 },
      () -> Ingredient.ofItems(Items.AMETHYST_SHARD));

  private final String name;
  private final int durabilityMultiplier;
  private final int enchantability;
  private final SoundEvent equipSound;
  private final float toughness;
  private final float knockbackResistance;
  private final int[] protectionsAmount;
  private final Supplier<Ingredient> repairIngredient;

  private static final int[] BASE_DURABILITY = { 32, 37, 40, 33 };

  private CustomArmorMaterial(
      String name,
      int enchantability,
      int durabilityMultiplier,
      float toughness,
      float knockbackResistance,
      SoundEvent equipSound,
      int[] protectionsAmount,
      Supplier<Ingredient> repairIngredient) {
    this.name = name;
    this.durabilityMultiplier = durabilityMultiplier;
    this.enchantability = enchantability;
    this.equipSound = equipSound;
    this.toughness = toughness;
    this.knockbackResistance = knockbackResistance;
    this.protectionsAmount = protectionsAmount;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public int getDurability(Type type) {
    return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public SoundEvent getEquipSound() {
    return this.equipSound;
  }

  @Override
  public float getKnockbackResistance() {
    return this.knockbackResistance;
  }

  @Override
  public String getName() {
    return Firstmod.MOD_ID + ':' + this.name;
  }

  @Override
  public int getProtection(Type type) {
    return this.protectionsAmount[type.ordinal()];
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient.get();
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }

}
