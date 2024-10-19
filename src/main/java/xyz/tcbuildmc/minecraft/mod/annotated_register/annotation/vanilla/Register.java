package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Helper to register. (Vanilla Registry)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Register {
    /**
     * The id of the registry entry.
     * @return The id.
     */
    String id();

    /**
     * The type of the registry entry.
     * @return The type.
     */
    String type();
}
