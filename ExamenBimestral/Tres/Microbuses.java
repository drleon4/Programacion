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
public class Microbuses extends Vehiculos{
    private int numRutasD;

    public Microbuses(String m, String c, String mar, int dia, int num){
        super(m, c, mar, dia);
        setNumRutasD(num);
    }
    
    public int getNumRutasD() {
        return numRutasD;
    }

    public void setNumRutasD(int numRutasD) {
        this.numRutasD = numRutasD;
    }
    
    public double obtener_precio_alquiler(){
        return (50 * getDiasAlquiler()) + (10 * getNumRutasD());
    }
    
    @Override
    public String toString(){
        return String.format("%sNumero de rutas: %d", super.toString(), getNumRutasD());
    }
}
