package veterinariacolab;

public class Mascota {
    private Propietario prop;
    private String especie, nombre;
    private int meses;
    private boolean vacunas;

    public Mascota() {
        prop = new Propietario(); //FK
    }

    public Mascota(Propietario prop, String especie, String nombre, int meses, boolean vacunas) {
        this.prop = prop;
        this.especie = especie;
        this.nombre = nombre;
        this.meses = meses;
        this.vacunas = vacunas;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "prop=" + prop + ", especie=" + especie + ", nombre=" + nombre + ", meses=" + meses + ", vacunas=" + vacunas + '}';
    }
    
    
}
