// App.java
package _p114_Animal;
public class App {
    public static void main(String[] args) {
        Gato migato = new Gato();
        Perro miPerro = new Perro();
        migato.sonido();
        migato.dormir();
        migato.comer();

        miPerro.dormir();
        miPerro.sonido();
        miPerro.comer();
    }
}