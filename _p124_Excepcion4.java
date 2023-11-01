import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        
        
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame el numerador   :" ); int a = obj.nextInt();
            System.out.println("Dame el denminador   :" ); int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es " + c);
            
        } catch (InputMismatchException | ArithmeticException e) {
         System.out.println("Ambos valores deben ser numeros y el denominador no piuede ser 0");
         System.out.println("Mensaje del sistema " + e);
        }  finally {
            System.out.println("Hemos terminado ! Si no la regaste felicidades, y si la regaste ponte abusado !");
        }
    }
}
