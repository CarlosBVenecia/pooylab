package _p120_Vehiculo;

public class app {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Sedan misedan = new Sedan("LancerEvo");
        System.out.println("Maquina" + "Nombre =" + misedan.getNombre() + "Pasajeros =" + misedan.getPasajeros() + "Propietario =" + misedan.getPropietario());
        misedan.CarroceriaTres();
        misedan.ChasisMonocasco();
        misedan.SistemaElectrico();
        misedan.CombustionInterna();
        misedan.repostar();
        misedan.arancar();
        misedan.frenar();
        System.out.println();

        Suv misuv = new Suv("TrailBlaser");
        System.out.println("Maquina" + "Nombre =" + misedan.getNombre() + "Pasajeros =" + misedan.getPasajeros() + "Propietario =" + misedan.getPropietario());
        misuv.ChasisIndependiente();
        misuv.CombustionInterna();
        misuv.SistemaElectrico();
        misuv.Traccion4x4();
        misuv.repostar();
        misuv.arancar();
        misuv.frenar();
        System.out.println();


    }
}
