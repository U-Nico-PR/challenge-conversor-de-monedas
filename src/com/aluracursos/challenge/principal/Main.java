package com.aluracursos.challenge.principal;

import com.aluracursos.challenge.modelos.Operacion;
import com.aluracursos.challenge.modelos.OperacionOmdb;
import com.aluracursos.challenge.servicios.Peticion;
import com.aluracursos.challenge.vista.Menu;
import com.google.gson.Gson;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        int respuesta;
        String[] datos = new String[2];
        Peticion peticion;
        String json;
        double valor;

        do{
            respuesta = Menu.menuDefinido();
            if(respuesta > 0 && respuesta < 9){
                valor = Menu.pedirValor();
                datos = Menu.eleccion(respuesta);
                peticion = new Peticion(datos[0], datos[1]);
                try{
                    json = peticion.peticionar();
                    Gson gson = new Gson();
                    OperacionOmdb op = gson.fromJson(json, OperacionOmdb.class);
                    Operacion operacion = new Operacion(datos[0], datos[1], valor, op);
                    operacion.calcular();
                    System.out.println(operacion.toString());
                }catch (IOException | InterruptedException e){
                    System.out.println("Ocurrio un error: " + e.getMessage());
                }
            }
        }while(respuesta != 9);
        System.out.println("Gracias por su preferencia. Hasta luego.");
    }
}