package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Ruta Gastronómica ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
        System.out.println();
    }
}