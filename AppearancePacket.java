package com.looksmaxxing.net;

import com.looksmaxxing.client.ClientHandler;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

/** Server -> clients tracking a player: values used to render that player's body. */
public class AppearancePacket {
    public final UUID id;
    public final float height, frame, muscle;

    public AppearancePacket(UUID id, float height, float frame, float muscle) {
        this.id = id;
        this.height = height;
        this.frame = frame;
        this.muscle = muscle;
    }

    public static void encode(AppearancePacket m, FriendlyByteBuf b) {
        b.writeUUID(m.id);
        b.writeFloat(m.height);
        b.writeFloat(m.frame);
        b.writeFloat(m.muscle);
    }

    public static AppearancePacket decode(FriendlyByteBuf b) {
        return new AppearancePacket(b.readUUID(), b.readFloat(), b.readFloat(), b.readFloat());
    }

    public static void handle(AppearancePacket m, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() ->
                DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ClientHandler.setAppearance(m.id, m.height, m.frame, m.muscle)));
        ctx.get().setPacketHandled(true);
    }
}
