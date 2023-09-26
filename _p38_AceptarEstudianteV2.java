import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Universidad Kitty Kat SA");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sexo del estudiante (h/m): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese las tres calificaciones del estudiante:");

        double promedio = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            promedio += calificacion;
        }

        promedio /= 3.0;

        boolean esAceptado = (sexo == 'm' || sexo == 'M') && (edad > 21) && (promedio >= 8.0 && promedio <= 9.5);

        if (esAceptado) {
            System.out.println(nombre + " ha sido aceptado en la Universidad Kitty Kat SA. ¡Felicidades!");
        } else {
            System.out.println(nombre + " no cumple con los requisitos de admisión en la Universidad Kitty Kat SA.");
        }

        scanner.close();
    }
}





