package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.game_event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see net.fabricmc.fabric.api.registry.SculkSensorFrequencyRegistry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SculkSensorFrequency {
    /**
     * The frequency of the game event for the sculk sensor.
     * @return The frequency.
     */
    int value();
}
