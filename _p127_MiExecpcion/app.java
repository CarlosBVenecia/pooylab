package _p127_MiExecpcion;

public class app {
    
    public static int sumar(int a, int b) throws FueraDeRango {
        if(a>=100 | b>=100)
            throw new FueraDeRango("Los numeros estan fuera de rango");
        return a + b;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("La suma es " + sumar(10,20));
            System.out.println("La suma es " + sumar(100,20));
        } catch(FueraDeRango e) {
            System.out.println(e);
        }
    }
}
