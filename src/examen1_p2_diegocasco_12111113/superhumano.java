/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_p2_diegocasco_12111113;

/**
 *
 * @author dcasc
 */
public class superhumano extends persona {
    private String superpoder;

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public boolean isTiene_escuadron() {
        return tiene_escuadron;
    }

    public void setTiene_escuadron(boolean tiene_escuadron) {
        this.tiene_escuadron = tiene_escuadron;
    }

    public superhumano(String superpoder, String nombre, String debilidad, String poder, String heroeoVillano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tiene_escuadron) {
        super(nombre, debilidad, poder, heroeoVillano, fuerza, habilidad_mental, habilidad_fisica, tiene_escuadron);
        this.superpoder = superpoder;
    }
    
}
