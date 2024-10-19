package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.Register;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class RegisterProcessor implements Processor<Register> {
    @Override
    public <T> void process(String modId, Field field) {
        Register register = this.getAnnotation(field);
        Identifier id = this.id(modId, register.id());

        try {
            String stringType = register.type().toUpperCase();
            Registry<T> mcRegistry = (Registry<T>) Registries.class.getField(stringType).get(null);
            Registry.register(mcRegistry, id, (T) field.get(null));
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<Register> getAnnotationClass() {
        return Register.class;
    }
}
