package com.dio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class ExemploPost {

    public static final String URL_POST = "https://httpbin.org/forms/post";
    public static final String FILE_JSON = "src/com/dio/pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {
        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Criação da requisição
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        //Requisição Assíncrona
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();


    }
}
