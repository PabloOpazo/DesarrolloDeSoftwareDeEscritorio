package com.mycompany.scootin;

public class Puesto {
    private int codigo;
    private String nombre;

    public Puesto() {
    }

    public Puesto(int codigo, String nombre) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Puesto{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
