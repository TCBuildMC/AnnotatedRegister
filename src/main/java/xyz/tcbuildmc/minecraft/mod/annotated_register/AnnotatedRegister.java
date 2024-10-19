package xyz.tcbuildmc.minecraft.mod.annotated_register;

import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.ModId;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.block.*;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.game_event.SculkSensorFrequencyProcessor;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.item.*;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.RegisterProcessor;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.stat.StatProcessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class AnnotatedRegister {
    private static final Set<Processor<?>> PROCESSORS = Collections.synchronizedSet(new LinkedHashSet<>());

    static {
        register(new RegisterProcessor());
        register(new GroupProcessor());
        register(new CompostingProcessor());
        register(new FlammableProcessor());
        register(new FuelProcessor());
        register(new SculkSensorFrequencyProcessor());
        register(new StatProcessor());
    }

    public static <A extends Annotation> Processor<A> register(Processor<A> processor) {
        PROCESSORS.add(processor);
        return processor;
    }

    public static void process(Class<?> clazz) {
        if (clazz.isAnnotationPresent(ModId.class)) {
            String modId = clazz.getAnnotation(ModId.class).value();

            for (Field field : clazz.getFields()) {
                for (Processor<?> processor : PROCESSORS) {
                    if (processor.isAnnotated(field)) {
                        processor.process(modId, field);
                    }
                }
            }
        }
    }
}
