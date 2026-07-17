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
public class ejercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num, sum;
        double prom;
        sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese numero "+ (i+1)+" entero:" );
            num = sc.nextInt();
            sum = sum + num;
        }
        prom = sum / 10;
        System.out.println("La suma es: "+ sum);
        System.out.println("El promedio es: "+ prom);
    }
    
}
