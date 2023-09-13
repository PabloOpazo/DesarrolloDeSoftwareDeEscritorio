package spotify.pkg2;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Cancion> registroCancion = new ArrayList<>();
    
    public Cancion buscar(String busqueda) {
        for (int i = 0; i < registroCancion.size(); i++) {
            if(registroCancion.get(i).getTitulo().equalsIgnoreCase(busqueda)) {
                return registroCancion.get(i);
            }
        }
        return null;
    }
    
    public boolean agregar(Cancion nuevaCancion) {
        if(buscar(nuevaCancion.getTitulo()) == null) {
            return registroCancion.add(nuevaCancion);
        } else {
            return false;
        }
        
    }
    
    public String listado() {
        String salida = "LISTADO DE CANCIONES: \n";
        salida += "---------------------------\n";
        // recorrer la coleccion para mostrar cada mascota
        for (int i = 0; i < registroCancion.size(); i++) {
            salida += registroCancion.get(i).getTitulo() + " - ";
            salida += registroCancion.get(i).getArtista() + " - ";
            salida += registroCancion.get(i).duracion() + " ";
            if (registroCancion.get(i).isFavoritos() == true) {
                salida += "⭐\n";
            }
        }
        salida += "   ### FIN ###\n";
        return salida;
    }
    
    
}
