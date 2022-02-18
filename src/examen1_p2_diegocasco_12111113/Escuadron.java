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
public class Escuadron {
    private String nombre;
    private String lugar_base;
    private String HeroeoVillano;
    ArrayList <persona> miembros;
    boolean heroeoVillano;
    persona lider;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_base() {
        return lugar_base;
    }

    public void setLugar_base(String lugar_base) {
        this.lugar_base = lugar_base;
    }

    public String getHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(String HeroeoVillano) {
        this.HeroeoVillano = HeroeoVillano;
    }

    public ArrayList<persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<persona> miembros) {
        this.miembros = miembros;
    }

    public boolean isHeroeoVillano() {
        return heroeoVillano;
    }

    public void setHeroeoVillano(boolean heroeoVillano) {
        this.heroeoVillano = heroeoVillano;
    }

    public persona getLider() {
        return lider;
    }

    public void setLider(persona lider) {
        this.lider = lider;
    }

    public Escuadron(String nombre, String lugar_base, String HeroeoVillano, ArrayList<persona> miembros, boolean heroeoVillano, persona lider) {
        this.nombre = nombre;
        this.lugar_base = lugar_base;
        this.HeroeoVillano = HeroeoVillano;
        this.miembros = miembros;
        this.heroeoVillano = heroeoVillano;
        this.lider = lider;
    }
    
}
