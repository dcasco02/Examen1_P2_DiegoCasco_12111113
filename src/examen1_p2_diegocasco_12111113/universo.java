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
public class universo {
    private String nombre;
    ArrayList <Escuadron> teams;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Escuadron> teams) {
        this.teams = teams;
    }
    
}
