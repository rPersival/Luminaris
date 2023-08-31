package com.rpersival.mixin.client;

import net.minecraft.client.gui.screen.SplashTextRenderer;
import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class SplashTextResourceSupplierMixin {
    @Inject(at = @At("RETURN"), method = "get", cancellable = true)
    public void getSplashTextLoader(CallbackInfoReturnable<SplashTextRenderer> cir) {
        cir.setReturnValue(new SplashTextRenderer("Hello Luminarium!"));
    }
}
