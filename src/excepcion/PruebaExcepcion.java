/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Acosta
 */
public class PruebaExcepcion {

    public static void main(String args[]) throws NumeroMenorExcepcion {
        //formatoNumero();
        //desborde();
        //aritmetico();
        punto5();
    }

//excepción sin tratar 
    public static void formatoNumero() {

        int numero;
        String cadena = "  1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());

        }
    }

    public static void desborde() {

        int v[] = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El arreglo se desbordo");
        }

    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division por 0");
        }
    }

    public static void punto5() throws NumeroMenorExcepcion {
        Scanner cin = new Scanner(System.in);

        int a, b;
        double c = 0;
        try {
            System.out.println("Ingrese un numero: ");
            a = cin.nextInt();
            System.out.println("Ingrese el divisor: ");
            b = cin.nextInt();

            c = a / b;

            if (c < 10) {
                throw new NumeroMenorExcepcion();
            }

        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un entero.");
        } catch (ArithmeticException e) {
            System.out.println("Division por 0");
        } catch (NumeroMenorExcepcion ex) {
            //System.out.println("Resultado menor a 10");
            System.out.println(ex.getMessage());
        }

        System.out.println("Resultado = " + c);

    }

}
