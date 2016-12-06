/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author SALAS
 */
public class Docente {
    private String nombre;
    private String apellido;
    private String titulo;
    
    public Docente (String n, String a, String t){
        setNombre(n);
        setApellido(a);
        setTitulo(t);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apell) {
        apellido = apell;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tit) {
        titulo = tit;
    }
    
    @Override
    public String toString(){
        return String.format("\n\tDATOS DEL DOCENTE\nNombre D: %s\nApellido D: %s\nTitulo D: %s",getNombre(), getApellido(), getTitulo());
    }
}
