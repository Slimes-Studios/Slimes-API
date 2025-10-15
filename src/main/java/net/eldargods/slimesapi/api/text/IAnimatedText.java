package net.eldargods.slimesapi.api.text;

import net.minecraft.world.item.ItemStack;

/**
 * @deprecated Use {@link net.eldargods.slimesapi.api.text.IGradientName} instead.
 */
@Deprecated
public interface IAnimatedText {
    AnimatedText getAnimatedName(ItemStack stack);
}
