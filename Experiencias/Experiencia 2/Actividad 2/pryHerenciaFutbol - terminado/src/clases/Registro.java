package clases;

import java.util.ArrayList;

public class Registro {
    private static ArrayList<Persona> seleccion = new ArrayList<>();
    
    public boolean agregar(Persona p) {
        seleccion.add(p);
        return true;
    }
    
    public void concentrados() {
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (int i = 0; i < seleccion.size(); i++) {
            System.out.print(seleccion.get(i).getNombre()+" "+seleccion.get(i).getApellidos()+" -> ");
            seleccion.get(i).concentrarse();
            System.out.println("soy : " + seleccion.get(i).getClass().getSimpleName());
    
        }   
    }
    
    public void viajando() {
         // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (int i = 0; i < seleccion.size(); i++) {
                System.out.print(seleccion.get(i).getNombre()+" "+seleccion.get(i).getApellidos()+" -> ");
                seleccion.get(i).viajar();
        } 
    }
    
    public void datosYoperaciones() {
        System.out.println("\nlos datos y operaciones");
        for (int i = 0; i < seleccion.size(); i++) {
            String clase = seleccion.get(i).getClass().getSimpleName();
            System.out.print(seleccion.get(i).getNombre()+ " soy " + clase.toUpperCase() + "\n");
            String operaciones = "viajar, concentrarse";
            if(clase.equals("Entrenador")) {
                operaciones += ", dirigir entrenamiento, dirigir partido";
                Entrenador e = (Entrenador)seleccion.get(i);
                e.dirigirEntreno();
                e.dirigirPartido();
            }
            if(clase.equals("Masajista")) {
                operaciones += ", dar masajes";
                Masajista m = (Masajista)seleccion.get(i);
                m.darMasaje();
            }
            if(clase.equals("Futbolista")){
                operaciones += ", entrenar y Jugar Partido";
                Futbolista f = (Futbolista)seleccion.get(i);
                f.entrenar();
                f.jugarPartido();
            }
            System.out.println("mis operaciones: " + operaciones);
            
       }
    }
}
