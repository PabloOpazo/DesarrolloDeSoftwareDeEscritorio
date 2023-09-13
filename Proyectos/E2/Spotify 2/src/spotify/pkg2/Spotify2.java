package spotify.pkg2;

import javax.swing.JOptionPane;

public class Spotify2 {

    public static void main(String[] args) {
        Playlist p1 = new Playlist("Playlist insana 😎");
        Playlist p2 = new Playlist("XDDDD");

        Cancion c1 = new Cancion("Cunumi", "Faraon love Shady", 3, 04, false, true, p2);
        Cancion c2 = new Cancion("Pantera", "Kidd vodoo", 2, 43, true, true, p1);
        Cancion c3 = new Cancion("Classy 101", "Feid, Young Miko", 3, 15, true, false, p1);
        Cancion c4 = new Cancion("A tu lado", "entremares", 2, 16, false, false, p2);
        Cancion c5 = new Cancion("Ferxxo 100", "Feid", 2, 47, true, true, p1);
        Cancion c6 = new Cancion("SI TU SUPIERAS", "Feid", 3, 16, true, true, p2);
        
        
        Registro registro = new Registro();
        System.out.println(registro.agregar(c1));
        System.out.println(registro.agregar(c2));
        System.out.println(registro.agregar(c3));
        System.out.println(registro.agregar(c4));
        System.out.println(registro.agregar(c5));
        System.out.println(registro.agregar(c6));
        
        
        JOptionPane.showMessageDialog(null, registro.listado());
    }

}
