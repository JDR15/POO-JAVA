package Interfaz;

public class Start {
    public static void main(String[] args) {
        Carisellazo juego1 = new Carisellazo();
        Ppt juego2 = new Ppt();
        
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
        
    }
}
