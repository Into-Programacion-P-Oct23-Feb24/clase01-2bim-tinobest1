/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal = "";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        int limite;

        System.out.println("Cuantos jugadores quiere Ingresar");
        limite = entrada.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println("Ingrese el nombre y apellido del jugador");
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatuta");
            estatura = entrada.nextDouble();

            cadenaFinal = String.format("%s%s.%s - %s -, edad %d, estatura"
                    + " %s",
                    cadenaFinal, i, nombre, posicion, edad,
                    estatura);

            cadenaFinal = String.format("%s\n", cadenaFinal);

        }

        System.out.printf("Listado de Jugadores\n%s\n", cadenaFinal);
    }
}
