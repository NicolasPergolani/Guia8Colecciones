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
package ServicioAlumno;

import Entidad.Alumno;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Alumno a = new Alumno();

    public void crearAlumno(ArrayList Alumno) {
        String opcion = "";
        int cont = 1;
        System.out.println("Ingrese el primer alumno");
        do {

            System.out.println("Ingrese el nombre del alumno numero: " + cont);
            a.setNombrre(leer.next());
            System.out.println("Ingrese la primera nota");
            a.setNot1(leer.nextInt());
            System.out.println("Ingrese la segunda nota");
            a.setNot2(leer.nextInt());
            System.out.println("Ingrese la tercera nota");
            a.setNot3(leer.nextInt());

            Alumno.add(new Alumno(a.getNombrre(), a.getNot1(), a.getNot2(), a.getNot3()));

            System.out.println("Desea salir? para salir presione S. Para seguir agregando alumnos"
                    + "presione N");
            opcion = leer.next();
            cont++;
        } while (!opcion.equalsIgnoreCase("s"));

    }

    public double notaFinal(int not1, int not2, int not3) {
        double notFinal;
        notFinal = (not1 + not2 + not3) / 3.0;
        return notFinal;
    }

}
