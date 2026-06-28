package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        ServicioTuristico[] servicios = GestorServicios.crearServicios();

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}