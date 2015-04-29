package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;

public class S43PacketCamera implements Packet {
   public int field_179781_a;
   private static final String __OBFID = "CL_00002289";

   public S43PacketCamera() {}

   public S43PacketCamera(Entity p_i45960_1_) {
      this.field_179781_a = p_i45960_1_.getEntityId();
   }

   public void readPacketData(PacketBuffer data) throws IOException {
      this.field_179781_a = data.readVarIntFromBuffer();
   }

   public void writePacketData(PacketBuffer data) throws IOException {
      data.writeVarIntToBuffer(this.field_179781_a);
   }

   public void func_179779_a(INetHandlerPlayClient p_179779_1_) {
      p_179779_1_.func_175094_a(this);
   }

   public void processPacket(INetHandler handler) {
      this.func_179779_a((INetHandlerPlayClient)handler);
   }
}