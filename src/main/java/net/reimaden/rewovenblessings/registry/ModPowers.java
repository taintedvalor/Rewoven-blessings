package net.reimaden.rewovenblessings.registry;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import net.reimaden.rewovenblessings.RewovenBlessings;
import net.reimaden.rewovenblessings.RewovenBlessings;
import net.minecraft.util.Identifier;

public class ModPowers {

    public static final PowerType<Power> HUSBANDRY_MASTER = new PowerTypeReference<>(new Identifier(RewovenBlessings.MOD_ID, "husbandry_master"));
    public static final PowerType<Power> STURDY_BEASTS = new PowerTypeReference<>(new Identifier(RewovenBlessings.MOD_ID, "sturdy_beasts"));
    public static final PowerType<Power> SPACETIME_MANIPULATION = new PowerTypeReference<>(new Identifier(RewovenBlessings.MOD_ID, "spacetime_manipulation"));
}
