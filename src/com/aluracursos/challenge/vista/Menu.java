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
                ******************************
                Bienvenido al conversor de monedas.
                
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

    public static String[] eleccion(int respuesta){
        String[] datos = new String[2];
        switch(respuesta){
            case 1:
                datos[0] = "USD";
                datos[1] = "ARS";
                break;
            case 2:
                datos[0] = "ARS";
                datos[1] = "USD";
                break;
            case 3:
                datos[0] = "USD";
                datos[1] = "BRL";
                break;
            case 4:
                datos[0] = "BRL";
                datos[1] = "USD";
                break;
            case 5:
                datos[0] = "USD";
                datos[1] = "COP";
                break;
            case 6:
                datos[0] = "COP";
                datos[1] = "USD";
                break;
            case 7:
                datos[0] = "USD";
                datos[1] = "MXN";
                break;
            case 8:
                datos[0] = "MXN";
                datos[1] = "USD";
                break;
        }
        return datos;
    }

    public static double pedirValor(){
        String mensaje = """
                ****************************
                Ingresa el valor que deseas convertir:""";
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = teclado.nextDouble();
        return valor;
    }
}
