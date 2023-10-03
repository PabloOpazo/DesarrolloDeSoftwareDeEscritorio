/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author concepcion
 */
public final class Entrenador extends Persona {
    private String idFederacion;
    
    public Entrenador() {
	super();
    }

    public Entrenador(String idFederacion, int id, 
            String Nombre, String Apellidos, 
            int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }
    
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Hola, me llamo: " + super.nombre + " y estoy dirigiendo un partido");
    }

    public void dirigirEntreno() {
        System.out.println("Hola, me llamo: " + super.nombre + "e stoy dirigiendo un entrenamiento");
    }
}
