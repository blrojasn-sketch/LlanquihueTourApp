package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Ruta del archivo
        String ruta = "resources/tours.txt";

        GestorDatos gestor = new GestorDatos();

        // Cargar datos
        ArrayList<Tour> tours = gestor.cargarTours(ruta);

        // 1. Mostrar todos los tours
        System.out.println("=== LISTA DE TOURS ===");
        for (Tour t : tours) {
            System.out.println(t);
        }

        // 2. Filtrar tours (precio > 12000)
        System.out.println("\n=== TOURS CON PRECIO MAYOR A 12000 ===");

        for (Tour t : tours) {
            if (t.getPrecio() > 12000) {
                System.out.println(t);
            }
        }

        // 3. Filtrar por tipo "aventura"
        System.out.println("\n=== TOURS DE AVENTURA ===");

        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase("aventura")) {
                System.out.println(t);
            }
        }
        // 3. Filtrar por tipo "cultural"
        System.out.println("\n=== TOURS CULTURAL ===");

        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase("cultural")) {
                System.out.println(t);
            }
        }
    }
}