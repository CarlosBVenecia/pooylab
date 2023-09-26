import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 6 para obtener el nombre del continente: ");
        int numero = scanner.nextInt();

        String continente;

        switch (numero) {
            case 1:
                continente = "Asia";
                break;
            case 2:
                continente = "África";
                break;
            case 3:
                continente = "América del Norte";
                break;
            case 4:
                continente = "América del Sur";
                break;
            case 5:
                continente = "Antártida";
                break;
            case 6:
                continente = "Europa";
                break;
            default:
                continente = "Error: El número no está en el rango especificado";
                break;
        }

        System.out.println("El continente correspondiente al número " + numero + " es: " + continente);

        scanner.close();
    }
}