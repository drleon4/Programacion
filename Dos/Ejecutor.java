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
        
        
        Garante g1 = new Garante("Luis", "Alvarez", 135);
        Garante g2 = new Garante("Enrique", "Peñanieto", 890);
        Garante g3 = new Garante("Michael", "Ramon", 420);
        
        PrestamoAutomovil p1 = new PrestamoAutomovil("Danilo", 450, 250, 20, 10, g1, 4, "Chevrolet", g2);
        PrestamoAutomovil p2 = new PrestamoAutomovil("Marco", 560, 320, 56, 13, g1, 6, "Mazda", g2);
        
        PrestamoEducativo e1 = new PrestamoEducativo("Maria", 230, 230, 15, 20, g1, 4, "CAMPUS", g2, g3);
        PrestamoEducativo e2 = new PrestamoEducativo("Stefania", 4621, 452, 10, 30, g1, 3, "SANTJORDI", g2, g3);
        PrestamoEducativo e3 = new PrestamoEducativo("Daniela", 364, 560, 12, 5, g1, 4, "LA GARITA", g2, g3);
        
        Prestamo pres1 [] = new Prestamo[2];
        
        pres1 [0] = p1;
        pres1 [1] = p2;
        
        
        Prestamo pres2 [] = new Prestamo[3];
        
        pres2 [0] = e1;
        pres2 [1] = e2;
        pres2 [2] = e3;
        
        int i = 1;
        for (Prestamo pre1 : pres1) {
            System.out.printf("\n\tPRESTAMO AUTOMOVIL [%d]: \n\n%sTotal intereses: %.2f\n",i, pre1, pre1.total_vehiculo());
            i++;
        }
        
        System.out.println("\n\n*****************************************************");
        
        i = 1;
        for (Prestamo pre2 : pres2) {
            System.out.printf("\n\tPRESTAMO EDUCATIVO [%d]: \n\n%sTotal intereses: %.2f\n",i, pre2, pre2.total_vehiculo());
            i++;
        }
    }
}
