package lesson11.practice.task2;

import java.util.Locale;

public class Plant {
    private final Type type;
    private final Color color;
    private final int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        this.type = typeParsEnum(type);
        this.color = colorParseEnum(color);
        this.size = size;
    }

    private Color colorParseEnum(String color) throws ColorException {
        return switch (color.toLowerCase(Locale.ROOT)) {
            case "red" -> Color.Red;
            case "white" -> Color.White;
            case "blue" -> Color.Blue;
            default -> throw new ColorException("Incorrect color");
        };
    }

    private Type typeParsEnum(String type) throws TypeException {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "flower" -> Type.Flower;
            case "tree" -> Type.Tree;
            case "grass" -> Type.Grass;
            default -> throw new TypeException("Incorrect type");
        };
    }

    @Override
    public String toString() {
        return String.format("Perfect %s %s %s here", size, color, type);
    }
}
