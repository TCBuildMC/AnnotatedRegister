package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see net.fabricmc.fabric.api.registry.FlammableBlockRegistry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Flammable {
    /**
     * The burn chance of the block.
     * @return The chance.
     */
    int burn();

    /**
     * The spread chance of the block.
     * @return The chance.
     */
    int spread();
}
