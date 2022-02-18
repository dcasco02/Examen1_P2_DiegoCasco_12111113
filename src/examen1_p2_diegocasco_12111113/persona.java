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
public class persona {
    private String nombre;
    private String debilidad;
    private String poder;
    private String heroeoVillano;
    private int fuerza;
    private int habilidad_mental;
    private int habilidad_fisica;
    boolean tiene_escuadron;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getHeroeoVillano() {
        return heroeoVillano;
    }

    public void setHeroeoVillano(String heroeoVillano) {
        this.heroeoVillano = heroeoVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidad_mental() {
        return habilidad_mental;
    }

    public void setHabilidad_mental(int habilidad_mental) {
        this.habilidad_mental = habilidad_mental;
    }

    public int getHabilidad_fisica() {
        return habilidad_fisica;
    }

    public void setHabilidad_fisica(int habilidad_fisica) {
        this.habilidad_fisica = habilidad_fisica;
    }

    public boolean isTiene_escuadron() {
        return tiene_escuadron;
    }

    public void setTiene_escuadron(boolean tiene_escuadron) {
        this.tiene_escuadron = tiene_escuadron;
    }

    public persona(String nombre, String debilidad, String poder, String heroeoVillano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tiene_escuadron) {
        this.nombre = nombre;
        this.debilidad = debilidad;
        this.poder = poder;
        this.heroeoVillano = heroeoVillano;
        this.fuerza = fuerza;
        this.habilidad_mental = habilidad_mental;
        this.habilidad_fisica = habilidad_fisica;
        this.tiene_escuadron = tiene_escuadron;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", debilidad=" + debilidad + ", poder=" + poder + ", heroeoVillano=" + heroeoVillano + ", fuerza=" + fuerza + ", habilidad_mental=" + habilidad_mental + ", habilidad_fisica=" + habilidad_fisica + ", tiene_escuadron=" + tiene_escuadron + '}';
    }
    
}
