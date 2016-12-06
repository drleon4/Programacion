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
public class Camiones  extends Vehiculos{
    private int toneladas;
    
    public Camiones(String m, String c, String mar, int dia, int tone){
        super(m, c, mar, dia);
        setToneladas(tone);
    }
    
    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    
    public double obtener_precio_alquiler(){
        return ((50 * getDiasAlquiler()) + (20 * getToneladas()));
    }
    
    @Override 
    public String toString(){
        return String.format("%sToneladas: %d", super.toString(),getToneladas());
    }
}
