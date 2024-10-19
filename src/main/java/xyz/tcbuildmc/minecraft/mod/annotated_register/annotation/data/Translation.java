package xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.data;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Repeatable(Translations.class)
public @interface Translation {
    String lang();
    String text();
}
