package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block.Flammable;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class FlammableProcessor implements Processor<Flammable> {
    @Override
    public <T> void process(String modId, Field field) {
        Flammable flammable = this.getAnnotation(field);

        try {
            FlammableBlockRegistry.getDefaultInstance().add((Block) field.get(null), flammable.burn(), flammable.spread());
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<Flammable> getAnnotationClass() {
        return Flammable.class;
    }
}
