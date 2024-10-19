package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.stat;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.stat.Stat;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class StatProcessor implements Processor<Stat> {
    @Override
    public <T> void process(String modId, Field field) {
        try {
            Identifier id = (Identifier) field.get(null);
            Registry.register(Registries.CUSTOM_STAT, id, id);
            Stats.CUSTOM.getOrCreateStat(id);
        } catch (Exception ignored) {
        }
    }

    @Override
    public Class<Stat> getAnnotationClass() {
        return Stat.class;
    }
}
