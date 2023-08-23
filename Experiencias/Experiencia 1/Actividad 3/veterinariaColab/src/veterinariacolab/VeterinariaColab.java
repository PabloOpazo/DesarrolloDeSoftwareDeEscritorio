package veterinariacolab;

public class VeterinariaColab {

    public static void main(String[] args) {
        Propietario p1 = new Propietario("20.628.750-0", "Jaime", 988887018);
        
        Mascota m1 = new Mascota(p1, "PERRO", "Loki", 8, true);
        Mascota m2 = new Mascota(p1, "GATO", "Ñau", 24, false);
        
        System.out.println(m1);
        System.out.println(m2);
        
        
        //Construtor sin parametros PROPIETARIO
        Propietario p2 = new Propietario();
        p2.setRut("7387236-4");
        p2.setNombre("AAAAA");
        p2.setCelular(847293728);
        
        
        //Constructor sin parametros MASCOTA
        Mascota m3 = new Mascota();
        m3.setProp(p2);
        m3.setEspecie("GATO");
        m3.setNombre("Jaimito");
        m3.setMeses(9);
        m3.setVacunas(true);
        
        System.out.println(m3);
        
        
        //cambio de dueño
        m1.setProp(p1);
        m2.setProp(p1);
        m3.setProp(p1);
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        
        
        //Mostrar el nombre del propietario de la mascota 2
        System.out.println("Propietario m2: "+m2.getProp().getNombre());
        
        //modificar telefono m3
        m3.getProp().setCelular(8347482);
        System.out.println(m3);
        
        
        
    }
    
}
