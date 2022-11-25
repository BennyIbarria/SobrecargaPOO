package org.BenyIbarr.poosobrecarga;
import static org.BenyIbarr.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga
{
    public static void main(String[] args)
    {

        System.out.println("Sumar dos números enteros" + sumar(10,5));
        System.out.println("Sumar flotantes: " +  sumar(7.0f,4.5f));
        System.out.println("Sumar flotante y entero: " + sumar(15.8f,4));
        System.out.println("Sumar integer y float: " + sumar(5,10f));
        System.out.println("Sumar double: "+ sumar(16.0,5.0));
        System.out.println("sumar Strings: " + sumar("7","6"));
        System.out.println("Sumar tres valores: " + sumar(6,7,8));

        System.out.println("Sumar Long: " + sumar(10L, 15L));
        System.out.println("Sumar enteros: " + sumar(10,'@'));
        System.out.println("Sumar float e integer: " + sumar(10F, '@'));

        //Haciendo sobrecarga con el método varargs para sumar enteros
        System.out.println("La suma de 5 elementos es: "  + sumar(3,4,5,6,7));
        //Haciendo sobrecarga con el método varargs para sumar flotantes y enteros
        System.out.println("Sumar un float con n enteros: " + sumar(10.0f, 3,4,5,6,7,8));
        //Haciendo sobrecarga con el método varargs para sumar enteros
        System.out.println("Sumar n cantidad de doubles: " + sumar(10.0D,4.0D,6.7D,8.0D,10.8D));
    }
}
