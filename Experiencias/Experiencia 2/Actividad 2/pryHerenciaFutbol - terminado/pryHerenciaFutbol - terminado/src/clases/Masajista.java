package clases;

public final class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
            super();
    }

    public Masajista(String Titulacion, int aniosExperiencia, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.titulacion = Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("Hola, me llamo: " + super.nombre + " estoy dando masaje");
    }
}
