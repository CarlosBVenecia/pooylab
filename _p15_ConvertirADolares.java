import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en pesos Mexicanos: ");
        double pesos = scanner.nextDouble();
        
        
        double cotizacionDolar = 17.21;
        
        // Calcular el equivalente en dólares
        double dolares = pesos / cotizacionDolar;
        
        System.out.println("El equivalente en dólares es: $" + dolares);
        
        scanner.close();
    }
}