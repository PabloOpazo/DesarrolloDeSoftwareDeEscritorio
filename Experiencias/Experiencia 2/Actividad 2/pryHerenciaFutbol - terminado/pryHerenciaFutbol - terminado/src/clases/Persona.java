package clases;

public abstract class Persona implements Irealizable {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(int id, String Nombre, String Apellidos, int Edad) {
        this.id = id;
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.edad = Edad;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }
        
    public final void concentrarse() {
        System.out.println("Hola, me llamo: " + nombre + " " + apellidos + " y estoy concentrado)");
    }

    public final void viajar() {
	System.out.println("Hola, me llamo: " + nombre + " " + apellidos + " y estoy viajando)");

    }

}
