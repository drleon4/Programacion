/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author danileo001__#16
 */
public class Ejecutor {
    public static void main(String[] args) {
        Camiones c = new Camiones("ABC-1020", "Blanco", "Hino", 4, 150);
        Coches co = new Coches("LVA-1234", "Azul", "Mazda", 10, 50);
        Furgoneta f = new Furgoneta("PGF-4521", "Dorado", "HYUNDAI", 23);
        Microbuses m = new Microbuses("GYU-3245", "Amarillo", "Mitsubishi", 15, 75);
         
        
        Vehiculos vh [] = new Vehiculos[4];
        
        vh [0] = c;
        vh [1] = co;
        vh [2] = f;
        vh [3] = m;
        
        int i = 1;
        for (Vehiculos vehiculos : vh) {
            System.out.printf("\tVEHICULO -> [%d]\n%s\nPrecio de alquiler: %.2f\n",i, vehiculos, vehiculos.obtener_precio_alquiler());
            System.out.println("*****************************************");
            i++;
        }   
    }
}
