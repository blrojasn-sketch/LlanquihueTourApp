package data;

import java.util.ArrayList;
import java.util.List;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    public List<ServicioTuristico> obtenerServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Sabores de Llanquihue", 4, 5));

        servicios.add(new RutaGastronomica(
                "Ruta del Salmón", 3, 4));

        servicios.add(new PaseoLacustre(
                "Tour Lago Llanquihue", 2, "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Navegación Frutillar", 3, "Lancha"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial Alemán", 2, "Frutillar"));

        servicios.add(new ExcursionCultural(
                "Iglesias Patrimoniales", 5, "Chiloé"));

        return servicios;
    }
}



