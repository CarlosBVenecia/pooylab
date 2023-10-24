import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int cantidadParticipantes;

        System.out.print("Ingrese la cantidad de participantes: ");
        cantidadParticipantes = obj.nextInt();

        obj.nextLine(); // Limpia el buffer

        // Definicion de variables
        double costoTotal = 0.0;
        double TotalDineroAlumnos = 0.0;
        double TotalDineroDocentes = 0.0;
        double TotalDineroTrabajadores = 0.0;
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdades = 0;

        // Informacion de los participantes
        for (int i = 1; i <= cantidadParticipantes; i++) {
            System.out.println("Ingrese los datos del participante #" + i);

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Edad: ");
            int edad = obj.nextInt();

            obj.nextLine(); // Limpia el buffer

            System.out.print("Sexo (H/M): ");
            String sexo = obj.nextLine();

            System.out.print("Tipo de Participante (Alumno, Docente, Trabajador): ");
            String tipoParticipante = obj.nextLine();

            if (edad >= 18) {
                double costoInscripcion = 0.0;
                // Ciclo para determinar tipo de alumno
                switch (tipoParticipante.toLowerCase()) {
                    case "alumno":
                        costoInscripcion = 50.0;
                        totalAlumnos++;
                        TotalDineroAlumnos += costoInscripcion;
                        break;
                    case "docente":
                        costoInscripcion = 80.0;
                        totalDocentes++;
                        TotalDineroDocentes += costoInscripcion;
                        break;
                    case "trabajador":
                        costoInscripcion = 60.0;
                        totalTrabajadores++;
                        TotalDineroTrabajadores += costoInscripcion;
                        break;
                    default:
                        System.out.println("Tipo de participante no válido.");
                }
                costoTotal += costoInscripcion;
                System.out.println("Costo de inscripción: $" + costoInscripcion);
            } else {
                System.out.println("Lo siento, los menores de edad no pueden inscribirse.");
            }
            //Compara dos strings sin importar si son minusculas o mayusculas
            if (sexo.equalsIgnoreCase("H")) {
                totalHombres++;
            } else if (sexo.equalsIgnoreCase("M")) {
                totalMujeres++;
            }

            sumaEdades += edad;
        }

        int totalParticipantes = totalAlumnos + totalDocentes + totalTrabajadores;
        double promedioEdad = (double) sumaEdades / totalParticipantes;

        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de dinero recaudado por alumnos: $" + TotalDineroAlumnos);
        System.out.println("Total de dinero recaudado por docentes: $" + TotalDineroDocentes);
        System.out.println("Total de dinero recaudado por trabajadores: $" + TotalDineroTrabajadores);
        System.out.println("Total de Hombres : " + totalHombres);
        System.out.println("Total de Mujeres : " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        System.out.println("Costo total de inscripciones: $" + costoTotal);
    }
}