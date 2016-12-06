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
public abstract class Vehiculos {
    private String matricula;
    private String color;
    private String marca;
    private int diasAlquiler;
    
    public Vehiculos(String m, String c, String mar, int dia){
        setMatricula(m);
        setColor(c);
        setMarca(mar);
        setDiasAlquiler(dia);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
   @Override 
   public String toString(){
       return String.format("Matricula: %s\nColor: %s\nMarca: %s\nDias de Alquiler: %d\n", getMatricula(), getColor(), getMarca(), getDiasAlquiler());
   }
   
   public abstract double obtener_precio_alquiler();
}
