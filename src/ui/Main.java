package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        String nombreGuia = JOptionPane.showInputDialog(
                "Ingrese nombre del guía turístico:");

        String idioma = JOptionPane.showInputDialog(
                "Ingrese idioma del guía:");

        gestor.agregarEntidad(
                new GuiaTuristico(nombreGuia, idioma));

        String patente = JOptionPane.showInputDialog(
                "Ingrese patente del vehículo:");

        int capacidad = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese capacidad del vehículo:"));

        gestor.agregarEntidad(
                new Vehiculo(patente, capacidad));

        JOptionPane.showMessageDialog(
                null,
                gestor.mostrarEntidades(),
                "Resumen de Entidades",
                JOptionPane.INFORMATION_MESSAGE);
    }
}