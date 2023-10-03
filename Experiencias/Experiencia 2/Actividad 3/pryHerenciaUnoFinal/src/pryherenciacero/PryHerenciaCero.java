package pryherenciacero;

public class PryHerenciaCero {

    public static void main(String[] args) {
        
        //Persona p = new Persona();
        
        Estudiante e = new Estudiante("duoc", 6.9, "222-2", "pepa");
        Trabajador t = new Trabajador("contador", 590000, 3, "111-1", "pancho");
        
        t.setNombre("Barbie");
        e.setNombre("Ken");
        
        System.out.println("Premio de Ken   : " + e.premio());
        System.out.println("Premio de Barbie: " + t.premio());
        
        System.out.println("Aguinaldo de Ken   : " + e.aguinaldo());
        System.out.println("Aguinaldo de Barbie: " + t.aguinaldo());
        
        
    }
    
}
