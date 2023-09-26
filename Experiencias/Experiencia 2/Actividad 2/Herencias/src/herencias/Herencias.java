package herencias;

public class Herencias {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("duoc", 6.9, "1234-5", "insano 3000");
        Trabajador t1 = new Trabajador("insano", 590000, 3, "246898-3", "aaaaaaa");
        
        e1.setNombre("waximingo");
        t1.setNombre("barbie");
        
        System.out.println("premio de waximingo: " + e1.premio());
        System.out.println("premio de barbie: " + t1.premio());
        
        System.out.println("waximingo: " + e1.aguinaldo());
        System.out.println("barbie: " + t1.aguinaldo());
        
    }
    
}
