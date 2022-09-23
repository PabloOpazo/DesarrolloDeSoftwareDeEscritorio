package spotify;

import javax.swing.JOptionPane;

public class Spotify {

    public static void main(String[] args) {
        Playlist p1 = new Playlist();
        Cancion c1 = new Cancion("Marisola", "Cris MJ, Standly", 184, true, true);
        Cancion c2 = new Cancion("Pato feo soy yo", "El Jordan 23", 197, true, false);
        Cancion c3 = new Cancion("BABY OTAKU", "Pablo Pesadilla, Polimá westcoast, Nickoog Clk, Fran C", 176, false, false);
        
        p1.setNombre_pl("el ma k suena");
        p1.agregar(c1);
        p1.agregar(c2);
        p1.agregar(c3);
        
        System.out.println(p1.listar());
        JOptionPane.showMessageDialog(null, p1.listar());

    }
    
}