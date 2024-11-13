package org.example;
public class Properties {
    private final String font;
    private final String color;
    private final int size;

    Properties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont() {
        return font;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }

    public String getProperties() {
        return "Font: " + font + ", Color: " + color + ", Size: " + size;
    }
}
