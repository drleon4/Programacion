/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese Nombre: ");
            String nom[] = new String [i];
            nom[i] = a.nextLine();
            System.out.println("Ingrese monto Sueldo: ");
            double s [] = new double [i];
            s[i] = a.nextDouble();
            System.out.println("Ingrese monto de prestamo: ");
            double monto [] = new double [i];
            monto [i] = a.nextDouble();
            System.out.println("Ingrese valor de intereses");
            double inte [] = new double [i];
            inte[i] = a.nextDouble();
            System.out.println("Ingrese Tiempo de prestamo: ");
            int tiempo [] = new int [i];
            tiempo [i] = a.nextInt();
            System.out.println("Ingrese Tipo Vehiculo: ");
            int tipo [] = new int [i];
            tipo[i] = a.nextInt();
            System.out.println("Ingrese marca de Vehiculo: ");
            String marca = a.nextLine();
            PrestamoAutomovil p1 = new PrestamoAutomovil(nom[0], s, monto[0], inte[0], tiempo[0], tipo[0],g1 , marca, g2);
            PrestamoAutomovil p2 = new PrestamoAutomovil(nom[0], s, monto[1], inte[1], tiempo[1], tipo[1], g1, 0, mV, g2);
        }
        
        
        PrestamoEducativo e1 = new PrestamoEducativo(nom, 0, 0, 0, 0, g1, 0, nC, g2, g3);
        PrestamoEducativo e2 = new PrestamoEducativo(nom, 0, 0, 0, 0, g1, 0, nC, g2, g3);
        PrestamoEducativo e3 = new PrestamoEducativo(nom, 0, 0, 0, 0, g1, 0, nC, g2, g3);
    }
}
