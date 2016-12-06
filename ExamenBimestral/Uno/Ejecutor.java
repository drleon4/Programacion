/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = 1; 
       
        do { 
            System.out.println("Ingrese Alumno: ");
            String nom = a.nextLine();
            System.out.println("Ingrese Apelldio Alum: ");
            String ap = a.nextLine();
            
            System.out.println("****************************************");
            System.out.println("Ingrese Nombre Docente Progrmacion: ");
            String dp = a.nextLine();
            System.out.println("Ingrese apellido docente P: ");
            String apd = a.nextLine();
            System.out.println("Ingrese Titulo docente P: ");
            String titulo = a.nextLine();
            Docente d = new Docente(dp, apd, titulo);
            
            System.out.println("****************************************");
            System.out.println("Ingrese nombre docente Base de Datos: ");
            String nd = a.nextLine();
            System.out.println("Ingrese apellido docente P: ");
            String apdB = a.nextLine();
            System.out.println("Ingrese Titulo docente P: ");
            String tituloB = a.nextLine();
            Docente d1 = new Docente(nd, apdB, tituloB);
            
            Alumno al = new Alumno(nom, ap , d, d1);
            System.out.printf("%s\n",al);
            
            System.out.println("\nDesea ingresar mas alumnos ?\n1) SI - 2) NO");
            num = a.nextInt();
            a.nextLine();
        } while ( num != 2);
    }
}
