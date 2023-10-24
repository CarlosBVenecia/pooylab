package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        // Crear varios vehículos de diferentes tipos
        Compacto compacto1 = new Compacto(4, 4, "C123", "Toyota", 2022, 20000.0);
        Compacto compacto2 = new Compacto(5, 4, "C456", "Honda", 2023, 22000.0);
        Camioneta camioneta1 = new Camioneta(1000.0, 2, "T789", "Ford", 2021, 30000.0);
        Camioneta camioneta2 = new Camioneta(1500.0, 4, "H987", "Chevrolet", 2022, 35000.0);

        // Almacenar los vehículos en un arreglo
        Vehiculo[] vehiculos = {compacto1, compacto2, camioneta1, camioneta2};

        // Mostrar los datos de los vehículos
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
    

