package net.reimaden.rewovenblessings.registry;

import net.reimaden.rewovenblessings.RewovenBlessings;
import net.reimaden.rewovenblessings.RewovenBlessings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    @SuppressWarnings("unused")
    public static final SoundEvent BLESSING_MIRACLE_TRIGGER = registerSound("blessing.miracle.trigger");

    private static SoundEvent registerSound(@SuppressWarnings("SameParameterValue") String name) {
        Identifier id = new Identifier(RewovenBlessings.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register() {
        RewovenBlessings.LOGGER.debug("Registering sounds for " + RewovenBlessings.MOD_ID);
    }
}
