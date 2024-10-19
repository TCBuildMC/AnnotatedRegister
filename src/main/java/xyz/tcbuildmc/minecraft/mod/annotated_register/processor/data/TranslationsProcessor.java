package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.data;

import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.data.Translation;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.data.Translations;

import java.lang.reflect.Field;

public class TranslationsProcessor implements DataGenerationProcessor<Translations> {
    @Override
    public <T> void process(String modId, Field field) {
        Translations translations = this.getAnnotation(field);
        for (Translation tr : translations.value()) {

        }
    }

    @Override
    public Class<Translations> getAnnotationClass() {
        return Translations.class;
    }
}
