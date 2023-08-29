package aerolinea;

public class Pasajero {
    private String rut;
    private String nombre, apellido;
    private int edad;

    public Pasajero() {
    }

    public Pasajero(String rut, String nombre, String apellido, int edad) {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
