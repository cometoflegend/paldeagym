package cifp.p13;

import cifp.p13.dto.Perfil;
import cifp.p13.dto.Sesion;

import java.io.IOException;
import java.util.Scanner;

import static cifp.p13.dto.Perfil.*;
import static cifp.p13.logic.LogicaInvitado.login;
import static cifp.p13.logic.LogicaInvitado.nuevoEntrenador;

public class Main {

    private static Sesion sesion = new Sesion();
    Scanner s=new Scanner(System.in);

    // método para inicializar variables
    private static void initVariables() {
        sesion.setPerfil(INVITADO);

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        initVariables();
        mensajeInicial();
        mostrarMenu();

    }


    private static void mensajeInicial() {

        System.out.println("\n" +
                "\n" +
                " ____   _    _     ____  _____    _    ______   ____  __ \n" +
                "|  _ \\ / \\  | |   |  _ \\| ____|  / \\  / ___\\ \\ / /  \\/  |\n" +
                "| |_) / _ \\ | |   | | | |  _|   / _ \\| |  _ \\ V /| |\\/| |\n" +
                "|  __/ ___ \\| |___| |_| | |___ / ___ \\ |_| | | | | |  | |\n" +
                "|_| /_/   \\_\\_____|____/|_____/_/   \\_\\____| |_| |_|  |_|\n" +
                "\n");
        System.out.println("Bienvenido al sistema de combates de gimnasios Pokémon de Paldea.");

    }

    private static void mostrarMenu() throws IOException, ClassNotFoundException {

        Scanner s=new Scanner(System.in);
        boolean salir = false;

        do {

            System.out.println("Introduzca su opción:");

            switch(sesion.getPerfil()) {

                case INVITADO:
                    System.out.println("1. Registrarse como nuevo entrenador");
                    System.out.println("2. Iniciar sesión");
                    int opcion=s.nextInt();

                    switch (opcion) {

                        case 1: nuevoEntrenador();break;
                        case 2: login();break;

                    }
                    break;

                case ENTRENADOR:
                    System.out.println("A implementar");
                    opcion=s.nextInt();
                    break;

                case TORNADMIN:
                    System.out.println("A implementar");
                    opcion=s.nextInt();
                    break;

                case SYSADMIN:
                    System.out.println("A implementar");
                    opcion=s.nextInt();
                    break;

            }

            System.out.println("Pulse 0 para salir.");

        } while (!salir);

        s.close();


    }
}

