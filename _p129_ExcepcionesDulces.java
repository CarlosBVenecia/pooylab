import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionesDulces {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNinos = 0;
        int numDulces = 0;

        while (true) {
            try {
                System.out.print("Numero de niños en el barrio: ");
                numNinos = scanner.nextInt();

                System.out.print("Cantidad de dulces existente: ");
                numDulces = scanner.nextInt();

                if (numDulces == 0) {
                    throw new ArithmeticException("Si no hay dulces, no puedo repartir dulces");
                }

                break; 
            } catch (InputMismatchException e) {
                System.out.println("Los niños y los dulces deben ser cantidades numéricas");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); 
            }
        }

        int dulcesPorNino = numDulces / numNinos;
        System.out.printf("A cada niño le tocan %d dulces.%n", dulcesPorNino);
    }
}
