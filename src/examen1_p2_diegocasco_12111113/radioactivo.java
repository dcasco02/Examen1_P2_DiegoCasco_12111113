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
public class radioactivo extends persona {
    private int edadaccidente;
    private String Tipoaccidente;

    public int getEdadaccidente() {
        return edadaccidente;
    }

    public void setEdadaccidente(int edadaccidente) {
        this.edadaccidente = edadaccidente;
    }

    public String getTipoaccidente() {
        return Tipoaccidente;
    }

    public void setTipoaccidente(String Tipoaccidente) {
        this.Tipoaccidente = Tipoaccidente;
    }

    public boolean isTiene_escuadron() {
        return tiene_escuadron;
    }

    public void setTiene_escuadron(boolean tiene_escuadron) {
        this.tiene_escuadron = tiene_escuadron;
    }
    
}
