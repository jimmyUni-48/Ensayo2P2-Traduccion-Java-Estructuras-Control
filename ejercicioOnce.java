/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ensayodospdos;
import java.util.Scanner;
/**
 *
 * @author jimmy
 */
public class ejercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el número 1: ");
        int numero = teclado.nextInt();
        
        int mayor = numero;
        int menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
    
}
