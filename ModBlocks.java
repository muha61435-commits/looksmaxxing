package com.looksmaxxing;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Looksmaxxing.MODID);

    public static final RegistryObject<Block> PULL_UP_BAR = BLOCKS.register("pull_up_bar",
            () -> new PullUpBarBlock(BlockBehaviour.Properties.of().strength(2.0f).sound(SoundType.METAL).noOcclusion()));
}
