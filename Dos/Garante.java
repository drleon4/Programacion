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
public class Garante {
    private String nombre;
    private String apellido;
    private double sueldo;
    
    public Garante (String n, String a, double s){
        setNombre(n);
        setApellido(a);
        setSueldo(s);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }
    
    @Override 
    public String toString(){
        return String.format("Nombre G: %s\nApellido G: %s\nSueldo G: %.2f\n", getNombre(), getApellido(), getSueldo());
    }
}
