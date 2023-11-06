import java.io.File;

public class _p132_Archivos1 {
    public static void main(String[] args) {
        File arch = new File("datos.txt");


        System.out.println("Nombre archivo : " + arch.getName());
        System.out.println("Es directorio :" + arch.isDirectory());
        System.out.println("Ruta relativa : " + arch.getPath());
        System.out.println("Ruta absoluta :" + arch.getAbsolutePath());
        if(arch.exists()) {
            System.out.println("El archivo " + arch.getName() + " si existe");
            System.out.println("Se puede leer ?     : " + arch.canRead());
            System.out.println("Se puede escribir? : " + arch.canWrite());
            System.out.println("Tamaño del archivo : " + arch.length() + "bytes");
            System.out.println("Ultima modificacion : " + arch.lastModified());
        } else
            System.out.println("El archivo " + arch.getName() + " no existe");

    }
}
