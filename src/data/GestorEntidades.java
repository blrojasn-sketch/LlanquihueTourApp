package data;

import java.util.ArrayList;
import model.*;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public String mostrarEntidades() {

        String resultado = "";

        for (Registrable entidad : entidades) {

            resultado += entidad.mostrarResumen() + "\n";

            if (entidad instanceof GuiaTuristico) {
                resultado += "Tipo detectado: Guía Turístico\n";
            } else if (entidad instanceof Vehiculo) {
                resultado += "Tipo detectado: Vehículo\n";
            } else if (entidad instanceof ColaboradorExterno) {
                resultado += "Tipo detectado: Colaborador Externo\n";
            } else if (entidad instanceof ServicioTuristico) {
                resultado += "Tipo detectado: Servicio Turístico\n";
            }

            resultado += "----------------------\n";
        }

        return resultado;
    }
}