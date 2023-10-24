package _p108_Vehiculo;

public class Camioneta extends Vehiculo {
    private double capacidad;
    private int ejes;

    public Camioneta() {
        super();
        this.capacidad = 0.0;
        this.ejes = 0;
    }

    public Camioneta(double capacidad, int ejes, String serie, String marca, int año, double precio) {
        super(serie, marca, año, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de Carga: " + capacidad + " kg, Ejes: " + ejes;
    }
}
    

