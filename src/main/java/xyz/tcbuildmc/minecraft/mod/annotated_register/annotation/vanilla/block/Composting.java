package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Composting {
    float value();
}
