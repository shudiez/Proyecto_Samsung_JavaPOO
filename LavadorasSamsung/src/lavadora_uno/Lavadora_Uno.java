package lavadora_uno;

import Libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - Ropa blanca / 2 - Ropa color ");

        int TipoDeRopa = entrada.nextInt();

        System.out.println("¿Cuántos kilos de ropa? ");
        int kilos = entrada.nextInt();

        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();

    }
}
