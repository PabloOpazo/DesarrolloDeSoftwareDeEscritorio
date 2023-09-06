package afa;

public class AFA {

    public static void main(String[] args) {
        
        Equipo inter = new Equipo(0003, "INTER DE MILAN", 110280);
        Equipo juventus = new Equipo(0004, "JUVENTUS DE TURIN", 111000);
        Equipo milan = new Equipo(0002, "AC MILAN", 0);
        Equipo napoli = new Equipo(0001, "SSC NAPOLES", 89000);
        
        Jugador inter70 = new Jugador(7, "ALEXIS SANCHEZ", 4000000, 34, false, "A", 20, inter);
        Jugador inter1 = new Jugador(1, "YANN SOMMER", 5000000, 34, true, "A", 0, inter);
        
        Jugador juventus1 = new Jugador(1, "Wojciech Szczesny", 10000000, 33, true, "a", 0, juventus);
        
        
        inter1.fichaJugador();
        inter70.fichaJugador();
        
        juventus1.fichaJugador();
        
    }
    
}
