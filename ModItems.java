package com.looksmaxxing;

import com.looksmaxxing.item.ProteinMealItem;
import com.looksmaxxing.item.RankUpTokenItem;
import com.looksmaxxing.item.TrainingItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Looksmaxxing.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Looksmaxxing.MODID);

    public static final RegistryObject<Item> RANK_UP_TOKEN = ITEMS.register("rank_up_token",
            () -> new RankUpTokenItem(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> DUMBBELLS = ITEMS.register("resistance_dumbbells",
            () -> new TrainingItem(new Item.Properties().stacksTo(1), 0.6, 8, 3, 0.0));

    public static final RegistryObject<Item> BARBELL = ITEMS.register("training_barbell",
            () -> new TrainingItem(new Item.Properties().stacksTo(1), 1.2, 15, 5, 0.1));

    public static final RegistryObject<Item> PROTEIN_MEAL = ITEMS.register("protein_meal",
            () -> new ProteinMealItem(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())));

    public static final RegistryObject<Item> PULL_UP_BAR = ITEMS.register("pull_up_bar",
            () -> new BlockItem(ModBlocks.PULL_UP_BAR.get(), new Item.Properties()));

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.looksmaxxing"))
                    .icon(() -> new ItemStack(RANK_UP_TOKEN.get()))
                    .displayItems((params, output) -> {
                        output.accept(RANK_UP_TOKEN.get());
                        output.accept(DUMBBELLS.get());
                        output.accept(BARBELL.get());
                        output.accept(PULL_UP_BAR.get());
                        output.accept(PROTEIN_MEAL.get());
                    })
                    .build());
}
