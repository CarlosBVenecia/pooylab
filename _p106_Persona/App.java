package _p106_Persona;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos Buendia", "Av Mexico 115");
        Persona p2 = new Persona("Alma Gonzalez", "Primera de los bolos 114");

        Estudiante estudiante = new Estudiante(p1, "Ing. Software", 2023, 500);


        System.out.println(estudiante);
        estudiante.setNombre("Urbano");
        System.out.println("Nombre:      " + estudiante.getNombre());
        System.out.println("Direccion : " + estudiante.getDireccion());
        System.out.println("Carrera : " + estudiante.getCarrera());
        System.out.println("Año : " + estudiante.getAño());
        System.out.println("Colegiatura : " + estudiante.getColegiatura());


        Apoyo apoyo = new Apoyo(p2, "Licenciatura", 1000);
        apoyo.SetPaga(2500);
        System.out.println("Nombre:      " + apoyo.getNombre());
        System.out.println("Direccion : " + apoyo.getDireccion());
        System.out.println("Escolaridad : " + apoyo.getEscolaridad());
        System.out.println("Paga : " + apoyo.getPaga());

        Apoyo apoyo2 = new Apoyo("Sra Tere", "Sierra Madre 22", "Secudaria", 1500);
        Estudiante estudiante2 = new Estudiante("Edgar ", "Calle de abajo 134", "Ing civil", 2024, 2500);

        System.out.println(apoyo2);
        System.out.println(estudiante2);

    }
    
}
