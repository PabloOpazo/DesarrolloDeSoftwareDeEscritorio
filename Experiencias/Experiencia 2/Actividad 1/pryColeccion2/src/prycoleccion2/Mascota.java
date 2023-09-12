package prycoleccion2;

public class Mascota {
    private Propietario prop;
    private int id;
    private String especie;
    private String nombre;

    public Mascota() {
        this.prop = new Propietario();
    }

    public Mascota(Propietario prop, int id, String especie, String nombre) {
        this.prop = prop;
        this.id = id;
        this.especie = especie;
        this.nombre = nombre;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "prop=" + prop + ", id=" + id + ", especie=" + especie + ", nombre=" + nombre + '}';
    }
    
    
}
