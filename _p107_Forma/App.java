package _p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Forma f1 = new Forma("Azul");  // No puedo crear instancias de una clase
        
        Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);
        System.out.println("Area circulo : " + circulo.getArea());

        Triangulo triangulo = new Triangulo("Verde", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area Triangulo : " + triangulo.getArea());


        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Rosa", 33.45));

        System.out.println("n\nTodas las formas");
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.println("El area del " + (forma instanceof Circulo?"Circulo":"Triangulo: "));
            System.out.println(forma.getArea());
            
        }

    }
    
}
