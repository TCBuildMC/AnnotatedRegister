package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.vanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item.Group;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.reflect.Field;

public class GroupProcessor implements Processor<Group> {
    @Override
    public <T> void process(String modId, Field field) {
        Group group = this.getAnnotation(field);

        for (RegistryKey<ItemGroup> key : Registries.ITEM_GROUP.getKeys()) {
            if (key.getValue().getPath().equals(group.value())) {
                ItemGroupEvents.modifyEntriesEvent(key).register(entries -> {
                    try {
                        entries.add((ItemConvertible) field.get(null));
                    } catch (Exception ignored) {
                    }
                });
                break;
            }
        }
    }

    @Override
    public Class<Group> getAnnotationClass() {
        return Group.class;
    }
}
