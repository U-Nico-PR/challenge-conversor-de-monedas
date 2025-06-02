package com.aluracursos.challenge.servicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticion {

    private String base;
    private String convertir;
    private String URL;
    private String clave = "69ef57f28f49fe4ee5b8578d";

    public Peticion(String base, String convertir){
        this.base = base;
        this.convertir = convertir;
        URL = "https://v6.exchangerate-api.com/v6/"+clave+"/pair/"+base+"/"+convertir+"/";
    }

    public String peticionar() throws IOException, InterruptedException {
        /*
        Para hacer un request se utiliza una arquitectura Cliente-Servidor
        Somos el cliente que pide los datos al servidor.
        El Request pregunta que es lo que queremos
         */
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL)) // Aquí va la URL de la API
                .build();

        /*
        Recive la respuesta
        el metodo "send" puede regresar un error
        por esta razón se debe hacer un try-catch-finally
         */
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        /*
        regresamos la respuesta de la petición
         */
        return response.body();
    }
}
