package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar  {
    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void CarroceriaTres() {
      System.out.println("Es de tipo familiar con carroceria de tres partes es un Sedan");
    }

    @Override
    public void ChasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis de monocasco es un Sedan");
        
    }

    @Override
    public void CombustionInterna() {
        System.out.println("Es un automovil de combustion interna es un Sedan");
        
    }

    @Override
    public void SistemaElectrico() {
       System.out.println("Es un automovil con Sistema Electrico es un Sedan");
        
    }

    



}
