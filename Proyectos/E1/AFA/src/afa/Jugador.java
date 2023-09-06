package afa;

public class Jugador {

    private int dorsal;
    private String nombre;
    private int precio, edad;
    private boolean arquero;
    private String categoria;
    private int goles;
    private Equipo equipo;

    public Jugador() {
        equipo = new Equipo(); //FK
    }

    public Jugador(int dorsal, String nombre, int precio, int edad, boolean arquero, String categoria, int goles, Equipo equipo) {
        this.setDorsal(dorsal);
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setEdad(edad);
        this.setArquero(arquero);
        this.setCategoria(categoria);
        this.setGoles(goles);
        this.setEquipo(equipo);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal >= 1 && dorsal <= 40) {
            this.dorsal = dorsal;
        } else {
            this.dorsal = 0;
            System.out.println("Error, numero de camiseta debe ser entre 1 y 40");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 4) {
            this.nombre = nombre.toUpperCase();
        } else {
            this.nombre = null;
            System.out.println("Error, NOMBRE debe tener minimo 4 caracteres");
        }

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isArquero() {
        return arquero;
    }

    public void setArquero(boolean arquero) {
        this.arquero = arquero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        switch (categoria) {
            case "j":
                this.categoria = "JUVENIL";
                break;
            case "J":
                this.categoria = "JUVENIL";
                break;
            case "a":
                this.categoria = "ADULTO";
                break;
            case "A":
                this.categoria = "ADULTO";
                break;
            default:
                this.categoria = null;
                System.out.println("Error, categoria debe ser 'J' o 'A'");
        }

    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        if (goles >= 0) {
            this.goles = goles;
        } else {
            this.goles = 0;
            System.out.println("Error, cantidad de goles debe ser positivo o cero");

        }

    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", precio=" + precio + ", edad=" + edad + ", arquero=" + arquero + ", categoria=" + categoria + ", goles=" + goles + ", equipo=" + equipo + '}';
    }

    public int aumantarPrecio(int porcentaje) {

        int precioNuevo = this.precio;

        if (porcentaje > 0) {
            precioNuevo = this.precio * (porcentaje / 100);

        }
        return precioNuevo;
    }

    public void fichaJugador() {
        System.out.println("---------------------------------------");
        System.out.println("            FICHA JUGADOR");
        System.out.println("---------------------------------------");
        System.out.println(this.dorsal + " " + this.nombre + " " + this.edad + " " + this.categoria + " " + this.equipo.getNombre());
    }

}
