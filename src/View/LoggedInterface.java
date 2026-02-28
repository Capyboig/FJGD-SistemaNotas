package View;

import repository.NotasRepository;

import java.util.Scanner;

public class LoggedInterface {
    String emailSanitizado;
    NotasRepository notasRepository = new NotasRepository();
    private Scanner sc;
    public LoggedInterface() {

    }


    public void mostrarMenuLogin() {

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
                    System.out.println("Introduce el titulo de la nota");
                    String notaTitulo = sc.nextLine();


                    System.out.println("Introduce el contenido para anotar");
                    String contenido = sc.nextLine();
                    System.out.println("Guardando 1....");
                    notasRepository.guardarNota(emailSanitizado, notaTitulo, contenido);
                    System.out.println("Guardando 2....");
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


    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
