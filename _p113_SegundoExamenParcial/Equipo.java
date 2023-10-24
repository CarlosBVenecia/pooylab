package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(String nombre, String liga, ArrayList<Jugador> jugadores) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Reporte del equipo: " + Nombre);
        System.out.println("Liga: " + Liga);
        System.out.println("Total de jugadores: " + Jugadores.size());
        System.out.println("Total de hombres: " + getTotalH());
        System.out.println("Total de mujeres: " + getTotalM());
        System.out.println("Total de bono del equipo: " + getTotalBono());
        System.out.println("Total de totales del equipo: " + getTotal());
        System.out.println("Jugadores:");
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + "]";
    }
}