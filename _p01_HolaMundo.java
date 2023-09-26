// Envia un saludo a la pantalla



public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Alberto";
        String hermano = "Jorge";
        String mensaje = String.format("Tanto %s como %s desean aprender a programar en Java", amigo, hermano);

        System.out.println("Hola mundo en el lenguaje java");
        System.out.println("\nHola amigo " + amigo + "bienvenido a java" );
        System.out.println("\nMi amigo es " + amigo + "Y mi hermano es " + hermano + "\n");
        System.out.println(mensaje);
    }
    
}
