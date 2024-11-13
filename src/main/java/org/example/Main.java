package org.example;
public class Main {
    public static void main(String[] args) {
        File testFile = new File();
        Document test = new Document();
        test.addCharacter('H', "Arial", "Blue", 12);
        test.addCharacter('e', "Arial", "Black", 10);
        test.addCharacter('l', "Arial", "Black", 10);
        test.addCharacter('l', "Arial", "Black", 10);
        test.addCharacter('o', "Arial", "Black", 10);
        test.addCharacter('W', "Arial", "Red", 12);
        test.addCharacter('o', "Arial", "Red", 10);
        test.addCharacter('r', "Arial", "Red", 10);
        test.addCharacter('l', "Arial", "Red", 10);
        test.addCharacter('d', "Arial", "Red", 10);
        test.addCharacter('C', "Calibri", "Black", 12);
        test.addCharacter('S', "Calibri", "Black", 12);
        test.addCharacter('5', "Calibri", "Black", 12);
        test.addCharacter('8', "Calibri", "Black", 12);
        test.addCharacter('0', "Calibri", "Black", 12);
        test.addCharacter('0', "Calibri", "Black", 12);

        testFile.saveToFile(test);
        System.out.println("\nDocument saved to file");
        testFile.doc.display();


        test.editProperties(10, "Verdana", "Blue", 16);
        test.editProperties(11, "Verdana", "Blue", 16);
        test.editProperties(12, "Verdana", "Blue", 16);
        test.editProperties(13, "Verdana", "Blue", 16);
        test.editProperties(14, "Verdana", "Blue", 16);
        test.editProperties(15, "Verdana", "Blue", 16);

        testFile.saveToFile(test);
        System.out.println("\nDocument saved to file.");
        System.out.println("After changing \"CS5800\" to verdana font, color blue and size 16: ");
        testFile.doc.display();


        test.editProperties(0, "Verdana", "Blue", 16);
        test.editProperties(1, "Verdana", "Blue", 16);
        test.editProperties(2, "Verdana", "Blue", 16);
        test.editProperties(3, "Verdana", "Blue", 16);
        test.editProperties(4, "Verdana", "Blue", 16);

        test = testFile.loadFromFile();
        System.out.println("\nDocument loaded from file.");
        test.display();
        System.out.println("\nRecent changes weren't saved, so the previous version was restored.");
    }
}