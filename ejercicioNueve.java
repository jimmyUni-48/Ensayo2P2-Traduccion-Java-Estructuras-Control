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
public class ejercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserte numero para multiplicar: ");
        num = sc.nextInt();
        for (int i = 1; i <= 12; i++) 
        {
            System.out.println("La multiplicacion de "+ num +" * "+i+" = "+(num*i));
        }
    }
    
}
