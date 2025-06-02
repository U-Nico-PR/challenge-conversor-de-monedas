package com.aluracursos.challenge.principal;

import com.aluracursos.challenge.servicio.Peticion;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        Peticion peticion = new Peticion("USD", "MXN");

        try{
            peticion.peticionar();
        }catch (IOException | InterruptedException e){
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

    }
}