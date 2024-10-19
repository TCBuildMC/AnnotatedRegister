package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Register {
    String id();

    String type();
}
