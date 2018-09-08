/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamacion2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GhostGame {
 String tablero[][]=new String[6][6];
 String tFantasmas[]=new String[]{"Malo","Bueno"};
 String tFantasmas1[]=new String[]{"Malo1","Bueno1"};
 Random ran=new Random();
 Scanner leer=new Scanner(System.in);
 String tableroS[][]=new String[6][6];
 int cox;
 int coy;
 int max=0;
 int min=0;
                           
                           
 public void Tablero(){
     
     for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
     while(max!=4 || min!=4){
                           
                            for(int f=0;f<2;f++){
                                for(int c=1;c<5;c++){
                                    tableroS[f][c]="f2";
                                    tablero[f][c]=tFantasmas[ran.nextInt(2)];
                                    if(tablero[f][c].equals("Bueno")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo")){
                                        min++;
                                    }
                                    if(max>4&&min>4){
                                        max=0;
                                min=0;
                                    }
                                }
                            }
                            if(max==4 && min==4){
                                max=0;
                                min=0;
                                break;
                            }
           
                        }
     
     
     
     max=0;
     min=0;
     
     while(max!=4 || min!=4){
                            
                            for(int f=4;f<6;f++){
                                for(int c=1;c<5;c++){
                                    tableroS[f][c]="f1";
                                    tablero[f][c]=tFantasmas1[ran.nextInt(2)];
                                    
                                    if(tablero[f][c].equals("Bueno1")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo1")){
                                        min++;
                                    }
                                     if(max>4&&min>4){
                                        max=0;
                                min=0;}
                                }
                            }
                            if(max==4 && min==4){
                                break;
                            }
                            
                            
                            
                            
                        }
     
      
     
     
 }
 public void movimiento(){
     boolean ganador=false;
     int turno_jugador=1;
     while(ganador=false){
         if(turno_jugador==1){
             System.out.println("Que fantasma desea mover?\n"
                     + "Escriba la coordenada de su fantasma: "
                     + "\nColumna:");
             coy=leer.nextInt();
             System.out.println("Fila");
             cox=leer.nextInt();
             if(tableroS[cox][coy].equals("f1")){
                 
             }
             
             
         }
         
     }
     
 }
    
    
    
    
    
    
}
