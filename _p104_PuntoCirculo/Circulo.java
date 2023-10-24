package _p104_PuntoCirculo;

class Circulo {
    private Punto Centro;
    private double Radio;

    public Circulo() {
        this.Centro = new Punto();
        this.Radio = 0;
    }

    public Circulo(double radio) {
        this.Centro = new Punto();
        this.Radio = radio;
    }

    public Circulo(Punto centro, double radio) {
        this.Centro = centro;
        this.Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        this.Centro = centro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    public double getArea() {
        return Math.PI * Radio * Radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Círculo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
}
