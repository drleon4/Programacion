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
public class Prestamo {
    private String nombreDeBeneficiario;
    private double sueldo;
    private double montoPrestamo;
    private double interes;
    private int tiempoPrestamo;
    private Garante garante1;
    
    public Prestamo (String nom, double s, double m, double in, int t, Garante g1){
        setNombreDeBeneficiario(nom);
        setSueldo(s);
        setMontoPrestamo(m);
        setInteres(in);
        setTiempoPrestamo(t);
        setGarante1(g1);
    }

    public String getNombreDeBeneficiario() {
        return nombreDeBeneficiario;
    }

    public void setNombreDeBeneficiario(String nombreDeBenef) {
        nombreDeBeneficiario = nombreDeBenef;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueld) {
        sueldo = sueld;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoP) {
        montoPrestamo = montoP;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double inter) {
        interes = inter;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoP) {
        tiempoPrestamo = tiempoP;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garan) {
        garante1 = garan;
    }
    
    
    public double total (){
        return (getMontoPrestamo() * getInteres());
    }
    
    @Override
    public String toString(){
        return String.format("%s\nNombre del Beneficiario: %s\nSueldo: %.2f\nMonto Prestamo: "
                + "%.2f\nIntereses: %.2d\nTiempo Prestamo: %d\nGarante 1: %s",super.toString(), getNombreDeBeneficiario(), getSueldo(), getMontoPrestamo(),
                getInteres(), getTiempoPrestamo(), getGarante1().toString());
    }
    
}
