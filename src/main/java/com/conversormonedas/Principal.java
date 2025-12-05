package com.conversormonedas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExchangeRateClient cliente = new ExchangeRateClient();
        Conversor conversor = new Conversor();
        HistorialManager historial = new HistorialManager();

        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("     🌎 BIENVENIDO AL CONVERSOR PLUS 🌎");
        System.out.println("═══════════════════════════════════════════");

        while (true) {


            System.out.println("""
                    
                    ╔══════════════════════════════════════╗
                    ║          💱  MENÚ PRINCIPAL          ║
                    ╠══════════════════════════════════════╣
                    ║ Ingresá la moneda ORIGEN (ej: USD)   ║
                    ║ Escribí 100 para salir del sistema   ║
                    ╚══════════════════════════════════════╝
                    """);

            System.out.print("👉 Moneda ORIGEN: ");
            String origen = sc.nextLine().toUpperCase();

            if (origen.equals("100")) {
                System.out.println("\n¡¡¡ Gracias por usar el convertidor de monedas PLUS !!!");
                break;
            }

            System.out.print("👉 Moneda DESTINO: ");
            String destino = sc.nextLine().toUpperCase();

            System.out.print("👉 Monto a convertir: ");
            double monto;

            try {
                monto = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Valor no válido... ingrese un número.");
                continue;
            }

            try {
                String json = cliente.obtenerTasas(origen);
                double resultado = conversor.convertir(json, destino, monto);


                System.out.println("""
                        
                        ╔══════════════════════════════════════════╗
                        ║           📈 RESULTADO FINAL             ║
                        ╠══════════════════════════════════════════╣
                        """);

                System.out.printf("   💵  Origen:  %s%n", origen);
                System.out.printf("   💸  Destino: %s%n", destino);
                System.out.printf("   🔢  Monto:   %.2f%n", monto);
                System.out.printf("   💰  Total:   %.4f%n", resultado);

                System.out.println("""
                        ╚══════════════════════════════════════════╝
                        """);


                historial.guardar(
                        new Conversion(
                                origen,
                                destino,
                                monto,
                                resultado,
                                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                        )
                );

            } catch (Exception e) {
                System.out.println("❌ Error conectando con la API: " + e.getMessage());
            }
        }
    }
}
