package com.conversormonedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateClient {

    private static final String API_KEY = "4ddaf1d1e2086cb66ee88987";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public String obtenerTasas(String monedaBase) throws Exception {
        String url = BASE_URL + API_KEY + "/latest/" + monedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}