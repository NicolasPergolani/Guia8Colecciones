/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Pergo
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracionMayaMen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getHoras().compareTo(t.getHoras());

        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionMenaMay = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHoras().compareTo(t1.getHoras());

        }
    };
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
    };
     public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
            
        }
    };
    
}
