package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ItemConvertible;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item.Fuel;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class FuelProcessor implements Processor<Fuel> {
    @Override
    public <T> void process(String modId, Field field) {
        Fuel fuel = this.getAnnotation(field);

        try {
            FuelRegistry.INSTANCE.add((ItemConvertible) field.get(null), (int) fuel.value());
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<Fuel> getAnnotationClass() {
        return Fuel.class;
    }
}
