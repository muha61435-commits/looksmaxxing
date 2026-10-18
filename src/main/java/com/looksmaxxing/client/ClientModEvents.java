package com.looksmaxxing.client;

import com.looksmaxxing.Looksmaxxing;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Looksmaxxing.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    public static final KeyMapping PROFILE_KEY =
            new KeyMapping("key.looksmaxxing.profile", InputConstants.KEY_K, "key.categories.looksmaxxing");

    @SubscribeEvent
    public static void keys(RegisterKeyMappingsEvent e) {
        e.register(PROFILE_KEY);
    }

    @SubscribeEvent
    public static void overlays(RegisterGuiOverlaysEvent e) {
        e.registerAboveAll("hud", Hud::render);
    }
}
