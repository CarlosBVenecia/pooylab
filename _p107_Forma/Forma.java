package _p107_Forma;
//Esta clase solo es el prototipo, solo se puede heredar
public abstract class Forma {
    private String Color;

    public Forma(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + "]";
    }
    
}
