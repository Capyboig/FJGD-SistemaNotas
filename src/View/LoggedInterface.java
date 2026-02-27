package View;

import java.util.Scanner;

public class LoggedInterface {

    public void mostrarMenuLogin() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" ===== MENU PROFESOR =====");

            System.out.println("1.- Crear nota");
            System.out.println("2.- Listar notas");
            System.out.println("3.- Ver nota por numero");
            System.out.println("4.- Eliminar nota (por numero)");
            System.out.println("5.- Salir");

            int opcionLogged = sc.nextInt();
            sc.nextLine();


            switch (opcionLogged) {
                case 1:
                    System.out.println("Con que nombre quieres guardar esta nota");
                    String notaNombre = sc.nextLine();


                    System.out.println("Introduce el texto a anotar");
                    String nota = sc.nextLine();
                    break;



                case 2:




                    break;




                case 3:




                    break;



                case 4:



                    break;



                case 5:



                    break;
            }
        }



    }
}
