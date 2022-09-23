package spotify;
import java.util.ArrayList;

public class Playlist {
    private String nombre_pl;
    private ArrayList<Cancion> listaCancion;

    public Playlist() {
        listaCancion = new ArrayList<>();
    }
    
    public boolean agregar(Cancion nueva) {
        listaCancion.add(nueva);
        return true;
    }
    public String listar() {
        String msg = "Listado de canciones - "+ nombre_pl;
        msg+= "\n------------------------";
        for (int i = 0; i < listaCancion.size(); i++) {
            msg += "\n" + listaCancion.get(i).toString();
        }
        msg += "\n------------------------";
        return msg;
    }

    public Playlist(String nombre_pl) {
        this.nombre_pl = nombre_pl;
    }

    public String getNombre_pl() {
        return nombre_pl;
    }

    public void setNombre_pl(String nombre_pl) {
        this.nombre_pl = nombre_pl;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre_pl=" + nombre_pl + ", listaCancion=" + listaCancion + '}';
    }
    
}
