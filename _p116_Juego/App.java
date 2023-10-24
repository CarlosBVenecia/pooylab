package _p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados misdados = new JuegoDados();

        misdados.iniciar();
        misdados.jugar();
        misdados.finalizar();


        JuegoAdivina miadivina = new JuegoAdivina();
        miadivina.iniciar();
        miadivina.jugar();
        miadivina.finalizar();
    }
}
