/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamacion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Player {
    int x;
    String Nombre;
    String Contra;
    int puntuacion;
    ArrayList<String> password=new ArrayList<String>();
    ArrayList<String> player= new ArrayList<String>();
    
    public void setNombre(String nombreJugador){
    Nombre=nombreJugador;
    
    player.add(Nombre);
}
    public void setContra(String Contrase){
        Contra=Contrase;
        
    password.add(Contra);
    
    }
    public void setpuntuacion(int puntuaciones){
        puntuacion=puntuaciones;
    }
    public String getNombre(){
        return Nombre;
        
    }
    public String getContra(){
        return Contra;
    }
    public void Insertar_jugadores(){
        
    
    
}
    
    
    
    
    
}
