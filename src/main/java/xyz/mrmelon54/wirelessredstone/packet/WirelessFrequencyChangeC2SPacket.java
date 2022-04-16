package xyz.mrmelon54.wirelessredstone.packet;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ServerPlayPacketListener;

public record WirelessFrequencyChangeC2SPacket(int freq) implements Packet<ServerPlayPacketListener> {
    @Override
    public void write(PacketByteBuf buf) {
        buf.writeInt(freq);
    }

    @Override
    public void apply(ServerPlayPacketListener listener) {
    }
}
