/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> tiendita = new HashMap();

    public void cargarProductos() {
        String opc = "";

        do {
            Tienda t = new Tienda();
            System.out.println("Ingrese el nombre del producto");
            t.setProducto(leer.next());
            System.out.println("Ingrese el precio del producto");
            t.setPrecio(leer.nextInt());
            tiendita.put(t.getProducto(), t.getPrecio());
            System.out.println("Desea agregar otro producto? (Si/No)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));
    }

    public void modificarPrecio() {
        if (tiendita.isEmpty()) {
           System.out.println("No hay nada cargado aun vaya a la opcion 1");

        } else {
            System.out.println("Que producto desea modificar: ");
            String opc1 = leer.next();
            int cont = 0;
            for (Map.Entry<String, Integer> aux : tiendita.entrySet()) {
                if (aux.getKey().equalsIgnoreCase(opc1)) {
                    System.out.println("El precio actual del producto es de: " + aux.getValue());
                    System.out.println("Cual es el precio nuevo ?");
                    Object value = aux.setValue(leer.nextInt());
                    cont++;
                }

            }
            if (cont == 0) {
                System.out.println("No se encontro el producto en el listado");

            }
        }

    }

    public void eliminarProducto() {
        if (tiendita.size()==0) {
            System.out.println("No hay nada cargado aun vaya a la opcion 1");

        } else {
            System.out.println("Que producto desea eliminar");
            String opc2 = leer.next();
            if (tiendita.containsKey(opc2)) {
                System.out.println("Se elminira el producto: " + opc2);
                tiendita.remove(opc2);
            } else {
                System.out.println("No se encontro el producto");
            }
        }

    }

    public void mostrarProductos() {
        if (tiendita.isEmpty()) {
           System.out.println("No hay nada cargado aun vaya a la opcion 1");

        } else {
            System.out.println("El listado de productos es el siguiente: ");
            System.out.println("-------------------------------------------");
            for (Map.Entry<String, Integer> aux : tiendita.entrySet()) {
                System.out.println("Producto: " + aux.getKey());
                System.out.println("Precio: " + aux.getValue());

            }
        }

    }
}
