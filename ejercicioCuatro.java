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
public class ejercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese nota del estudiante: ");
        nota = sc.nextDouble();
        if (nota >= 7) 
        {
            System.out.println("Aprobado");
            
        } else {
            System.out.println("Reprobado");
        }
    }
    
}
