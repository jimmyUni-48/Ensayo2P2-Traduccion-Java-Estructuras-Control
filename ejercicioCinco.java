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
public class ejercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double calificacion;
        System.out.println("Escriba la calificación: ");
        calificacion = sc.nextDouble();
        
        if (calificacion <= 4.99) 
        {
            System.out.println("Deficiente");
        } 
        else 
        { 
            if (calificacion <= 6.99) 
            { 
                System.out.println("Regular"); 
            } 
            else 
            { 
                if (calificacion <= 7.99) 
                {
                    System.out.println("Bueno");
                } else 
                {
                    if (calificacion <= 8.99) 
                    {
                        System.out.println("Muy Bueno");
                    } else 
                    {
                        if (calificacion <= 10) 
                        {
                            System.out.println("Excelente");
                        }
                    }
                }
            }
        }
    }
    
    
}
