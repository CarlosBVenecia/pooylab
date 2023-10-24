package _p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner teclado;
    public JuegoAdivina() {
        teclado = new Scanner(System.in);
    }
    @Override
    public void iniciar() {
       num = 1 + (int) (Math.random() * 100); 
    }
    @Override
    public void jugar() {
        int num;
        do {
            System.out.println("NUmero entre 1 y 100 ? "); num=teclado.nextInt();
            if(this.num<num) System.out.println("El numero a adivinar es menor");
            else if(this.num > num) System.out.println("El numero a adivinar es mayor");
            intentos++;
        } while(this.num != num);
    }
    @Override
    public void finalizar() {
      System.out.println(this. num + "era el numero que debias adivinar y lo adivinaste en " + intentos + "intentos");
    }
    
    
    
}
