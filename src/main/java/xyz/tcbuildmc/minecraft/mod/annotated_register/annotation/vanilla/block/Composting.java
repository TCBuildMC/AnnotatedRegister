package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see net.fabricmc.fabric.api.registry.CompostingChanceRegistry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Composting {
    /**
     * The composting chance of the item.
     * @return The chance.
     */
    float value();
}
