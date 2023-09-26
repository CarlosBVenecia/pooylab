import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamaños de pizza disponibles:");
        System.out.println("1. Chica - $5");
        System.out.println("2. Mediana - $10");
        System.out.println("3. Grande - $20");
        System.out.print("Elija el tamaño de la pizza (1/2/3): ");
        int tamaño = scanner.nextInt();

        double precio;
        switch (tamaño) {
            case 1:
                precio = 5.0;
                break;
            case 2:
                precio = 10.0;
                break;
            case 3:
                precio = 20.0;
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                return;
        }

        System.out.print("Ingrese la cantidad de pizzas que desea comprar: ");
        int cantidad = scanner.nextInt();

        double totalCompra = precio * cantidad;
        double descuento = 0.0;
        double totalCompraConDescuento = totalCompra;

        if (totalCompra > 2000) {
            descuento = 0.15 * totalCompra;
            totalCompraConDescuento = totalCompra - descuento;
        }

        System.out.println("Resumen de la compra:");
        System.out.println("Tamaño de la pizza: " + (tamaño == 1 ? "Chica" : (tamaño == 2 ? "Mediana" : "Grande")));
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total de la compra con descuento: $" + totalCompraConDescuento);

        scanner.close();
    }
}