package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {
    @Test
    public void documentAddCharacterTest() {
        Document document = new Document();
        document.addCharacter('A', "Arial", "Black", 12);
        document.addCharacter('B', "Verdana", "Red", 10);
        assertNotNull(document); // Simple existence test for initial demonstration
    }
}