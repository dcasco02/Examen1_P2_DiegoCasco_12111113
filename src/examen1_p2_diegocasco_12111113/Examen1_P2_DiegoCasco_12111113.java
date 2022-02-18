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
                            + "1.2-Modificar universo\n"
                            + "1.3-Eliminar universos\n"
                            + "1.4-Listar"));
                    if(opcion==1){
                        String name=JOptionPane.showInputDialog("Ingrese el nombre del personaje: ");
                        String lugar=JOptionPane.showInputDialog("Ingrese el lugar(puebo o ciudad): ");
                        String goodobad=JOptionPane.showInputDialog("Ingrese si hereo o villan: ");
                        if(goodobad=="heroe"){
                            heroeovillano=true;
                        }else if(goodobad=="villan"){
                            heroe=false;
                        }
                        universos.add(new Escuadron(name, lugar, goodobad, universos,true, lider));
                    }
                }    
            }
        }
    }
    
}
