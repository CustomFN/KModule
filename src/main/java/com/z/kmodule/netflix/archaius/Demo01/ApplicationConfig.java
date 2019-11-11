package com.z.kmodule.netflix.archaius.Demo01;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

public class ApplicationConfig {

    static {
        System.setProperty("archaius.configurationSource.defaultFileName", "config.properties");
    }

    public String getStringProperty(String key, String defaultValue) {
        final DynamicStringProperty stringProperty = DynamicPropertyFactory.getInstance().getStringProperty(key, defaultValue);
        return stringProperty.get();
    }
}
