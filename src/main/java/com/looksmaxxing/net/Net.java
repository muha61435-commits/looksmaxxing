package com.looksmaxxing.net;

import com.looksmaxxing.Looksmaxxing;
import com.looksmaxxing.ServerEvents;
import com.looksmaxxing.data.PlayerStats;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class Net {
    private static final String VERSION = "1";
    public static final SimpleChannel CH = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(Looksmaxxing.MODID, "main"), () -> VERSION, VERSION::equals, VERSION::equals);

    public static void register() {
        int id = 0;
        CH.registerMessage(id++, SyncPacket.class, SyncPacket::encode, SyncPacket::decode, SyncPacket::handle);
        CH.registerMessage(id++, CreationPacket.class, CreationPacket::encode, CreationPacket::decode, CreationPacket::handle);
    }

    public static void sync(ServerPlayer sp) {
        PlayerStats s = ServerEvents.get(sp);
        if (s != null) {
            CH.send(PacketDistributor.PLAYER.with(() -> sp), new SyncPacket(s.save()));
        }
    }
}
