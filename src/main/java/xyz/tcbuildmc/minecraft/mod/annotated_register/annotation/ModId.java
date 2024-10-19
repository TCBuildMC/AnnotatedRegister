package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Helper to get Mod ID.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModId {
    /**
     * The Mod ID.
     * @return The Mod ID.
     */
    String value();
}
