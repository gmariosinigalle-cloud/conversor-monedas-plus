package com.conversormonedas;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    public double convertir(String json, String destino, double monto) {

        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        double tasa = obj.getAsJsonObject("conversion_rates").get(destino).getAsDouble();

        return monto * tasa;
    }

    public double obtenerTasa(String json, String destino) {

        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        return obj.getAsJsonObject("conversion_rates").get(destino).getAsDouble();
    }
}
