package prycoleccion2;

public class Propietario {
    private String rut;
    private String nombre;
    private String correo;

    public Propietario() {
    }

    public Propietario(String rut, String nombre, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Propietario{" + "rut=" + rut + ", nombre=" + nombre + ", correo=" + correo + '}';
    }
    
}
