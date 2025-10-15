package net.eldargods.slimesapi;

import net.eldargods.slimesapi.api.config.v1.SlimesConfigAPI;
import net.eldargods.slimesapi.config.Comment;
import net.eldargods.slimesapi.config.SlimesConfig;
import net.eldargods.slimesapi.config.NestedConfig;

import java.util.List;

/**
 * This is an example config class. Must be initialized using {@link SlimesConfigAPI#registerConfig(Class)}.
 * 
 * @apiNote     The instance of this class needs the {@link SlimesConfig} annotation.
 * @apiNote     All fields from this class will be registered as config entries.
 * 
 * @see         SlimesConfigAPI
 * @platform    Both
 * 
 * @since       1.0.0
 * @author      EldarGods
 */
public class SlimesAPIConfig {
    /**
     * The instance of this config class.
     * 
     * Must be implemented with the annotation or the config will not load properly.
     * Must be static, holds the values read from the file.
     */
    @SlimesConfig
    public static SlimesAPIConfig INSTANCE;

    /**
     * SlimesConfig will call the getFile() method to get the path of the config as string.
     * 
     * @apiNote Must not have any parameters and must return a path as String, see {@link SlimesConfigAPI#getFile(String) SlimesConfigAPI#getFile}.
     * 
     * @return  String : The instance of this class.
     */
    public static String getFile() {
        return SlimesConfigAPI.getFile("slimesapi.json5");
    }

    /**
     * The entries.
     * 
     * All fields from this class will be registered as config entries, they must be public, non-static and serializable.
     * The values defined in each field will represent the default config values in the file generated.
     * 
    **/


    /**
     * Adds a comment above a field. Requires getFile() to return a json5 file for readability purposes.
     * The file will still get parsed the same way no matter the extension, but most text editors / IDEs won't support comments with json, so use json5 or jsonc.
     * 
     * You can repeat this annotation to add multiple comments to a field.
     *
     * @since 1.0.0
     * @author EldarGods
     */
    @Comment("This is used to debug stuff")
    public boolean debug = false;

    @Comment("A test boolean")
    public boolean test = false;

    @Comment("A list!")
    @Comment("Supports multiple values using List.of()")
    public List<String> list = List.of("test", "test2");
    
    /**
     * Defines a nested config on a dynamic class initializer.
     * The default values of the config are defined in the class that's being initialized.
     * 
     * Access it through the INSTANCE of the config (@SlimesConfig).
     * 
     * @since 1.0.0
     * @author EldarGods
     */
    @NestedConfig
    public ExampleColorConfig exampleColors = new ExampleColorConfig();

    public static class ExampleColorConfig {
        public int red = 255;
        public int green = 255;
        public int blue = 255;
    }
}



