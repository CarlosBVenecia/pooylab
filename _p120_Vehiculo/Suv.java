package _p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void ChasisIndependiente() {
        System.out.println("Es un automovil con chasis independiente es una suv");
        
    }

    @Override
    public void Traccion4x4() {
      System.out.println("Es un automovil con traccion 4x4 es una suv");
        
    }

    @Override
    public void CombustionInterna() {
       System.out.println("Es un automovil con combustion interna es una suv");
        
    }

    @Override
    public void SistemaElectrico() {
       System.out.println("Es un automovil con sistema electrico es una suv");
        
    }

    
}
