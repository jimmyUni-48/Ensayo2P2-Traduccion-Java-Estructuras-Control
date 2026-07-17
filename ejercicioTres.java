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
public class ejercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad >= 18) 
        { 
            System.out.println("Es mayor de edad");
        }
    }
    
}
