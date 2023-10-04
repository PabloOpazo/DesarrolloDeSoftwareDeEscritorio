package foodtruck;

public class FoodTruck {

    public static void main(String[] args) {
        Bebestible b = new Bebestible(2.5, 1010, "LEMON STONE", 1500);
        Comestible c = new Comestible(true, 1020, "LOMITO", 3500);
        
        System.out.println(b.imprimirBoleta("EFECtivo", 2));
        System.out.println(c.imprimirBoleta("TARJETA", 4));
        
    }
    
}
