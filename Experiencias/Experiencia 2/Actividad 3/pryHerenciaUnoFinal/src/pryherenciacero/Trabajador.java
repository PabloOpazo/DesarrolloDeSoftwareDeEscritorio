package pryherenciacero;

public class Trabajador extends Persona {
    private String cargo;
    private double sueldo;
    private int años;

    public Trabajador(String cargo, double sueldo, int años, String rut, String nombre) {
        super(rut, nombre);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.años = años;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    @Override
    public int aguinaldo() {
        double a = 0;
        if(años >= 0 && años <= 1) a = sueldo * 0.3; 
        if(años >= 2 && años <= 4) a = sueldo * 0.7; 
        if(años >= 5) a = sueldo * 1.2;
        
        return (int) a;
    }
    
    
    
}
