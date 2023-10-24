package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial : " + cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo deposito : " + cuenta1.getSaldo());
        double cretiro = 1500;
        boolean retiro = cuenta1.retira(cretiro);
        if(retiro) System.out.println("Retiro de" + cretiro + " exitoso, ya puedes ir a pistear");
        else System.out.println("Lastima margarito, que otro te invite");


        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Margarito Perez", cuenta1);
        System.out.println("Cliente 1 : " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);
        cliente2.getCuenta().deposita(8500);
        System.out.println("Cliente 2 : despues del deposito de 8500 : " + cliente2);
        if(cliente2.getCuenta().retira(2000))
            System.out.println("El retiro de 2000 fue exitoso, te queda + cliente2.getCuenta().getSaldo()");
        else System.out.println("No money man :(");

        System.out.println("\nProbando clase banco");
        Banco mibanco = new Banco("Bnaco Patito SA de CV", "Calle las Escondida S/N");
        mibanco.agregarClientes(cliente1);
        mibanco.agregarClientes(cliente2);
        mibanco.agregarClientes(new Cliente("Felipe Correo", new CuentaBancaria(2000)));
        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().deposita(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);
        double totalbanco = 0;
        for (Cliente cliente : mibanco.getClientes()) {
            System.out.println(cliente);
            totalbanco = totalbanco + cliente.getCuenta().getSaldo();
        }
        System.out.println("Total de dinero en el banco : " + totalbanco);

    }
}
