package spotify.pkg2;

public class Playlist {
    private String nombre;

    public Playlist() {
    }

    public Playlist(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre=" + nombre + '}';
    }
}
