package afa;

public class Equipo {
    private int codigo;
    private String nombre;
    private int socios;

    public Equipo() {
    }

    public Equipo(int codigo, String nombre, int socios) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setSocios(socios);
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

    public int getSocios() {
        return socios;
    }

    public void setSocios(int socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", socios=" + socios + '}';
    }
 
    /*
    public void mostrarJugadores(){
        for (int i = 1; i < 40; i++) {
            
        }
    }*/
    
}
