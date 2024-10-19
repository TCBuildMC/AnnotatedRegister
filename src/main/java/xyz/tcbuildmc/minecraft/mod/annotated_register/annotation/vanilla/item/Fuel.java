package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see net.fabricmc.fabric.api.registry.FuelRegistry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Fuel {
    /**
     * The total ticks the fuel will burn.
     * @return The total ticks.
     */
    short value();
}
