/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


//@author Facundo Cruz

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPelicula(ArrayList lista){
        String opc = "";
        do {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el nombre de la película");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la película");
            p.setHoras(leer.nextDouble());
            lista.add(p);
            System.out.println("Queres cargar otra peli?(S para salir)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("S")); 
    }
    
    
    
}
