package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        int contPollo = 0, contCarne = 0, contCazuela = 0, contFideos = 0;

        do {
            System.out.println("         MENU");
            System.out.println(".........................");
            System.out.println("1 Pollo con Arroz");
            System.out.println("2 Carne Mechada con Puré");
            System.out.println("3 Cazuela de Ave");
            System.out.println("4 Fideos con Salsa");
            System.out.println("5 Salir");
            System.out.println(".........................");
            System.out.print("Opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    contPollo++;
                    break;
                case 2:
                    contCarne++;
                    break;
                case 3:
                    contCazuela++;
                    break;
                case 4:
                    contFideos++;
                    break;
                case 5:
                    System.out.println("         TOTALES:");
                    System.out.println(contPollo + " Pollo con Arroz");
                    System.out.println(contCarne + " Carne Mechada con Puré");
                    System.out.println(contCazuela + " Cazuela de Ave");
                    System.out.println(contFideos + " Fideos con Salsa");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

    }
}
