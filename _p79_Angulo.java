

import java.util.Scanner;

public class _p79_Angulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un ángulo entre 0 y 360 grados: ");
        int angulo = scanner.nextInt();
        
        if (angulo >= 0 && angulo <= 360) {
            String tipo = obtenerTipoAngulo(angulo);
            System.out.println("El ángulo es " + tipo);
        } else {
            System.out.println("Ángulo no válido. Debe estar entre 0 y 360 grados.");
        }
        
        scanner.close();
    }

    public static String obtenerTipoAngulo(int angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else {
            return "cóncavo";
        }
    }
}





