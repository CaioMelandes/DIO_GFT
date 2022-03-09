package com.dio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ExemploGet {

    //public static final String URL_GET = "https://jsonplaceholder.typicode.com/posts";
    public static final String URL_GET = "https://httpbin.org/get";

    public static void main(String[] args) throws IOException, InterruptedException {
        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Criação da requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build();

        //Envio da solicitação
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Imprimir conteúdo recebido
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
