package org.example.carrera_solidaria;

import java.util.ArrayList;

/**
 * Clase Corredor, tiene un nombre, un dorsal que se autoincrementa con cada iteración,
 * una lista de patrocinadores, un importe por vuelta completada y un total de vueltas completadas.
 */
public class Corredor {
    private String nombre;
    private static int dorsal = 0;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta = 0;
    private int vueltas_completadas;

    /**
     * Constructor de Corredor, donde definiremos el nombre del corredor y su importe por vuelta,
     * por defecto, se creará una lista vacía para la lista de patrocinios y las vueltas totales serán cero.
     * @param nombre
     * @param importe_vuelta
     */
    public Corredor(String nombre, double importe_vuelta) {
        this.nombre = nombre;
        this.dorsal++;
        this.listaPatrocinadores = new ArrayList<>();
        this.importe_vuelta = importe_vuelta;
        this.vueltas_completadas = 0;
    }

    /**
     * devuelve el nombre del corredor
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * actualiza el nombre del corredor
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de dorsal de corredor
     * @return
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * devuelve la lista de patrocinadores
     * @return
     */
    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    /**
     * devuelve el importe por vuelta realizada
     * @return
     */
    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    /**
     * actualiza el importe por vuelta
     * @param importe_vuelta
     */
    public void setImporte_vuelta(double importe_vuelta) {
        this.importe_vuelta = importe_vuelta;
    }

    /**
     * devuelve el total de vueltas realizadas
     * @return
     */
    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    /**
     * actualiza el total de vueltas realizadas
     * @param vueltas_completadas
     */
    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

    /**
     * añade un patrocinador a la lista de patrocinadores
     * @param patrocinador
     */
    public void insertarPatrocinador(String patrocinador) {
        listaPatrocinadores.add(patrocinador);
        System.out.println("Nuevos patrocinadores añadidos para el corredor " + getNombre() + ".");
    }

    /**
     * Actualiszamos el toString de Corredor para que nos devuelva toda la información de un corredor
     * @return
     */
    @Override
    public String toString() {
        return "Corredor [Nombre= " + nombre + ", Dorsal= " + dorsal + ", listaPatrocinadores= " + listaPatrocinadores + ", importe_vuelta= " + importe_vuelta + ", vueltas_completadas= " + vueltas_completadas + "]";
    }
}
