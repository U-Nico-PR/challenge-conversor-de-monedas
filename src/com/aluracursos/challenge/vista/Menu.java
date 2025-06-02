package com.aluracursos.challenge.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Clase para mostrar el menu de conversión.
 */
public class Menu {
    public static int menuDefinido() {
        Scanner teclado = new Scanner(System.in);
        int r = 0;
        String menu = """
                1) Dólar --> Peso Argentino
                2) Peso Argentino --> Dólar
                3) Dólar --> Real brasileño
                4) Real brasileño --> Dólar
                5) Dólar --> Peso comlombiano
                6) Peso colombiano --> Dólar
                7) Dólar --> Peso mexicano
                8) Peoso mexicano --> Dólar
                9) Salir
                
                Ingresa una opción: """;
        System.out.println(menu);
        try{
            r = teclado.nextInt();
        } catch (InputMismatchException e){
            teclado.close();
            System.out.println("Debes ingresar un número entero");
        }
        return r;
    }
}
