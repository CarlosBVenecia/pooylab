// Conversion de temperaturas usando funciones

import java.util.Scanner;




public class _p66_ConversionTemperaturas {


    public static float Farenheint(float t) {
        float r;
        r = ( t * 9/5 ) + 32;
        return r;
    }


    public static void main(String[] args) {
        float op;
        float temp=0, res=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("[1] Farenheit\n[2] Centigrados\nElige "); op = obj.nextInt();
        switch(op) {
            case 1:
            System.out.print("Convertir a Farenheint\nDame la temperatura "); temp = obj.nextFloat();
            res = Farenheint(temp);
            System.out.printf("La temperatura %.2f en grados celcius equivale a %.2f grados farenheint" ,temp,res);
            break;

            case 2:
            System.out.print("Convertir a Centigrados\nDame la temperatura "); temp = obj.nextFloat();
            res = Celcius(temp);
            System.out.printf("La temperatura %.2f en grados farenheint equivale a %.2f grados celcius" ,temp,res);
            break;

            default : System.out.println("\nOpcion invaluda ...");break;

        }
    } 
    
}
