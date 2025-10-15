package net.eldargods.slimesapi.config;

import java.lang.annotation.*;

/**
 * Defines a nested config on a dynamic class initializer.
 * The default values of the config are defined in the class that's being initialized. 
 * 
 * @since 1.0.0
 * @author EldarGods
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NestedConfig {
}
