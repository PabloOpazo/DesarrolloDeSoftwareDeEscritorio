/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

public class Cancion {
    private String nombre, artista;
    private Number minutos, segundos;
    private Boolean duracion, descarga, favoritos;

    //Constructor vacío
    public Cancion() {
    }

    public Cancion(String nombre, String artista, Number minutos, Number segundos, Boolean duracion, Boolean descarga, Boolean favoritos) {
        this.nombre = nombre;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
        this.duracion = duracion;
        this.descarga = descarga;
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Number getMinutos() {
        return minutos;
    }

    public void setMinutos(Number minutos) {
        this.minutos = minutos;
    }

    public Number getSegundos() {
        return segundos;
    }

    public void setSegundos(Number segundos) {
        this.segundos = segundos;
    }

    public Boolean getDuracion() {
        return duracion;
    }

    public void setDuracion(Boolean duracion) {
        this.duracion = duracion;
    }

    public Boolean getDescarga() {
        return descarga;
    }

    public void setDescarga(Boolean descarga) {
        this.descarga = descarga;
    }

    public Boolean getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Boolean favoritos) {
        this.favoritos = favoritos;
    }

    
    
}
