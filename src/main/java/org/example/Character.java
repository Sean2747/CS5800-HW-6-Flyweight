package org.example;
public class Character {
    private char value;
    public Properties properties;
    public Character(char value) {
        this.value = value;
    }

    public Character(char value, Properties properties) {
        this.properties = properties;
        this.value = value;
    }

    public char getValue(){
        return value;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getCharacterProperties(){
        return properties.getProperties();
    }
}
