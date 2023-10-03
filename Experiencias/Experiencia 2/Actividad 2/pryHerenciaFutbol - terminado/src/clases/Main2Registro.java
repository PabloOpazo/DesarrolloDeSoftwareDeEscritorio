package clases;

public class Main2Registro {
    public static void main(String[] args) {
        Registro reg = new Registro();
        
        Entrenador tecnico = new Entrenador("Premier Ligue", 1,"Josep", "Guardiola", 48);
        Futbolista cyborg = new Futbolista(9, "Delantero", 2, "Erling","Haaland",22);
        Masajista milton = new Masajista("Licenciado en Fisioterapia", 18, 2, "Milton","Teras",52);

        reg.agregar(tecnico);
        reg.agregar(cyborg);
        reg.agregar(milton);
        
        reg.concentrados();
        reg.viajando();
        reg.datosYoperaciones();
        
    }
}
