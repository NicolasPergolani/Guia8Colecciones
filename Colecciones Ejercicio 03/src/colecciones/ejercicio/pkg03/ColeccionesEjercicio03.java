/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package colecciones.ejercicio.pkg03;

import Entidad.Alumno;
import ServicioAlumno.ServicioAlumno;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ColeccionesEjercicio03 {

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.##");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno a = new ServicioAlumno();
        ArrayList<Alumno> Alumno = new ArrayList();
        a.crearAlumno(Alumno);
        int cont1 = 0;
        String opcion = "";

        do {
            System.out.println("Ingrese el nombre del alumno del cual desea saber la nota final");
            String alum = leer.next();
            for (Alumno aux : Alumno) {
                if (aux.getNombrre().equalsIgnoreCase(alum)) {
                    System.out.println("Calcularemos la nota final de el alumno: " + aux.getNombrre());
                    System.out.println("La nota final de este alumno es de " + df.format(a.notaFinal(aux.getNot1(), aux.getNot2(), aux.getNot3())));
                    cont1++;
                    break;

                }
            }
            if (cont1 == 0) {
                System.out.println("No se encontro el alumno");
            }
            System.out.println("Desea consultar por otro alumno, Si/No");
            opcion = leer.next();
            cont1 = 0;

        } while (!opcion.equalsIgnoreCase("no"));
        System.out.println("Gracias vuelva Prontos!!!");
    }

}
