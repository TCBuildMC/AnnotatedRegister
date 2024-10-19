package xyz.tcbuildmc.minecraft.mod.annotated_register.processor.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import xyz.tcbuildmc.minecraft.mod.annotated_register.processor.Processor;

import java.lang.annotation.Annotation;

/**
 * Client-side only {@link Processor}
 * @param <A> The annotation the processor will work with.
 */
@Environment(EnvType.CLIENT)
public interface ClientProcessor<A extends Annotation> extends Processor<A> {
}
