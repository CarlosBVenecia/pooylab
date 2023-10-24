package _p114_Animal;

public class Perro implements Animal {

    @Override
    public void dormir() {
      System.out.println("El perro duerme en su casa");
        
    }

    @Override
    public void sonido() {
        System.out.println("El perro hace gua gua..");
    }

    @Override
    public void comer() {
        System.out.println("El perro come croquetas, y si no se come al gato");
    }
    
}
