package prycoleccion2;

import java.util.ArrayList;

public class Registro {
    // guardar una coleccion de mascotas
    private ArrayList<Mascota> coleccion = new ArrayList<>();

    // método que permita agregar una mascota
    // validar que id de la mascota sea único
    // buscar si el id nuevo NO se encuentra
    public boolean agregar(Mascota nueva) {
        // recorrer la coleccion para comparar los id
//        boolean encontrado = false;
//        for (int i = 0; i < coleccion.size(); i++) {
//            if(coleccion.get(i).getId() == nueva.getId()) {
//                encontrado = true;
//                break;
//            }
//        }
        if(buscarId(nueva.getId()) == null) {
            return coleccion.add(nueva);
        } else {
            return false;
        }     
    }
    
    // metodo que permita listar todas las mascotas de la colección
    public String listar() {
        String salida = "LISTADO GENERAL DE MASCOTAS\n";
        salida += "---------------------------\n";
        // recorrer la coleccion para mostrar cada mascota
        for (int i = 0; i < coleccion.size(); i++) {
            salida += coleccion.get(i).getId() + " ";
            salida += coleccion.get(i).getEspecie() + " ";
            salida += coleccion.get(i).getNombre() + " ";
            salida += coleccion.get(i).getProp().getNombre() + "\n";
        }
        salida += "   ### FIN LISTADO ###\n";
        return salida;
    }
    
    // método de busqueda a través del id de mascota 
    // devuelve el objeto si el id es encontrado
    // sino, devuelve null
    public Mascota buscarId(int idBuscado) {
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getId() == idBuscado) {
                return coleccion.get(i);
            }
        }
        return null;
    }
            
    // crear método que permita remover Mascota
    // a través del id
    public boolean remover(int idRemover) {
//        Mascota elim = buscarId(idRemover);
//        // si no es null, id existe, por tanto se puede remover
//        if(elim != null) {
//            coleccion.remove(elim);
//            return true;
//        } else {
//            return false;
//        }
        return coleccion.remove(buscarId(idRemover));
    }
    
    // filtrar las mascotas por especie
    // debe recibir como String la especie de las mascotas a mostrar
    public String filtrarEspecie(String especie) {
        String salida = "FILTRO ESPECIE: " + especie + "\n";
        // recorrer la coleccion completa
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getEspecie().equalsIgnoreCase(especie)) {
                salida += coleccion.get(i).getId() + " ";
                salida += coleccion.get(i).getNombre() + "\n";
            }
        }
        return salida;
    }
       
}
