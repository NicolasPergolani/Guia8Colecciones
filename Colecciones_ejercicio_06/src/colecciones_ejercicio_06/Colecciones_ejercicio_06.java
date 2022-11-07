/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colecciones_ejercicio_06;

import Servicio.ServicioTienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Colecciones_ejercicio_06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTienda st = new ServicioTienda();
        int opcion=0;
       
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Opcion 1: Cargar productos");
            System.out.println("2 - Opcion 2: Modificar Precio");
            System.out.println("3 - Opcion 3: Eliminar Producto");
            System.out.println("4 - Opcion 4: Mostrar Productos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    st.cargarProductos();
                    break;
                case 2:
                     st.modificarPrecio();
                    break;
                case 3:
                    st.eliminarProducto();
                    break;
                case 4:
                    st.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

}
