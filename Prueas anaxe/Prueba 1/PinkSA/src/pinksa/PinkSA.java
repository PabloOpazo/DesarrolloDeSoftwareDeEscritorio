package pinksa;

public class PinkSA {

    public static void main(String[] args) {
        Almacen a1 = new Almacen();
        Sobre s1 = new Sobre("pequeño", "Jaime", 4, "Santiago", true, "Efectivo");
        Paquete p1 = new Paquete(5.6, "Jaime", 4, "Santiago", false, "Tarjeta");
        
        System.out.println(a1.almacenar(p1));
        System.out.println(a1.almacenar(s1));
        
        System.out.println(a1.lista());
    }
    
}
