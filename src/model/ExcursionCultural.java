package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Excursión Cultural ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Lugar histórico: " + lugarHistorico);
        System.out.println();
    }
}