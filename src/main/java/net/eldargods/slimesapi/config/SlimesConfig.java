package net.eldargods.slimesapi.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * This annotation is used to mark fields in the config class that should be
 * registered as the instance.
 * 
 * @see SlimesConfigAPI
 * 
 * @since 1.0.0
 * @author EldarGods
 */
public @interface SlimesConfig {}