package prypizzeria;

public class Pizza {
    private String nombre, tamaño, masa;

    public Pizza(String nombre, String tamaño, String masa) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
    }

    public Pizza() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", masa=" + masa + '}';
    }
    
    public void preparar() {
        System.out.println("pizza " + nombre + " en preparacion");
    }
    
    public void calentar() {
        System.out.println("pizza " + nombre + " en el horno");
    }

}
