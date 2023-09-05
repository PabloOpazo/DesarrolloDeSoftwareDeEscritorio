package empresatransporte;

public class Cliente {
    private int rut;
    private String nombre;
    private char tipo_cliente;
    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, char tipo_cliente, int edad) {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setTipo_cliente(tipo_cliente);
        this.setEdad(edad);
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("Error, el nombre no puede estar vacío");
            this.nombre = null;
        }
    }

    public char getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(char tipo_cliente) {
        if (tipo_cliente == 'E' || tipo_cliente == 'P') {
            this.tipo_cliente = tipo_cliente;
        } else {
            System.out.println("Error, tipo de cliente debe ser 'E' o 'P'");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", tipo_cliente=" + tipo_cliente + ", edad=" + edad + '}';
    }
}
