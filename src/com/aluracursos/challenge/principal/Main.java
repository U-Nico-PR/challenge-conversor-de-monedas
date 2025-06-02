package com.aluracursos.challenge.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*
        Para hacer un request se utiliza una arquitectura Cliente-Servidor
        Somos el cliente que pide los datos al servidor.
        El Request pregunta que es lo que queremos
         */
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/69ef57f28f49fe4ee5b8578d/latest/USD")) // Aquí va la URL de la API
                .build();

        /*
        Recive la respuesta
        el metodo "send" puede regresar un error
        por esta razón se debe hacer un try-catch-finally
         */
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        /*
        Imprimimos la respuesta de la petición
         */
        System.out.println(response.body());
    }
}