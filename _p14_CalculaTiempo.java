import java.util.Scanner;

public class _p14_CalculaTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();
        
        // Calcular los equivalentes en días, minutos y segundos
        int dias = horas / 24;
        int minutos = (horas % 24) * 60;
        int segundos = ((horas % 24) * 60) * 60;
        
        System.out.println(horas + " horas equivalen a:");
        System.out.println(dias + " días");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
        
        scanner.close();
    }
}
