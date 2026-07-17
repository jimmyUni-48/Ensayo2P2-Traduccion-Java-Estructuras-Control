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
public class ejercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese 1er valor: ");
        num1=sc.nextInt();
        System.out.println("Ingrese 2do valor: ");
        num2=sc.nextInt();
        
        System.out.println("La suma es: "+ (num1+num2));
        System.out.println("La resta es: "+ (num1-num2));
        System.out.println("La multiplicación es: "+ (num1*num2));
        System.out.println("La division es: "+(num1/num2));
        System.out.println("El residuo es: "+(num1 % num2));
    }
    
}
