package com.aluracursos.challenge.principal;

import com.aluracursos.challenge.servicios.Peticion;
import com.aluracursos.challenge.vista.Menu;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)  {
        int respuesta;

        respuesta = Menu.menuDefinido();

        
        /*Peticion peticion = new Peticion("USD", "MXN");
        String resultado;
        try{
            resultado = peticion.peticionar();
        }catch (IOException | InterruptedException e){
            System.out.println("Ocurrio un error: " + e.getMessage());
        }*/
    }
}