package prycoleccion2;

import javax.swing.JOptionPane;

public class PryColeccion2 {

    public static void main(String[] args) {
        // crear Registro de Mascotas
        // crear Mascotas y agregar al registro
        Registro registro =  new Registro();
        
        Propietario p1 = new Propietario("20.628.750-0", "Pablo Opazo", "pa.opazo@duocuc.cl");
        Mascota m1 = new Mascota(p1, 2001, "GATO", "YONI");
        Mascota m2 = new Mascota(p1, 1002, "PERRO", "JIMMY");
        Mascota m3 = new Mascota(p1, 2003, "GATO", "TOM");
        
        System.out.println(registro.agregar(m1));
        System.out.println(registro.agregar(m2));
        System.out.println(registro.agregar(m3));
        System.out.println(registro.agregar(m2));
        
        //System.out.println(registro.listar());
        JOptionPane.showMessageDialog(null, registro.listar());
        
        //buscar id
        registro.buscarId(2001); //si existe
        registro.buscarId(57); //no existe
        
        
        
    }
    
}
