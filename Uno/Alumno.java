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
public class Alumno {
    private String nombre;
    private String apellido;
    private Docente docente_progrmacion;
    private Docente docente_base_datos;
    
    public Alumno (String n, String a, Docente dp, Docente dbd){
        setNombre(n);
        setApellido(a);
        setDocente_progrmacion(dp);
        setDocente_base_datos(dbd);
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

    public Docente getDocente_progrmacion() {
        return docente_progrmacion;
    }

    public void setDocente_progrmacion(Docente docente_pro) {
        docente_progrmacion = docente_pro;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    public void setDocente_base_datos(Docente docente_base) {
        docente_base_datos = docente_base;
    }
    
    @Override
    public String toString(){
        return String.format("\n\t****************\n\tDATOS DEL ALUMNO\nNombre: %s\nApellido: %s\nDocente PROGRAMACION: %s\nDocente BASE DE DATOS: %s", getNombre(), getApellido(), getDocente_progrmacion().toString(), getDocente_base_datos().toString());
    }
    
}
