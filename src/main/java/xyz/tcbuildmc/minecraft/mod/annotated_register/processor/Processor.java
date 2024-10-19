package xyz.tcbuildmc.minecraft.mod.annotated_register.processor;

import net.minecraft.util.Identifier;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public interface Processor<A extends Annotation> {
    <T> void process(String modId, Field field);

    Class<A> getAnnotationClass();

    default boolean isAnnotated(Field field) {
        return field.isAnnotationPresent(this.getAnnotationClass());
    }

    default A getAnnotation(Field field) {
        return field.getAnnotation(this.getAnnotationClass());
    }

    default Identifier id(String modId, String id) {
        return new Identifier(modId, id);
    }
}
