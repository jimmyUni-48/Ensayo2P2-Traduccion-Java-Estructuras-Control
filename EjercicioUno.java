/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ensayodospdos;
import java.util.Scanner;
/**
 *
 * @author jimmy
 */
public class EjercicioUno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, carrera;
        int edad;
        double estatura;
        System.out.println("Ingrese nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese carrera: ");
        carrera = sc.next();
        System.out.println("Ingrese edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese estatura: ");
        estatura = sc.nextDouble();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: "+ carrera);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
        
    }
}
