package com.conversormonedas;

public class Conversion {

    private String monedaOrigen;
    private String monedaDestino;
    private double monto;
    private double resultado;
    private String fechaHora;

    public Conversion(String origen, String destino, double monto, double resultado, String fechaHora) {
        this.monedaOrigen = origen;
        this.monedaDestino = destino;
        this.monto = monto;
        this.resultado = resultado;
        this.fechaHora = fechaHora;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public double getResultado() {
        return resultado;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return monedaOrigen + " → " + monedaDestino +
                " | " + monto + " → " + resultado +
                " (" + fechaHora + ")";
    }
}
