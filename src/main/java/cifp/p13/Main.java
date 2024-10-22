package cifp.p13;

import cifp.p13.dto.Perfil;
import cifp.p13.dto.Sesion;

import java.io.IOException;
import java.util.Scanner;

import static cifp.p13.logic.LogicaInvitado.nuevoEntrenador;

public class Main {

    static Sesion sesion=new Sesion();

    public static void main(String[] args) throws IOException {

        sesion.setPerfil(Perfil.INVITADO);
        int opcion=-1;
        boolean salir = false;

        Scanner s=new Scanner(System.in);

        System.out.println("\n" +
                "\n" +
                " ____   _    _     ____  _____    _    ______   ____  __ \n" +
                "|  _ \\ / \\  | |   |  _ \\| ____|  / \\  / ___\\ \\ / /  \\/  |\n" +
                "| |_) / _ \\ | |   | | | |  _|   / _ \\| |  _ \\ V /| |\\/| |\n" +
                "|  __/ ___ \\| |___| |_| | |___ / ___ \\ |_| | | | | |  | |\n" +
                "|_| /_/   \\_\\_____|____/|_____/_/   \\_\\____| |_| |_|  |_|\n" +
                "\n");
        System.out.println("Bienvenido al sistema de combates de gimnasios Pokémon de Paldea.");

        do {

            mostrarMenu();
            opcion=s.nextInt();
            salir=opcion==0;

            switch (opcion) {

                case 1: nuevoEntrenador();break;

            }

        } while (!salir);

        s.close();

    }

    private static void mostrarMenu() {

        System.out.println("Introduzca su opción:");

        switch(sesion.getPerfil()) {

            case INVITADO:
                System.out.println("1. Registrarse como nuevo entrenador");
                System.out.println("2. Iniciar sesión");
                break;

            case ENTRENADOR:
                System.out.println("A implementar");
                break;

            case TORNADMIN:
                System.out.println("A implementar");
                break;

            case SYSADMIN:
                System.out.println("A implementar");
                break;

        }

        System.out.println("Pulse 0 para salir.");

    }
}

