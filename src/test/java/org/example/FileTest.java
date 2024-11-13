package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    @Test
    public void fileSaveAndLoadTest() {
        Document document = new Document();
        document.addCharacter('H', "Arial", "Black", 12);
        File file = new File();
        file.saveToFile(document);
        document.editProperties(0, "Verdana", "Red", 14);
        Document loadedDocument = file.loadFromFile();
        assertNotNull(loadedDocument);
    }
}