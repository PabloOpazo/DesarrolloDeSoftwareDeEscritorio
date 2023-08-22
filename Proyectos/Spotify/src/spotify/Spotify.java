package spotify;

public class Spotify {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Spotify");

        Cancion cancion1 = new Cancion("XQ TAN SOLA?", "Nickoog Clk - Jere Klein", 3, 20, 1, 1, 1);
        System.out.println(cancion1.toString());
    }
}
