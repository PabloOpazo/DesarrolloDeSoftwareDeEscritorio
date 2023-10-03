package pryherenciacero;

public class Estudiante extends Persona {
    private String institucion;
    private double promedio;

    public Estudiante(String institucion, double promedio, String rut, String nombre) {
        super(rut, nombre);
        this.institucion = institucion;
        this.promedio = promedio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public int aguinaldo() {
        int a = 0;
        if(promedio >= 4.0 && promedio <= 5.4) a = 40000;
        if(promedio >= 5.5 && promedio <= 6.8) a = 80000;
        if(promedio >= 6.9) a = 120000;
        return a;
    }

    
}
