import java.util.Scanner;

public class _p122_Exepcion2 {
    public static void main(String[] args) {
        
        try {
            System.out.println("Dame un numero  : ");
            int num = new Scanner(System.in).nextInt();
            num = num +  5;
            System.out.println("El nuevo valor es " + num);
            
        } catch (Exception e) {
           System.out.println("Debes intruducir un valor numerico");
        }
        

    }
    
}
