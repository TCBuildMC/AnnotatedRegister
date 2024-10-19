package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.annotation.Annotation;

@Environment(EnvType.CLIENT)
public interface ClientProcessor<A extends Annotation> extends Processor<A> {
}
