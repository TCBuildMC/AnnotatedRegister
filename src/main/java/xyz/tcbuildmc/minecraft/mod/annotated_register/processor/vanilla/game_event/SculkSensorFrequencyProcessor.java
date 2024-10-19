package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.game_event;

import net.fabricmc.fabric.api.registry.SculkSensorFrequencyRegistry;
import net.minecraft.world.event.GameEvent;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.game_event.SculkSensorFrequency;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class SculkSensorFrequencyProcessor implements Processor<SculkSensorFrequency> {
    @Override
    public <T> void process(String modId, Field field) {
        SculkSensorFrequency sculkSensorFrequency = this.getAnnotation(field);

        try {
            SculkSensorFrequencyRegistry.register((GameEvent) field.get(null), sculkSensorFrequency.value());
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<SculkSensorFrequency> getAnnotationClass() {
        return SculkSensorFrequency.class;
    }
}
