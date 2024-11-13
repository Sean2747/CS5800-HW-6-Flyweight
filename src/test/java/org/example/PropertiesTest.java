package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertiesTest {
    @Test
    public void propertiesCreationTest() {
        Properties properties = new Properties("Arial", "Black", 12);
        assertEquals("Arial", properties.getFont());
        assertEquals("Black", properties.getColor());
        assertEquals(12, properties.getSize());
    }

    @Test
    public void propertiesGetPropertiesTest() {
        Properties properties = new Properties("Times New Roman", "Blue", 10);
        assertEquals("Font: Times New Roman, Color: Blue, Size: 10", properties.getProperties());
    }
}