package data;

import model.*;

public class GestorServicios {

    public static ServicioTuristico[] crearServicios() {

        ServicioTuristico[] servicios = new ServicioTuristico[6];

        servicios[0] = new RutaGastronomica("Ruta del Salmón", 4, 5);

        servicios[1] = new RutaGastronomica("Sabores del Sur", 3, 4);

        servicios[2] = new PaseoLacustre("Lago Llanquihue", 2, "Lancha");

        servicios[3] = new PaseoLacustre("Tour Frutillar", 3, "Catamarán");

        servicios[4] = new ExcursionCultural("Museo Alemán", 2, "Frutillar");

        servicios[5] = new ExcursionCultural("Iglesias Patrimoniales", 5, "Chiloé");

        return servicios;
    }
}




