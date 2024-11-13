package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertiesFactoryTest {
    @Test
    public void propertiesFactoryTest() {
        PropertiesFactory factory = new PropertiesFactory();
        Properties properties1 = factory.getProperties("Arial", "Black", 12);
        Properties properties2 = factory.getProperties("Arial", "Black", 12);
        assertSame(properties1, properties2);
        Properties properties3 = factory.getProperties("Verdana", "Red", 14);
        assertNotSame(properties1, properties3);
    }
}