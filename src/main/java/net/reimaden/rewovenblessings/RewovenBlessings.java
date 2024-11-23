package net.reimaden.rewovenblessings;

import net.fabricmc.api.ModInitializer;
import net.reimaden.rewovenblessings.registry.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RewovenBlessings implements ModInitializer {

	public static final String MOD_ID = "rewovenblessings";
	public static final String MOD_NAME = "Origin Blessings: Rewoven";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Blessing your origins.");

		ModSounds.register();
	}
}
