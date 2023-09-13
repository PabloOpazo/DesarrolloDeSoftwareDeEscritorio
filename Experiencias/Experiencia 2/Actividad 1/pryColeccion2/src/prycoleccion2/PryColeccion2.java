package prycoleccion2;

import javax.swing.JOptionPane;

public class PryColeccion2 {

    public static void main(String[] args) {
        // crear Registro de Mascotas
        Registro registro = new Registro();
        
        // crear Mascotas y agregar al registro
        Propietario p1 = new Propietario("111-1", "pepe", "p@p.com");
        Mascota m1 = new Mascota(p1, 1010, "PERRO", "LOKI");
        Mascota m2 = new Mascota(p1, 2021, "GATO", "TOM");
        Mascota m3 = new Mascota(p1, 1015, "PERRO", "THOR");
        
        System.out.println(registro.agregar(m1));
        System.out.println(registro.agregar(m2));
        System.out.println(registro.agregar(m3));
        System.out.println(registro.agregar(m2));
        
        System.out.println(registro.listar());
        
        //JOptionPane.showMessageDialog(null, registro.listar());
        
        System.out.println(registro.remover(15));
        System.out.println(registro.listar()); 
        
        System.out.println(registro.filtrarEspecie("perro"));
    }
    
}
