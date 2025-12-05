package com.conversormonedas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HistorialManager {

    private static final String ARCHIVO = "historial_conversiones.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardar(Conversion conversion) {
        try {
            List<Conversion> historial = obtenerHistorial();
            historial.add(conversion);

            FileWriter writer = new FileWriter(ARCHIVO);
            gson.toJson(historial, writer);
            writer.close();

        } catch (Exception e) {
            System.out.println("No se pudo guardar el historial: " + e.getMessage());
        }
    }

    public List<Conversion> obtenerHistorial() {
        try {
            FileReader reader = new FileReader(ARCHIVO);
            Conversion[] data = gson.fromJson(reader, Conversion[].class);
            reader.close();

            if (data != null) {
                List<Conversion> lista = new ArrayList<>();
                for (Conversion c : data) lista.add(c);
                return lista;
            }

        } catch (Exception ignored) {}

        return new ArrayList<>();
    }


    public int contar() {
        return obtenerHistorial().size();
    }


    public Optional<Conversion> ultima() {
        List<Conversion> historial = obtenerHistorial();
        if (historial.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(historial.get(historial.size() - 1));
    }
}
