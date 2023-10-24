package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean Relleno;
    
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isRelleno() {
        return Relleno;
    }
    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
    

}
