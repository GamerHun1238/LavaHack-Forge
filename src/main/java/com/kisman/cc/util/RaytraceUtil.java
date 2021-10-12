package com.kisman.cc.util;

import com.kisman.cc.util.cosmos.Raytrace;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class RaytraceUtil {
    private static Minecraft mc = Minecraft.getMinecraft();

    public static boolean raytraceBlock(BlockPos blockPos, Raytrace raytrace) {
        return mc.world.rayTraceBlocks(new Vec3d(mc.player.posX, mc.player.posY + mc.player.getEyeHeight(), mc.player.posZ), new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + raytrace.getOffset(), blockPos.getZ() + 0.5), false, true, false) != null;
    }

    public static boolean raytraceEntity(Entity entity, double offset) {
        return mc.world.rayTraceBlocks(new Vec3d(mc.player.posX, mc.player.posY + mc.player.getEyeHeight(), mc.player.posZ), new Vec3d(entity.posX, entity.posY + offset, entity.posZ), false, true, false) == null;
    }
}
