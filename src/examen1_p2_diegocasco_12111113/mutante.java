/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_p2_diegocasco_12111113;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class mutante extends persona {
    private ArrayList <String> Factores_mutante;

    public ArrayList<String> getFactores_mutante() {
        return Factores_mutante;
    }

    public void setFactores_mutante(ArrayList<String> Factores_mutante) {
        this.Factores_mutante = Factores_mutante;
    }

    public boolean isTiene_escuadron() {
        return tiene_escuadron;
    }

    public void setTiene_escuadron(boolean tiene_escuadron) {
        this.tiene_escuadron = tiene_escuadron;
    }
    
}
