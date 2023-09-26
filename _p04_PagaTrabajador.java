

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) [
        String nombre;
        Int horas;
        Scanner obj = now Scanner(System.in);

        System.out.print("Nombre        :"); nombre = obj.nextLine();
        System.out.print("Horas trabajadas        :"); horas = obj.nextInt();
        System.out.print("Pago por hora        :"); paga = obj.nextFloat();
        tasa = 0.3f;

        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("Resumen de paga\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuesto de %2.f" ,nombre, horas, paga, tasa));
        


    ]
    
}
