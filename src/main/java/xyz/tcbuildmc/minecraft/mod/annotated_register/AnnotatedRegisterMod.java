package xyz.tcbuildmc.minecraft.mod.annotated_register;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.tcbuildmc.minecraft.mod.annotated_register.example.AnnotatedRegisterExample;

public class AnnotatedRegisterMod implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "annotated-register";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			AnnotatedRegister.process(AnnotatedRegisterExample.class);
		}
	}

	@Override
	public void onInitializeClient() {
	}
}
