package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    public void characterWithOnlyValueTest() {
        Character character = new Character('A');
        assertEquals('A', character.getValue());
    }

    @Test
    public void characterWithValueAndPropertiesTest() {
        Properties properties = new Properties("Arial", "Black", 12);
        Character character = new Character('B', properties);
        assertEquals('B', character.getValue());
        assertEquals("Font: Arial, Color: Black, Size: 12", character.getCharacterProperties());
    }

    @Test
    public void setPropertiesTest() {
        Character character = new Character('C');
        Properties initialProperties = new Properties("Times New Roman", "Blue", 10);
        character.setProperties(initialProperties);
        Properties newProperties = new Properties("Verdana", "Red", 14);
        character.setProperties(newProperties);
        assertEquals("Font: Verdana, Color: Red, Size: 14", character.getCharacterProperties());
    }
}