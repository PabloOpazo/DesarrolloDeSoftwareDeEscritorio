package aerolinea;

public class Aerolinea {

    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("20.628.750-0", "Pablo", "Opazo", 22);
        Pasajero pasajero2 = new Pasajero("13.739.861-1", "Juan", "Perez", 42);

        Pasaje pasaje1 = new Pasaje(5838, pasajero1, "Santiago", "29/08/2023", 30000, 57, true);
        Pasaje pasaje2 = new Pasaje(5838, pasajero2, "Santiago", "29/08/2023", 30000, 64, false);

        pasaje1.imprimir();
        pasaje2.imprimir();

        //Pruebas
        Pasajero pasajero3 = new Pasajero("20.628.750-0", "Pablo", "Opazo", 22);
        Pasaje pasaje3 = new Pasaje(5838, pasajero3, "Santiago", "29/08/2023", 9000, 91, true);
        pasaje3.imprimir();
    }

}
