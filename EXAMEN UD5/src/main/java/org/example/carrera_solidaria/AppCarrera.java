package org.example.carrera_solidaria;

/**
 * Clase principal AppCarrera, donde hacemos las pruebas necesarias
 * para comprobar el funcionamiento de las clases
 */
public class AppCarrera {
    public static void main(String[] args) {
        Organizador org = new Organizador("I");
        //Creamos un organizador con su edición número I
        System.out.println(org);

        Corredor corr = new Corredor("Alberto",3.9);
        //añadimos un corredor de nombre alberto y con importe por vuelta de 3.9
        System.out.println(corr);

        org.inscribirCorredor(corr); //inscribimos al corredor al organizador
        corr.insertarPatrocinador("mama");
        corr.insertarPatrocinador("papa");
        corr.insertarPatrocinador("ferretería");
        //insertamos diferentes patrocinadores para nuestro corredor
        System.out.println(corr);

        Corredor corr2 = new Corredor("Peponcio",1.3);
        //creamos un nuevo corredor de nombre peponcio e importe por vuelta de 1.3
        System.out.println(corr2);
        org.inscribirCorredor(corr2);
        //inscribimos a peponcio al organizador

        System.out.println(org);

        org.mostrarCorredores();
        //mostramos los corredores del organizador

        corr.setVueltas_completadas(20);
        //actualizamos el número de vueltas completadas de alberto a 20
        org.calcularDonacion(corr);
        //calculamos el total ganado por alberto teniendo en cuenta
        //el numero de vueltas realizadas e importe por vuelta
    }
}
