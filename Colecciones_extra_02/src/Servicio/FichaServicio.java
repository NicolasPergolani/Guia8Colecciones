/*
Implementa un clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que 
imprima el “seis-zero” como “6:0|” y con un método llamado “Ficha girarFicha()” que gire la 
ficha (el “6:0|” pasaría a ser “0:6|”). Implementa también el método “boolean esUnDoble()”. 
A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0 al 
doble MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al solitario, 
empezará por tirar el doble más grande e irá tirando fichas (las jugadas tienen que ser legales) 
hasta que haya tirado todas sus fichas (de su “mano” a la “mesa) o ya no pueda tirar ninguna 
ficha más. Tu ejecución puede ser diferente de las de los ejemplos dependiendo de cómo lo 
implementes.

 */
package Servicio;

import Entidad.Ficha;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class FichaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Ficha> mano = new ArrayList();
    ArrayList<Ficha> fichita = new ArrayList();

    public void fichas() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                Ficha f = new Ficha();
                if (i == 0) {
                    f.setLado1(i);
                    f.setLado2(j);
                    fichita.add(f);

                }
                if ((i == 1 && j > 0) || (i == 2 && j > 1) || (i == 3 && j > 2) || (i == 4 && j > 3) || (i == 5 && j > 4) || (i == 6 && j > 5)) {
                    f.setLado1(i);
                    f.setLado2(j);
                    fichita.add(f);

                }
            }

        }
        for (Ficha aux : fichita) {
            System.out.print(aux);
        }
    }

    public void girarFicha() {
        System.out.println("Que ficha quiere girar? por favor ingrese dos numeros ");
        int var1 = leer.nextInt();
        int var2 = leer.nextInt();

        for (Ficha aux : fichita) {
            if (var1 == aux.getLado1() && var2 == aux.getLado2()) {
                aux.setLado1(var2);
                aux.setLado2(var1);

            }

        }
    }

    public boolean esUnDoble() {

        int cont = 0;
        for (Ficha aux : mano) {
            if (aux.getLado1() == aux.getLado2()) {
                cont++;

            }

        }
        if (cont > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void generarMano() {

        int[] vectormano = new int[7];
        for (int i = 0; i < 7; i++) {
            vectormano[i] = (int) (Math.random() * fichita.size());
            for (int j = 0; j < i; j++) {
                if (vectormano[i] == vectormano[j]) {
                    i--;

                }

            }

        }
        System.out.println("    ");
        for (int i = 0; i < 7; i++) {
            System.out.println(vectormano[i]);

        }
        int cont = 0;
        for (int i : vectormano) {
            mano.add(fichita.get(vectormano[cont]));

            cont++;

        }
        fichita.removeAll(mano);
        System.out.println("--------------Las fichas en mano son:--------------");
        for (Ficha aux : mano) {
            System.out.println(aux);

        }
        System.out.println(fichita.size());

    }

    public void primeraBajada() {

//        generarMano();
//        System.out.println("--------------Las Fichas en poso son:--------------");
//        for (Ficha aux : fichita) {
//            System.out.println(aux);
    }

}
