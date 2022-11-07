package colecciones_ejercicio_04;

//@author Facundo Cruz
import Comparadores.Comparadores;
import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.Collections;

public class Colecciones_ejercicio_04 {

    public static void main(String[] args) {
        PeliculaService sv = new PeliculaService();
        ArrayList<Pelicula> lista = new ArrayList();
        sv.crearPelicula(lista);
        System.out.println("Peliculas con duracion mayor a 1 hora");
        for (Pelicula aux : lista) {
            if (aux.getHoras()>1) {
                System.out.println(aux); 
            }
           
        }
        
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println("---------De Mayor a Menor---------");
        Collections.sort(lista, Comparadores.ordenarPorDuracionMayaMen);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println("---------De Menor a Mayor---------");
        Collections.sort(lista, Comparadores.ordenarPorDuracionMenaMay);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println("---------Por Titulo---------");
        Collections.sort(lista, Comparadores.ordenarPorTitulo);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println("---------Por Director---------");
        Collections.sort(lista, Comparadores.ordenarPorDirector);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }

}
