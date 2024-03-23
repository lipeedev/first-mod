package dev.lipee;

import dev.lipee.materials.CustomArmorMaterial;
import dev.lipee.materials.CustomToolMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class Firstmod implements ModInitializer {
  public static final String MOD_ID = "firstmod";

  public static final Item AMETHYST_PICKAXE = new PickaxeItem(CustomToolMaterials.AMETHYST_PICKAXE, 4, -3F,
      new FabricItemSettings());
  public static final Item AMETHYST_SWORD = new SwordItem(CustomToolMaterials.AMETHYST_SWORD, 8, -3F,
      new FabricItemSettings());
  public static final Item AMETHYST_AXE = new AxeItem(CustomToolMaterials.AMETHYST_AXE, 5, -2.8F,
      new FabricItemSettings());
  public static final Item AMETHYST_SHOVEL = new ShovelItem(CustomToolMaterials.AMETHYST_SHOVEL, 4, -2F,
      new FabricItemSettings());
  public static final Item AMETHYST_HOE = new HoeItem(CustomToolMaterials.AMETHYST_HOE, 4, -2F,
      new FabricItemSettings());

  public static final Item AMETHYST_BOOTS = new ArmorItem(CustomArmorMaterial.AMETHYST, ArmorItem.Type.BOOTS,
      new FabricItemSettings());
  public static final Item AMETHYST_LEGGINGS = new ArmorItem(CustomArmorMaterial.AMETHYST,
      ArmorItem.Type.LEGGINGS,
      new FabricItemSettings());
  public static final Item AMETHYST_CHESTPLATE = new ArmorItem(CustomArmorMaterial.AMETHYST,
      ArmorItem.Type.CHESTPLATE,
      new FabricItemSettings());
  public static final Item AMETHYST_HELMET = new ArmorItem(CustomArmorMaterial.AMETHYST, ArmorItem.Type.HELMET,
      new FabricItemSettings());

  public static final Item LUNAR_STONE = new Item(new FabricItemSettings());
  public static final Item LUNAR_STONE_PICKAXE = new PickaxeItem(CustomToolMaterials.LUNAR_STONE_PICKAXE, 4, -2.9F,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_AXE = new AxeItem(CustomToolMaterials.LUNAR_STONE_AXE, 6, -2.9F,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_SHOVEL = new ShovelItem(CustomToolMaterials.LUNAR_STONE_SHOVEL, 4, -2.9F,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_HOE = new HoeItem(CustomToolMaterials.LUNAR_STONE_HOE, 5, -2.9F,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_SWORD = new SwordItem(CustomToolMaterials.LUNAR_STONE_SWORD, 9, -2.9F,
      new FabricItemSettings());

  public static final Item LUNAR_STONE_BOOTS = new ArmorItem(CustomArmorMaterial.LUNAR_STONE, ArmorItem.Type.BOOTS,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_LEGGINGS = new ArmorItem(CustomArmorMaterial.LUNAR_STONE,
      ArmorItem.Type.LEGGINGS,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_CHESTPLATE = new ArmorItem(CustomArmorMaterial.LUNAR_STONE,
      ArmorItem.Type.CHESTPLATE,
      new FabricItemSettings());
  public static final Item LUNAR_STONE_HELMET = new ArmorItem(CustomArmorMaterial.LUNAR_STONE, ArmorItem.Type.HELMET,
      new FabricItemSettings());

  public static final Block LUNAR_STONE_ORE = new Block(
      FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(4F).requiresTool());
  public static final Item LUNAR_STONE_ORE_ITEM = new BlockItem(LUNAR_STONE_ORE, new FabricItemSettings());

  public static final Block DEEPSLATE_LUNAR_STONE_ORE = new Block(
      FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4F).requiresTool());
  public static final Item DEEPSLATE_LUNAR_STONE_ORE_ITEM = new BlockItem(DEEPSLATE_LUNAR_STONE_ORE,
      new FabricItemSettings());

  public static final RegistryKey<PlacedFeature> LUNAR_STONE_ORE_PLACED_KEY = RegistryKey
      .of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "lunar_stone_ore"));

  @Override
  public void onInitialize() {
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_pickaxe"), AMETHYST_PICKAXE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_sword"), AMETHYST_SWORD);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_axe"), AMETHYST_AXE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_shovel"), AMETHYST_SHOVEL);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_hoe"), AMETHYST_HOE);

    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_boots"), AMETHYST_BOOTS);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_leggings"), AMETHYST_LEGGINGS);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_chestplate"), AMETHYST_CHESTPLATE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "amethyst_helmet"), AMETHYST_HELMET);

    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone"), LUNAR_STONE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_pickaxe"), LUNAR_STONE_PICKAXE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_sword"), LUNAR_STONE_SWORD);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_axe"), LUNAR_STONE_AXE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_shovel"), LUNAR_STONE_SHOVEL);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_hoe"), LUNAR_STONE_HOE);

    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_boots"), LUNAR_STONE_BOOTS);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_leggings"), LUNAR_STONE_LEGGINGS);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_chestplate"), LUNAR_STONE_CHESTPLATE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_helmet"), LUNAR_STONE_HELMET);

    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunar_stone_ore"), LUNAR_STONE_ORE_ITEM);
    Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "lunar_stone_ore"), LUNAR_STONE_ORE);
    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "deepslate_lunar_stone_ore"),
        DEEPSLATE_LUNAR_STONE_ORE_ITEM);
    Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "deepslate_lunar_stone_ore"), DEEPSLATE_LUNAR_STONE_ORE);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
      content.addAfter(Items.NETHERITE_HOE, AMETHYST_AXE);
      content.addAfter(AMETHYST_AXE, AMETHYST_SHOVEL);
      content.addAfter(AMETHYST_SHOVEL, AMETHYST_HOE);
      content.addAfter(AMETHYST_HOE, AMETHYST_PICKAXE);

      content.addAfter(AMETHYST_PICKAXE, LUNAR_STONE_HOE);
      content.addAfter(LUNAR_STONE_HOE, LUNAR_STONE_AXE);
      content.addAfter(LUNAR_STONE_AXE, LUNAR_STONE_SHOVEL);
      content.addAfter(LUNAR_STONE_SHOVEL, LUNAR_STONE_PICKAXE);
    });

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
      content.addAfter(Items.DIAMOND, LUNAR_STONE);
    });

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
      content.add(LUNAR_STONE_ORE_ITEM);
      content.add(DEEPSLATE_LUNAR_STONE_ORE_ITEM);
    });

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
      content.addAfter(Items.NETHERITE_SWORD, AMETHYST_SWORD);
      content.addAfter(AMETHYST_SWORD, LUNAR_STONE_SWORD);

      content.addAfter(Items.NETHERITE_BOOTS, AMETHYST_HELMET);
      content.addAfter(AMETHYST_HELMET, AMETHYST_CHESTPLATE);
      content.addAfter(AMETHYST_CHESTPLATE, AMETHYST_LEGGINGS);
      content.addAfter(AMETHYST_LEGGINGS, AMETHYST_BOOTS);

      content.addAfter(Items.NETHERITE_BOOTS, LUNAR_STONE_BOOTS);
      content.addAfter(Items.NETHERITE_BOOTS, LUNAR_STONE_LEGGINGS);
      content.addAfter(Items.NETHERITE_BOOTS, LUNAR_STONE_CHESTPLATE);
      content.addAfter(Items.NETHERITE_BOOTS, LUNAR_STONE_HELMET);
    });

    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        LUNAR_STONE_ORE_PLACED_KEY);
  }
}
