package cifp.p13.logic;

import cifp.p13.dto.Carnet;
import cifp.p13.dto.Entrenador;
import cifp.p13.dto.LoginCreds;
import cifp.p13.dto.Sesion;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class LogicaInvitado {

    public static boolean nuevoEntrenador() throws IOException {

        String nom;
        String nacionalidad;

        LocalDate exp;

        String un;
        String pw;

        String check="N";

        Entrenador nuevo = new Entrenador();
        Carnet nuevoC = new Carnet();

        File fichEntrenador = new File("./src/main/java/cifp/p13/datafiles/entrenadores.dat");
        FileOutputStream fishEntrenador=new FileOutputStream(fichEntrenador,true);
        ObjectOutputStream oosEntrenador=new ObjectOutputStream(fishEntrenador);

        File fichCarnet = new File("./src/main/java/cifp/p13/datafiles/carnets.dat");
        FileOutputStream fishCarnet=new FileOutputStream(fichEntrenador,true);
        ObjectOutputStream oosCarnet=new ObjectOutputStream(fishEntrenador);

        File fichLogin = new File("./src/main/java/cifp/p13/datafiles/credenciales.txt");
        FileOutputStream fishLogin=new FileOutputStream(fichEntrenador,true);
        ObjectOutputStream oosLogin=new ObjectOutputStream(fishEntrenador);


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

        /* nuevoL.setUn(un);
        nuevoL.setPw(pw); */

        // añadir los datos a los ficheros para credenciales, carnet y entrenador

        System.out.println("Guardando datos...");
        oosEntrenador.writeObject(nuevo);
        oosCarnet.writeObject(nuevoC);
        // implementar escritura a credenciales.txt
        System.out.println("¡Sus datos han sido guardados! Si encuentra algún error referente a su información, por favor contacte con su gimnasio de preferencia.");

        return true;

    }

    private static Long calcID() {
        // TODO Auto-generated method stub
        return null;
    }

}
