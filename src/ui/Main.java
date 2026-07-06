package ui;

import java.util.List;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        List<ServicioTuristico> servicios =
                gestor.obtenerServicios();

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}