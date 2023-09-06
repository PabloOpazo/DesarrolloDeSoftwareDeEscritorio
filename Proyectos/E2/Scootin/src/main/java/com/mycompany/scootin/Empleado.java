package com.mycompany.scootin;

public class Empleado {
    private int rut;
    private String nombre_completo;
    private char genero;
    private int anios_servicio, edad;
    private Puesto puesto;

    public Empleado() {
        puesto = new Puesto();
    }

    public Empleado(int rut, String nombre_completo, char genero, int anios_servicio, int edad, Puesto puesto) {
        this.setRut(rut);
        this.setNombre_completo(nombre_completo);
        this.setGenero(genero);
        this.setAnios_servicio(anios_servicio);
        this.setEdad(edad);
        this.setPuesto(puesto);
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnios_servicio() {
        return anios_servicio;
    }

    public void setAnios_servicio(int anios_servicio) {
        this.anios_servicio = anios_servicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombre_completo=" + nombre_completo + ", genero=" + genero + ", anios_servicio=" + anios_servicio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
}
