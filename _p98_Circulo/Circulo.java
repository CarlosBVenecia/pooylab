package _p98_Circulo;

public class Circulo {
    private double radio;

    // Constructor sin argumentos
    public Circulo() {
        this.radio = 0.0;
    }

    // Constructor con argumento
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos de acceso para el radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double getArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular la circunferencia del círculo
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Método toString para representar el objeto en forma de cadena
    @Override
    public String toString() {
        return "Circulo [Radio=" + radio + "]";
    }
}
