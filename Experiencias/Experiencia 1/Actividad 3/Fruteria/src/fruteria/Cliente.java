package fruteria;

public class Cliente {
    private int run;
    private char dv;
    private String nombre, mail, direccion;
    private int telefono;

    public Cliente() {
    }

    public Cliente(int run, char dv, String nombre, String mail, String direccion, int telefono) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", dv=" + dv + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
