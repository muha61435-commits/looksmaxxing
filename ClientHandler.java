package com.looksmaxxing.client;

import com.looksmaxxing.data.PlayerStats;
import net.minecraft.nbt.CompoundTag;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientHandler {
    public static PlayerStats stats = new PlayerStats();
    public static boolean synced = false;
    /** player uuid -> {height slider, frame slider, muscle 0..1} */
    public static final Map<UUID, float[]> appearance = new HashMap<>();

    public static void onSync(CompoundTag tag) {
        stats.load(tag);
        synced = true;
    }

    public static void setAppearance(UUID id, float height, float frame, float muscle) {
        appearance.put(id, new float[]{height, frame, muscle});
    }
}
