package clases;

public final class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    public Futbolista() {
	super();
    }
    
    // getter y setter

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
    // customer
    public void jugarPartido() {
        System.out.println("Hola, me llamo: " + super.nombre + " estoy jugando partido");	
    }

    public void entrenar() {
        System.out.println("Hola, me llamo: " + super.nombre + " estoy jugando entrenando");
    }
}
