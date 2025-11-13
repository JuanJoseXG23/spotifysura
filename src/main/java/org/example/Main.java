package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //spotify
        //Necesitamos registrar canciones en la base de datos
        //de spotify, cada cancion debe de tener

        //id , nombre , artista , duracion , genero , año de lanzamiento , clasificacion edad


        //necesidades (Intentar no pasarme de 50 lineas de codigo)
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> canciones = new ArrayList<>();

        String decision = "entrar";
        while(!decision.equals("salir")) {
            System.out.println("Digita salir si quieres terminar");
            decision = pedirDato.nextLine();
            System.out.println("Digitaste" + decision);

            if(decision.equals("salir")) {
                break;
            }
            HashMap<String, Object> cancion = new HashMap<>();
            System.out.print("Digita el nombre de la cancion: ");
            cancion.put("nombre: " , pedirDato.nextLine());

            System.out.print("Digite el artista: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digite el genero de la cancion: ");
            cancion.put("Genero: ", pedirDato.nextLine());

            System.out.print("Digita el año de lanzamiento: ");
            cancion.put("Año lanzamiento: " , pedirDato.nextLine());

            System.out.print("Clasificacion de la cancion: ");
            cancion.put("Clasificacion: " , pedirDato.nextLine());

            System.out.print("Digita el id de la cancion: ");
            cancion.put("ID: ", pedirDato.nextInt());

            System.out.print("Digite la duracion de la cancion: ");
            cancion.put("duracion: " , pedirDato.nextDouble());

            pedirDato.nextLine();


            //
            canciones.add(cancion);

            //Mostrando la lista
            System.out.println(canciones);
        }

    }
}