package net.akimaybi.shadedarts.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

import static net.minecraft.component.type.ConsumableComponents.food;

public class ModConsumableComponents {

    public static final ConsumableComponent VOIDSTAR = food()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0))
                    )
            ).build();

}
