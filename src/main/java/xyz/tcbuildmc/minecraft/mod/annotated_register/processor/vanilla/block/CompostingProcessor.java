package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.block;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemConvertible;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block.Composting;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class CompostingProcessor implements Processor<Composting> {
    @Override
    public <T> void process(String modId, Field field) {
        Composting composting = this.getAnnotation(field);

        try {
            CompostingChanceRegistry.INSTANCE.add((ItemConvertible) field.get(null), composting.value());
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<Composting> getAnnotationClass() {
        return Composting.class;
    }
}
