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
        if (rut.length() > 0) {
            this.rut = rut;
        } else {
            this.rut = null;
            System.out.println("Error, RUT no puede estar vacio");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            this.nombre = null;
            System.out.println("Error, NOMBRE no puede estar vacio");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 0) {
            this.apellido = apellido;
        } else {
            this.apellido = null;
            System.out.println("Error, APELLIDO no puede estar vacio");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
            System.out.println("Error, EDAD no puede ser 0");
        }
    }

    @Override
    public String toString() {
        return "Pasajero{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
