package net.reimaden.rewovenblessings.mixin;

import net.reimaden.rewovenblessings.registry.ModPowers;
import net.reimaden.rewovenblessings.util.EntityUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TameableEntity.class)
public abstract class TameableEntityMixin extends AnimalEntity {

    protected TameableEntityMixin(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "setOwner", at = @At("HEAD"))
    private void rewovenblessings$applyBeastSpiritBonus(PlayerEntity player, CallbackInfo ci) {
        if (ModPowers.STURDY_BEASTS.isActive(player)) {
            EntityUtil.addBeastSpiritAttributes(this);
        }
    }
}
