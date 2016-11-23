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
            System.out.println("Ingrese Docente Progrmacion: ");
            String dp = a.nextLine();
            System.out.println("Ingrese Docente Base de datos: ");
            String dbd = a.nextLine();
            
            Alumno al = new Alumno(nom, ap , dp, dbd);
            
            System.out.println("*********************************");
            System.out.println("Ingrese nombre docente: ");
            String nd = a.nextLine();
            System.out.println("Ingrese apellido docente: ");
            String apd = a.nextLine();
            System.out.println("Ingrese Titulo docente: ");
            String titulo = a.nextLine();
            Docente d = new Docente(nd, apd, titulo);
            
            System.out.println(al);
            System.out.println(d);
            
            System.out.println("Desea ingresar mas alumnos ?\n1) SI - 2) NO");
            num = a.nextInt();
            a.nextLine();
        } while ( num != 2);
    }
}
