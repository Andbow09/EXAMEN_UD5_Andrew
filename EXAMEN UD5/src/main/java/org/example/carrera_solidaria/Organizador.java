package org.example.carrera_solidaria;

import java.util.ArrayList;

/**
 * Clase Organizador, tiene nombre (siempre IES Mutxamel),
 * edición y lista de corredores.
 */
public class Organizador {
    private final String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    /**
     * Constructor de Organizador donde definimos la edición a la que pertenece
     * e inicializamos la lista de corredores, por defecto vacía.
     * @param edicion
     */
    public Organizador(String edicion) {
        this.nombre = "IES Mutxamel";
        this.edicion = edicion;
        this.listaCorredores = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del organizador
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para agregar corredores, si el tamaño de la lista de corredores
     * supera los 700, no agregará más corredores.
     * @param corredor
     */
    public void inscribirCorredor(Corredor corredor) {
        if (listaCorredores.size() <= 700) {
            listaCorredores.add(corredor);
            System.out.println("Inscripción realizada. Corredor: " + corredor.getNombre() + " con dorsal " + corredor.getDorsal() + ".");
        } else {
            return;
        }
    }

    /**
     * mostramos todos los corredores pertenecientes al organizador,
     * tendremos en cuenta la longitud de la lista para ello
     */
    public void mostrarCorredores() {
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        for (int i = 0; i < listaCorredores.size(); i++) {
            System.out.println("[" + (i + 1) + "]. " + listaCorredores.get(i));
        }
    }

    /**
     * con este metodo clacularemos las ganacias por corredor teniendo
     * en cuenta el total de vueltas dadas y su valor por vuelta.
     * Estas se multiplicarán y darán el total
     * @param corredor
     */
    public void calcularDonacion(Corredor corredor) {
        double donacion = (corredor.getVueltas_completadas() * corredor.getImporte_vuelta());
        System.out.println("El corredor " + corredor.getNombre() + " ha conseguido una donación de " + donacion + "€");
    }

    /**
     * Editamos el toString para que nos muestre todos los datos del organizador
     * @return
     */
    @Override
    public String toString() {
        return "Organizador [Nombre= " + nombre + ", Edición= " + edicion + ", listaCorredores= " + listaCorredores + "]";
    }
}
