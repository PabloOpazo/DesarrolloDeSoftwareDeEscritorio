package prypizzeria;

public class PryPizzeria {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("napolitana", "familiar", "delgada");
        Pizza pizza2 = new Pizza("pepperoni", "individual", "piedra");
        Pizza pizza3 = new Pizza();
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        
        pizza3.setNombre("vegeta");
        pizza3.setTamaño("mediano");
        pizza3.setMasa("Sayayin");
        
        System.out.println(pizza3);
        
        
        // obtener el nombre de la pizza2
        System.out.println(pizza2.getNombre());
    } 
}
