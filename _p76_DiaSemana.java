import java.util.Scanner;

public class _p76_DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar un número entre 1 y 7 al usuario
        int numero;
        do {
            System.out.print("Ingrese un número entre 1 y 7: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 7);
        
        // Llamar a la función para obtener el día de la semana en letra
        String dia = obtenerDiaSemana(numero);
        
        // Mostrar el resultado
        System.out.println("El día correspondiente es: " + dia);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Función para obtener el día de la semana en letra
    public static String obtenerDiaSemana(int numero) {
        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        
        // Restar 1 al número para obtener el índice correcto en el array
        return dias[numero - 1];
    }
}