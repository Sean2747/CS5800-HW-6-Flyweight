package org.example;
import java.util.*;
public class PropertiesFactory {
    private Map<String, Properties> propertiesMap = new HashMap<>();

    //use getProperties to initialize the properties of a character
    public Properties getProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new Properties(font, color, size));
        }
        return propertiesMap.get(key);
    }
}
