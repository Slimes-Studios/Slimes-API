package net.eldargods.slimesapi.api.json;

import java.nio.file.Path;

import net.eldargods.slimesapi.util.FileUtils;

public class JsonFileAPI {
    /**
     * Reads the JSON file, parses it then writes a pretty-printed version of it back to the file.
     * 
     * @param path
     * @since 1.0.0
     * 
     * @author EldarGods
     */
    public static void setPrettyPrint(Path path) {
        FileUtils.setPrettyPrint(path);
    }
}
