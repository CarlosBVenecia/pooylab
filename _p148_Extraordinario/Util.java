package _p148_Extraordinario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Producto> inicializarDatos() {
        ArrayList<Producto> datos = new ArrayList<>();
        datos.add(new Producto(1, "Leche", "Litro", 10.0f, 20.0f, "Tarjeta"));
        datos.add(new Producto(2, "Arroz", "Kilogramo", 5.0f, 30.0f, "Efectivo"));
        datos.add(new Producto(3, "Huevo", "Kilogramo", 12.0f, 40.0f, "Tarjeta"));
        datos.add(new Producto(4, "Coca-Cola", "Litro", 4.0f, 37.0f, "Efectivo"));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Producto> datos) throws IOException {
        try (FileOutputStream arch = new FileOutputStream(archivo);
             ObjectOutputStream fproductos = new ObjectOutputStream(arch)) {
            fproductos.writeObject(datos);
        }
    }

    public static ArrayList<Producto> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Producto> datos;
        try (FileInputStream arch = new FileInputStream(archivo);
             ObjectInputStream fproductos = new ObjectInputStream(arch)) {
            datos = (ArrayList<Producto>) fproductos.readObject();
        }
        return datos;
    }
}
