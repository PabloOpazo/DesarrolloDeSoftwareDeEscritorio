package veterinariacolab;

public class VeterinariaColab {

    public static void main(String[] args) {
        Propietario p = new Propietario("20.628.750-0", "Jaime", 988887018);
        
        Mascota m1 = new Mascota(p, "PERRO", "Loki", 8, true);
        Mascota m2 = new Mascota(p, "GATO", "Ñau", 24, false);
        
        System.out.println(m1);
        System.out.println(m2);
        
    }
    
}
