/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ensayodospdos;
import java.util.Scanner;
/**
 *
 * @author Jimmy Mijhail Moran Correa
 */
public class ejercicioSiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, contador, suma;
        suma = 0;
        contador = 0;
        System.out.println("Ingrese un numero positivo: ");
        numero = sc.nextInt();
        while(numero>=0)
        {
            contador = contador+1;
            suma = suma + numero;
            System.out.println("Ingrese un numero positivo: ");
            numero = sc.nextInt();
        }
        System.out.println("Numeros ingresados: "+contador);
        System.out.println("Suma total de los numeros: "+ suma);
    }
    
}
