package net.akimaybi.shadedarts.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class BlindingTrap extends Block {
    public BlindingTrap(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof PlayerEntity player) {

            StatusEffectInstance blindnessEffect =
                    new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0); // 100 ticks (5 seconds), amplifier 0

            player.addStatusEffect(blindnessEffect);
        }

        super.onSteppedOn(world, pos, state, entity);
    }


}
