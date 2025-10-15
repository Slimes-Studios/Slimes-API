package net.eldargods.slimesapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.eldargods.slimesapi.api.SlimesUtilsAPI;
import net.eldargods.slimesapi.api.config.v1.SlimesConfigAPI;

//? if forge {


/*import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;


*///?} elif neoforge {


/*import net.neoforged.fml.common.Mod;


*///?}


//? if (forge || neoforge) {

/*@Mod(CommonInitializer.MODID)
public class CommonInitializer {

*///?} elif fabric {
import net.fabricmc.api.ModInitializer;

public class CommonInitializer implements ModInitializer {
//?}

    public static final String MODID = "slimesapi";
    public static final Logger LOGGER = LoggerFactory.getLogger("slimesapi");
    public static final String VERSION = "1.0.0";

    public static final boolean ENABLE_EXAMPLES = false;

    //? if fabric {
    @Override
    public void onInitialize() {
        LOGGER.info("SlimesAPI Initialized");
        init();
    }
    //?}

    //? if forge || neoforge {
    /*public CommonInitializer() {
        LOGGER.info("SlimesAPI Initialized");
        init();
    }
    *///?}

    /**
     * An example on how to register your custom config class.
     * Platform doesn't matter as that logic is handled by the API.
     * 
     * This should be called in your mod's constructor.
     * 
     * @platform Both
     * 
     * @since 1.0.0
     * @author EldarGods
     */
    public static void init() {
        SlimesConfigAPI.registerConfig(SlimesAPIConfig.class);
        
        if (SlimesUtilsAPI.isModLoaded("embeddium")) {
            String yes = "quick! a brick is about to smash through your window";

            LOGGER.info(yes);

            if (SlimesUtilsAPI.isModLoaded("quark")) {
                LOGGER.info(yes);
            }
        }
    }
}