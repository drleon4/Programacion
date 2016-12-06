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
public class PrestamoEducativo extends Prestamo {
    private int nivelEstudio;
    private String nombreCentro;
    private Garante garante2;
    private Garante garante3;

    public PrestamoEducativo(String nom, double s, double m, double in, int t, Garante g1, int nE, String nC, Garante g2, Garante g3){
        super(nom, s, m, in, t, g1);
        setNevelEstudio(nE);
        setNombreCentro(nC);
        setGarante2(g2);
        setGarante3(g3);
    }
    
    public int getNevelEstudio() {
        return nivelEstudio;
    }

    public void setNevelEstudio(int nivelE) {
        nivelEstudio = nivelE;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreC) {
        nombreCentro = nombreC;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante g3) {
        garante3 = g3;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s\nNivel Estudio: %d\nNombre del centro: %s\n -> Garante 2: %s\n -> Garante 3: %s\n ", super.toString() , getNevelEstudio(), getNombreCentro(), getGarante2().toString(), getGarante3().toString());
    }
}
