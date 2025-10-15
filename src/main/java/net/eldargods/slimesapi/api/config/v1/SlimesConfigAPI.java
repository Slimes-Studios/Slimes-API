package net.eldargods.slimesapi.api.config.v1;

import net.eldargods.slimesapi.SlimesAPIConfig;
import net.eldargods.slimesapi.config.ConfigBuilder;
//? if fabric {
import net.fabricmc.loader.api.FabricLoader;
//?} elif forge {

/*import net.minecraftforge.fml.loading.FMLPaths;
 
*///?} elif neoforge {

/*import net.neoforged.fml.loading.FMLPaths;
 
*///?}

/**
 * SlimesAPI's Config. A simple way of doing JSON configs that supports both Forge and Fabric.
 * @author EldarGods
 * 
 * @apiNote Create your own config class, see example: {@link SlimesAPIConfig SlimesAPIConfig}.
 * @apiNote To initialize your config use {@link SlimesConfigAPI#registerConfig(Class) SlimesConfigAPI#registerConfig}
 * 
 * @since 1.0.0
 */
public class SlimesConfigAPI {
    /** 
     *  Registers a config class to be initialized.
     * 
     * @see {@link SlimesAPIConfig Example Config Class}
     * 
     * @param <T>           Generic config class with a [String]getFile() method.
     * @param configClass   The config class to initialize its contents.
     * 
     * @platform    Both
     * 
     * @since 1.0.0
     * @author EldarGods
     */
    public static <T> void registerConfig(Class<T> configClass) {
        ConfigBuilder.initializeConfigs(configClass);
    }

    /**
     * Gets the file path for the config file.
     * 
     * @platform        Both
     * 
     * @param file      The file name including extension. (Ex. "slimesapi.json")
     * @return          String : The file path for the config file to be returned in your config class getFile method.
     * 
     * @since 1.0.0
     * @author EldarGods
     */
    public static String getFile(String file) {
        //? if fabric {
        return FabricLoader.getInstance().getConfigDir().resolve(file).toString();
        //?} else {

        /*return FMLPaths.GAMEDIR.get().toAbsolutePath().resolve("config").resolve(file).toString();
        
 *///?}
    }
}
