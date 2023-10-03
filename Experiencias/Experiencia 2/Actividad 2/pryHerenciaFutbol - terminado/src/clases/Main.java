package clases;
import java.util.ArrayList;
public class Main {
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<Persona> seleccion = new ArrayList<>();

    public static void main(String[] args) {
        Entrenador tecnico = new Entrenador("Chile", 1,"Rueda", "Ruedita", 60);
        Futbolista niñoMaravilla = new Futbolista(7, "Delantero", 2, "Alexis","Sanchez",26);
        Masajista donJuanito = new Masajista("Licenciado en Fisioterapia", 18, 2, "Juanito","Martinez",26);

        seleccion.add(tecnico);
        seleccion.add(niñoMaravilla);
        seleccion.add(donJuanito);

  // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (int i = 0; i < seleccion.size(); i++) {
            System.out.print(seleccion.get(i).getNombre()+" "+seleccion.get(i).getApellidos()+" -> ");
            seleccion.get(i).concentrarse();
            System.out.println("soy :" + seleccion.get(i).getClass().getSimpleName());
    
        }
        
        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (int i = 0; i < seleccion.size(); i++) {
                System.out.print(seleccion.get(i).getNombre()+" "+seleccion.get(i).getApellidos()+" -> ");
                seleccion.get(i).viajar();
        } 
        System.out.println("\nlos datos y operaciones");
        for (int i = 0; i < seleccion.size(); i++) {
            String clase = seleccion.get(i).getClass().getSimpleName();
            System.out.print(seleccion.get(i).getNombre()+" soy " + clase.toUpperCase() + "\n");
            String operaciones = "viajar, concentrarse";
            if(clase.equals("Entrenador")) operaciones += ", dirigir entrenamiento, dirigir partido";
            if(clase.equals("Masajista")) operaciones += ", dar masajes";
            if(clase.equals("Futbolista")) operaciones += ", entrenar y Jugar Partido";
            System.out.println("mis operaciones: " + operaciones);
            
       }
    } 
    
}
