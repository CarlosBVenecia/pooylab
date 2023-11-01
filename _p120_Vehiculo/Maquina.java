package _p120_Vehiculo;

public class Maquina {
    public String Nombre;
    public String Propietario;
    public int Pasajeros;
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getPropietario() {
        return Propietario;
    }
    public int getPasajeros() {
        return Pasajeros;
    }
    
    public void repostar() {
        System.out.println("Repostando...");
    }

    public void arancar() {
        System.out.println("Arrancando...");
    }

    public void frenar() { 
        System.out.println("Frenando...");
    }

}
