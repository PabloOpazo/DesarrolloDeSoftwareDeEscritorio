package veterinariacolab;

public class Propietario {
    private String rut, nombre;
    private int celular;

    public Propietario() {
    }

    public Propietario(String rut, String nombre, int celular) {
        this.rut = rut;
        this.nombre = nombre;
        this.celular = celular;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Propietario{" + "rut=" + rut + ", nombre=" + nombre + ", celular=" + celular + '}';
    }
    
    
}
