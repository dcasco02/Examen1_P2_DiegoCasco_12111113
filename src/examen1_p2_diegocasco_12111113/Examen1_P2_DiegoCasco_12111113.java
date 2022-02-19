/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_p2_diegocasco_12111113;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Examen1_P2_DiegoCasco_12111113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList universos= new ArrayList();
        ArrayList personas=new ArrayList();
        int opcion=100;
        while(opcion!=0){
            opcion = Integer.parseInt(
            JOptionPane.showInputDialog(
            "0-Salir\n"
                    + "1-Crear Universo\n"
                    + "2-Crear heroe\n"
                    + "3-Crear Escruadron\n"
                    + "4-Simulacion"));
            if(opcion==1){
                int opcion2=7;
                while(opcion2!=0){
                    opcion2=Integer.parseInt(
                    JOptionPane.showInputDialog("0-salir"
                            + "1.1-Crear universo\n"
                            + "1.2-Modificar universo\n"
                            + "1.3-Eliminar universos\n"
                            + "1.4-Listar"));
                    if(opcion==1){
                        String name=JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                        universos.add(new universo());
                    }if(opcion==2){
                        int pos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del universo que desea modificar: "));
                        if(pos<universos.size()){
                            if(universos.get(pos) instanceof universo){
                                String name=JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
                                ((universo) universos.get(pos)).setNombre(name);
                            }
                        }
                    }if(opcion==3){
                      int pos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del universo que desea modificar: "));
                        if(pos<universos.size()){
                            if(universos.get(pos) instanceof universo){
                                ((universo) universos.remove(pos)).remove(pos);
                            }
                        }  
                    }if(opcion==4){
                        String salida = "";
                        for (Object temp : universos) {
                            if (temp instanceof universo) {
                                salida += "" + universos.indexOf(temp) + " -" + temp + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                    }
                }
            }if(opcion==2){
                int opcion2=7;
                while(opcion2!=0){
                    opcion2=Integer.parseInt(
                    JOptionPane.showInputDialog("0-salir"
                            + "1.1-Crear Escuadron\n"
                            + "1.2-Modificar Escuadron\n"
                            + "1.3-Eliminar universos\n"
                            + "1.4-Listar\n"
                            + "1.5-Agregar a persona"));
                    if(opcion==1){
                        String name=JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                        String lugar=JOptionPane.showInputDialog("Ingrese el lugar(puebo o ciudad): ");
                        String goodobad=JOptionPane.showInputDialog("Ingrese si hereo o villan: ");
                        if(goodobad=="heroe"){
                            //heroeovillano=true;
                        }else if(goodobad=="villan"){
                            //heroe=false;
                        }
                        universos.add(new Escuadron(name, lugar, goodobad, universos, true, lider));
                    }
                }if(opcion==4){
                   String salida = "";
                        for (Object temp : universos) {
                            if (temp instanceof Escuadron) {
                                salida += "" + universos.indexOf(temp) + " -" + temp + "\n";
                            }
                        JOptionPane.showMessageDialog(null, salida);
                    } 
                }
            }
            if (opcion == 3) {
                int opcion2 = 7;
                while (opcion2 != 0) {
                    opcion2 = Integer.parseInt(
                            JOptionPane.showInputDialog("0-salir"
                                    + "3.1-Crear persona\n"
                                    + "3.2-Modificar persona\n"
                                    + "3.3-Eliminar persona\n"
                                    + "3.4-Listar"));
                    if (opcion == 1) {
                        int opcion3 = 9;
                        while (opcion3 != 0) {
                            opcion3 = Integer.parseInt(
                                    JOptionPane.showInputDialog("1-normal\n"
                                            + "2-alien\n"
                                            + "3-Extraterrestre\n"
                                            + "3-diety\n"
                                            + "4-mutante\n"
                                            + "5-radioactivo\n"
                                            + "6-superhumano\n"
                                            + "0-salir"));
                            if (opcion == 1) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese si es heroe o villano el personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                personas.add(new normal(name, debilidad, poder, debilidad, fuerza, mental, fisica, true));
                            }
                            if (opcion == 2) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese si es heroe o villano el personaje: ");
                                String planeta = JOptionPane.showInputDialog("Ingrese el planeta del personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                personas.add(new alien(poder, name, debilidad, poder, debilidad, fuerza, mental, fisica, true));
                            }
                            if (opcion == 3) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese si es heroe o villano el personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                personas.add(new extraterrestre(name, debilidad, poder, debilidad, fuerza, mental, fisica, true));
                            }
                            if (opcion == 4) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese si es heroe o villano el personaje: ");
                                String religion = JOptionPane.showInputDialog("Ingrese la religion o mitologia del personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                personas.add(new diety(true, religion, name, debilidad, poder, religion, fuerza, mental, fisica, true));
                            }
                            if (opcion == 5) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese el heroeovillano del personaje: ");
                                String accidente = JOptionPane.showInputDialog("Ingrese el tippo de accidente del personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad al momento de accidente de la persona: "));
                                personas.add(new superhumano(poder, name, debilidad, poder, debilidad, fuerza, mental, fisica, true));
                            }
                            if (opcion == 6) {
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                                String debilidad = JOptionPane.showInputDialog("Ingrese la debilidad del personaje: ");
                                String poder = JOptionPane.showInputDialog("Ingrese el poder del personaje: ");
                                String status = JOptionPane.showInputDialog("Ingrese el heroeovillano del personaje: ");
                                String superpoder = JOptionPane.showInputDialog("Ingrese el superpoder del personaje: ");
                                int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza de la persona "));
                                int mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad mental de la persona: "));
                                int fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad fisica de la persona: "));
                                personas.add(new superhumano(superpoder, name, debilidad, poder, debilidad, fuerza, mental, fisica, true));
                            }
                        }
                    }if(opcion==3){
                        String salida = "";
                        for (Object temp : personas) {
                            if (temp instanceof persona) {
                                salida += "" + personas.indexOf(temp) + " -" + temp + "\n";
                            }
                        JOptionPane.showMessageDialog(null, salida);
                    }
                    }
                }
            }
        }
    }
    
}
