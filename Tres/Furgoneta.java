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
public class Furgoneta extends Vehiculos{
    public Furgoneta(String ma, String c, String mar, int dias){
        super(c, c, mar, dias);
    }
    
    public double obtener_precio_alquiler(){
        return ((50 * getDiasAlquiler()) + 100);
    }
    
    @Override 
    public String toString(){
        return String.format("%s", super.toString());
    }
}
