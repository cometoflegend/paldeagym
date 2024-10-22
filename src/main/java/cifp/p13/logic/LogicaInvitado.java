package cifp.p13.logic;

import cifp.p13.dto.Carnet;
import cifp.p13.dto.Entrenador;
import cifp.p13.dto.LoginCreds;

import java.time.LocalDate;
import java.util.Scanner;

public class LogicaInvitado {

    public static boolean nuevoEntrenador() {

        String nom;
        String nacionalidad;

        LocalDate exp;

        String un;
        String pw;

        String check="N";

        Entrenador nuevo = new Entrenador();
        Carnet nuevoC = new Carnet();
        LoginCreds nuevoL = new LoginCreds();


        Scanner t=new Scanner(System.in);

        do {
            System.out.println("Introduzca el nombre del entrenador.");
            nom=t.next();

            System.out.println("Introduzca la nacionalidad del entrenador.");
            nacionalidad=t.next();

            System.out.println("Los datos introducidos para el nuevo entrenador son:");
            System.out.println("Nombre: "+nom);
            System.out.println("Nacionalidad: "+nacionalidad);
            System.out.println("¿Son correctos los datos anteriores? S/N");
            check=t.next().toUpperCase();

        } while (check=="N");

        Long idEntrenador=calcID();
        nuevo.setId(idEntrenador);
        nuevo.setNombre(nom);
        nuevo.setNacionalidad(nacionalidad);

        nuevoC.setIdEntrenador(idEntrenador);
        nuevoC.setFechaExpedicion(LocalDate.now());
        nuevoC.setPuntos(0);
        nuevoC.setNumVictorias(0);

        System.out.println("¡Hemos registrado sus datos y su ficha de entrenador! Ahora necesitará crear un usuario con su respectiva contraseña para poder usar las funciones de Paldeagym.");
        check="N";

        do {
            System.out.println("Introduzca su nombre de usuario.");
            un=t.next();

            System.out.println("Introduzca su contraseña.");
            pw=t.next();

            System.out.println("Los datos introducidos su  son:");
            System.out.println("Usuario: "+un);
            System.out.println("Contraseña: "+pw);
            System.out.println("¿Son correctos los datos anteriores? S/N");
            check=t.next().toUpperCase();

        } while (check=="N");

        nuevoL.setUn(un);
        nuevoL.setPw(pw);

        // añadir los datos a los ficheros para credenciales, carnet y entrenador

        return false;

    }

    private static Long calcID() {
        // TODO Auto-generated method stub
        return null;
    }

}
