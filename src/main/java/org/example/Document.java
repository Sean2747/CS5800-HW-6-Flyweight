package org.example;
import java.util.*;
public class Document {
    private List<Character> characters = new ArrayList<>();
    private PropertiesFactory factory = new PropertiesFactory();
    public Document() {}

    public void addCharacter(char value, String font, String color, int size) {
        Properties properties = factory.getProperties(font, color, size);
        characters.add(new Character(value, properties));
    }

    public void editProperties(int index, String font, String color, int size) {
        if (index >= 0 && index < characters.size()) {
            Properties newProperties = factory.getProperties(font, color, size);
            characters.get(index).setProperties(newProperties);
        } else {
            System.out.println("Error: invalid character index!");
        }
    }

    public void display() {
        for (Character character : characters) {
            System.out.println(character.getValue() + " " + character.getCharacterProperties());
        }
    }

    public Document cloneDocument() {
        Document clone = new Document();
        for (Character character : this.characters) {
            clone.addCharacter(character.getValue(),
                    character.properties.getFont(),
                    character.properties.getColor(),
                    character.properties.getSize());
        }
        return clone;
    }
}
