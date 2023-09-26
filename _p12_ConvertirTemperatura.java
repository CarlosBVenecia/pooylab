import java.util.Scanner;

public class _p12_ConvertirTemeratura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        
        System.out.println("La temperatura en grados Celsius es: " + celsius + " °C");
        
        
    }
}