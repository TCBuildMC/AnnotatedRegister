package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Group {
    /**
     * The id of the item group you want to add the item to.
     * @return The id.
     */
    String value();
}
