package prycoleccion2;

import java.util.ArrayList;

public class Registro {
    // guardar una coleccion de mascotas
    private ArrayList<Mascota> registroMascota = new ArrayList<>();

    // método que permita agregar una mascota
    // validar que id de la mascota sea único
    // buscar si el id nuevo NO se encuentra
    public boolean agregar(Mascota nueva) {
        boolean encontrado = false;
        
        for (int i = 0; i < registroMascota.size(); i++) {
            if (registroMascota.get(i).getId() == nueva.getId()) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            registroMascota.add(nueva);
            return true;
        } else {
            return false;
        }
    }
    
    // metodo que permita listar todas las mascotas de la colección
    public String listar() {
        String salida = "● LISTADO GENERAL DE MASCOTAS\n";
        //salida += "---------------------------------\n";
        
        //recorrer colección
        for (int i = 0; i < registroMascota.size(); i++) {
            salida += registroMascota.get(i).getId() + ", ";
            salida += registroMascota.get(i).getEspecie() + ", ";
            salida += registroMascota.get(i).getNombre() +", ";
            salida += registroMascota.get(i).getProp().getNombre() + "\n";
        }
        salida += "###FIN LISTADO###\n";
        
        return salida;
    }
    
    // método de busqueda a través del id de mascota 
    // devuelve el objeto si el id es encontrado
    // sino, devuelve null

    public Mascota buscarId(int idBuscado) {
        for (int i = 0; i < registroMascota.size(); i++) {
            if (registroMascota.get(i).getId() == idBuscado) {
                return registroMascota.get(i);
            }
        }
        return null;
    }
    
    // crear método que permita remover Mascota
    // a través del id

    public boolean eliminar(int id) {
        Mascota elim = buscarId(id);
        if (elim ) {
            
        }
    }
       
}
