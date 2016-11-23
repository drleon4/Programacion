/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author SALAS
 */
public class PrestamoAutomovil extends Prestamo {
    private int tipoVehiculo;
    private String marcaVehiculo;
    private Garante garante2;
    
    public PrestamoAutomovil(String nom, double s, double m, double in, int t, Garante g1, int tv, String mV, Garante g2){
        super(nom, s, m, in, t, g1);
        setTipoVehiculo(tv);
        setMarcaVehiculo(mV);
        setGarante2(g2);
    }
    
    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoV) {
        tipoVehiculo = tipoV;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaV) {
        marcaVehiculo = marcaV;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    @Override
    public String toString(){
        return String.format( "%s\nTipo vehículo: %d\nMarca Vehículo: %s\nGarante 2: %s",super.toString(), getTipoVehiculo(), getMarcaVehiculo(), getGarante2());
    }
}
