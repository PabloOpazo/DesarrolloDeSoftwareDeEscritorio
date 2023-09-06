package fruteria;

public class Fruteria {

    public static void main(String[] args) {
                
        //Ingreso de productos
        Producto p1 = new Producto(1000, "Verdura", "Zanahoria", 890, "1000 gramos");
        Producto p2 = new Producto(1110, "Verdura", "Pepino", 579, "1 unidad");
        Producto p3 = new Producto(5000, "Fruta", "Piña", 1789, "2 Unidades");
        Producto p4 = new Producto(5005, "Fruta", "Arándanos", 1490, "125 gramos");
        
        //Ingreso de clientes
        Cliente c1 = new Cliente(12189443, '5', "Juan Pérez", "juanito@gmail.com", "Av. Francia 550 Valparaiso", 98987678);
        Cliente c2 = new Cliente(18112345, 'K', "Paulina Godoy", "pau.godoy@gmail.com", "5 Norte 231 Viña del Mar", 87454432);
        
        //SOLICIUDES
        Solicitud s1 = new Solicitud(1, "23/08/2023", c1, p4.getPrecio(), p4);
        
        //Mostrar valores
        System.out.println(s1);
        
    }

}
