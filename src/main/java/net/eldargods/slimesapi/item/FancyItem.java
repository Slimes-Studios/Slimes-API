package net.eldargods.slimesapi.item;

//? if fabric {
import net.eldargods.slimesapi.api.text.AnimatedText;
import net.eldargods.slimesapi.api.text.IAnimatedText;
import net.minecraft.world.item.ItemStack;
//?}
import net.minecraft.world.item.Item;

//? if fabric {
@SuppressWarnings("deprecation")
//?}
public class FancyItem extends Item 

//? if fabric {
    implements IAnimatedText
//?}

{
    //? if fabric {
    public AnimatedText nameAnimation;
    //?}

    public FancyItem(Properties settings 
    //? if fabric {
    , AnimatedText animatedTextType
    //?}
    ) {
        super(settings);
        //? if fabric {
        this.nameAnimation = animatedTextType;
        //?}
    }

    //? if fabric {
    @Override
    public AnimatedText getAnimatedName(ItemStack stack) {
       return this.nameAnimation;
    }
    //?}
}
