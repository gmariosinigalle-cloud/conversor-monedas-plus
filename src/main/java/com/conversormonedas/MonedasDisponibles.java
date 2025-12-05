package com.conversormonedas;

import java.util.LinkedHashMap;
import java.util.Map;

public class MonedasDisponibles {

    public static final Map<Integer, MonedaInfo> MONEDAS = new LinkedHashMap<>();

    static {
        MONEDAS.put(1,  new MonedaInfo("USD", "🇺🇸", "Dólar estadounidense"));
        MONEDAS.put(2,  new MonedaInfo("EUR", "🇪🇺", "Euro"));
        MONEDAS.put(3,  new MonedaInfo("ARS", "🇦🇷", "Peso argentino"));
        MONEDAS.put(4,  new MonedaInfo("BRL", "🇧🇷", "Real brasileño"));
        MONEDAS.put(5,  new MonedaInfo("CLP", "🇨🇱", "Peso chileno"));
        MONEDAS.put(6,  new MonedaInfo("MXN", "🇲🇽", "Peso mexicano"));
        MONEDAS.put(7,  new MonedaInfo("GBP", "🇬🇧", "Libra esterlina"));
        MONEDAS.put(8,  new MonedaInfo("JPY", "🇯🇵", "Yen japonés"));
        MONEDAS.put(9,  new MonedaInfo("CNY", "🇨🇳", "Yuan chino"));
        MONEDAS.put(10, new MonedaInfo("CAD", "🇨🇦", "Dólar canadiense"));

        // +20 monedas nuevas
        MONEDAS.put(11, new MonedaInfo("AUD", "🇦🇺", "Dólar australiano"));
        MONEDAS.put(12, new MonedaInfo("NZD", "🇳🇿", "Dólar neozelandés"));
        MONEDAS.put(13, new MonedaInfo("CHF", "🇨🇭", "Franco suizo"));
        MONEDAS.put(14, new MonedaInfo("SEK", "🇸🇪", "Corona sueca"));
        MONEDAS.put(15, new MonedaInfo("NOK", "🇳🇴", "Corona noruega"));
        MONEDAS.put(16, new MonedaInfo("DKK", "🇩🇰", "Corona danesa"));
        MONEDAS.put(17, new MonedaInfo("INR", "🇮🇳", "Rupia india"));
        MONEDAS.put(18, new MonedaInfo("RUB", "🇷🇺", "Rublo ruso"));
        MONEDAS.put(19, new MonedaInfo("ZAR", "🇿🇦", "Rand sudafricano"));
        MONEDAS.put(20, new MonedaInfo("KRW", "🇰🇷", "Won surcoreano"));
        MONEDAS.put(21, new MonedaInfo("SGD", "🇸🇬", "Dólar singapurense"));
        MONEDAS.put(22, new MonedaInfo("HKD", "🇭🇰", "Dólar hongkonés"));
        MONEDAS.put(23, new MonedaInfo("TRY", "🇹🇷", "Lira turca"));
        MONEDAS.put(24, new MonedaInfo("AED", "🇦🇪", "Dirham"));
        MONEDAS.put(25, new MonedaInfo("SAR", "🇸🇦", "Riyal saudí"));
        MONEDAS.put(26, new MonedaInfo("ILS", "🇮🇱", "Shekel israelí"));
        MONEDAS.put(27, new MonedaInfo("PLN", "🇵🇱", "Zloty polaco"));
        MONEDAS.put(28, new MonedaInfo("HUF", "🇭🇺", "Forint húngaro"));
        MONEDAS.put(29, new MonedaInfo("CZK", "🇨🇿", "Corona checa"));
        MONEDAS.put(30, new MonedaInfo("PEN", "🇵🇪", "Sol peruano"));
    }

    public record MonedaInfo(String codigo, String bandera, String nombre) {}
}
