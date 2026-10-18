package com.looksmaxxing.client;

import com.looksmaxxing.data.PlayerStats;
import net.minecraft.nbt.CompoundTag;

public class ClientHandler {
    public static PlayerStats stats = new PlayerStats();
    public static boolean synced = false;

    public static void onSync(CompoundTag tag) {
        stats.load(tag);
        synced = true;
    }
}
