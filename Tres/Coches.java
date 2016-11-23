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
public class Coches extends Vehiculos{
    private int numPasajeros;

    public Coches(String m, String c, String mar, int dia, int numP){
        super(m, c, mar, dia);
        setNumPasajeros(numP);
    }
     
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    public double obtener_precio_alquiler(){
        return (50 * getDiasAlquiler()) + (5 * getNumPasajeros());
    }
    
    @Override
    public String toString(){
        return String.format("%sNumero Pasajeros: ", super.toString(), getNumPasajeros());
                
    }
}
