package model;

public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String especialidad;

    public ColaboradorExterno(String nombre,
                              String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador: " + nombre
                + " | Especialidad: " + especialidad;
    }
}