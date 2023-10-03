package pryherenciacero;

public class Persona {
    protected String rut;
    protected String nombre;

    public Persona() {
    }

    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
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
    
    public int premio(){
        return 75000;
    }
    
}
