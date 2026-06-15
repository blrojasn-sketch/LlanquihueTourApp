package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                if (partes.length == 4) {
                    String nombre = partes[0];
                    String lugar = partes[1];
                    String tipo = partes[2];
                    int precio = Integer.parseInt(partes[3]);

                    Tour tour = new Tour(nombre, lugar, tipo, precio);

                    listaTours.add(tour);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}