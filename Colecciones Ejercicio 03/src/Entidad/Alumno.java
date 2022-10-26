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
package Entidad;



/**
 *
 * @author Pergo
 */
public class Alumno {
    private String nombrre;
    private Integer not1, not2, not3;

    public Alumno() {
    }

    public Alumno(String nombrre, Integer not1, Integer not2, Integer not3) {
        this.nombrre = nombrre;
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public String getNombrre() {
        return nombrre;
    }

    public void setNombrre(String nombrre) {
        this.nombrre = nombrre;
    }

    public Integer getNot1() {
        return not1;
    }

    public void setNot1(Integer not1) {
        this.not1 = not1;
    }

    public Integer getNot2() {
        return not2;
    }

    public void setNot2(Integer not2) {
        this.not2 = not2;
    }

    public Integer getNot3() {
        return not3;
    }

    public void setNot3(Integer not3) {
        this.not3 = not3;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombrre=" + nombrre + ", not1=" + not1 + ", not2=" + not2 + ", not3=" + not3 + '}';
    }
  
    
}
