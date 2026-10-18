package com.looksmaxxing;

import com.looksmaxxing.item.RankUpTokenItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.looksmaxxing"))
                    .icon(() -> new ItemStack(RANK_UP_TOKEN.get()))
                    .displayItems((params, output) -> output.accept(RANK_UP_TOKEN.get()))
                    .build());
}
