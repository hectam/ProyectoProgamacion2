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
    int ganador=0;
 String tablero[][]=new String[6][6];
 String tFantasmas[]=new String[]{"Malo","Bueno"};
 String tFantasmas1[]=new String[]{"Malo1","Bueno1"};
 Random ran=new Random();
 Scanner leer=new Scanner(System.in);
 String tableroS[][]=new String[6][6];
 int cox;//variable para determinar donde esta el fantasma en el eje x
 int coy;//variable para determinar donde esta el fantasma en el eje y
 String mox;//variable para determinar donde mover el fantasma en el eje x
 int moy;//variable para determinar donde mover el fantasma en el eje y
 int max=0;
 int min=0;
 int direccion=0;
 
                           
                           
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
     int salir = 0;
     int turno_jugador=1;
     while(ganador==0){
         if(turno_jugador==1){
             System.out.println("Que fantasma desea mover?\n"
                     + "Ingrese la coordenada de su fantasma: "
                     + "\nColumna:");
             coy=leer.nextInt();
             System.out.println("Fila");
             cox=leer.nextInt();
             mox=tablero[cox][coy];
             while(salir != 1 || ganador==1){
             if(tableroS[cox][coy].equals("f1")){
                 
                 System.out.println("Donde desea mover su fantasma?");
                 System.out.println("1. Adelante \n2. Atraz \n3. Derecha \n4. Izquierda ");
                        direccion=leer.nextInt();
                        switch (direccion){
                            case 1:
                                salir = 1;
                                
                                if(tablero[cox-1][coy].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox-1][coy].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[0][coy]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                if(tableroS[cox-1][coy].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                  salir = 3;
                                 break;
                                 
                             }
                             tablero[cox][coy] = " -";
                             tablero[cox-1][coy]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox-1][coy] = "f1";
                             
                             turno_jugador = 2;
                             
                             break;
                             case 2:
                                      salir = 1;
                                if(tablero[cox+1][coy].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox+1][coy].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[5][coy]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                   if(tableroS[cox+1][coy].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                  salir = 3;
                                 break;
                                 
                             }
                                   
                              tablero[cox][coy] = " -";
                             tablero[cox+1][coy]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox+1][coy] = "f1";
                          
                             turno_jugador = 2;
                                  break;
                             case 3:
                                 salir = 1;
                                  if(tablero[cox][coy] == tablero[0][4] && tablero[cox][coy].equals("Bueno1")){
                                    ganador = 1;
                                    System.out.println("Usted ah ganao");
                                }
                                if(tablero[cox][coy+1].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy+1].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[cox][5]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                 if(tableroS[cox][coy+1].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 3;
                                break;
                                 
                             }
                                 
                            tablero[cox][coy] = " -";
                             tablero[cox][coy+1]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox][coy+1] = "f1";
                            
                             turno_jugador = 2;
                                  break;
                             case 4:
                                 salir = 1;
                                      if(tablero[cox][coy] == tablero[0][1]){
                                    ganador = 1;
                                }
                                if(tablero[cox][coy-1].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy-1].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tableroS[cox][0]){
                                    System.out.println("Esta jugada es invalida");
                                    salir = 123;
                                    break;
                                }
                                if(tableroS[cox][coy-1].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 2;
                                 break;
                                }
                              tablero[cox][coy] = " -";
                             tablero[cox][coy-1]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox][coy-1] = "f1";
                             
                                 
                             
                             
                             turno_jugador = 2;
                                  break;
                        
                        
             }
             }else{
                 System.out.println("Posicion invalida");
                 break;
             }
             
         }
             
             for(int f=0;f<6;f++){
         for(int c=0;c<6;c++){
             System.out.print(tableroS[f][c]);

         }
         System.out.println("");
              }
             }
                         
                         salir=0;
                       if(turno_jugador==2){
             System.out.println("Que fantasma desea mover?\n"
                     + "Ingrese la coordenada de su fantasma: "
                     + "\nColumna:");
             coy=leer.nextInt();
             System.out.println("Fila");
             cox=leer.nextInt();
             mox=tablero[cox][coy];
             while(salir != 1){
             if(tableroS[cox][coy].equals("f2")){
                 
                 System.out.println("Donde desea mover su fantasma?");
                 System.out.println("1. Adelante \n2. Atraz \n3. Derecha \n4. Izquierda ");
                        direccion=leer.nextInt();
                        switch (direccion){
                            case 1:
                                salir = 1;
                               
                                if(tablero[cox+1][coy].equals("Bueno1")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox+1][coy].equals("Malo1")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[5][coy]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                if(tableroS[cox+1][coy].equals("f2")){
                                 System.out.println("Esa jugada es invalida");
                                  salir = 3;
                                 break;
                                 
                             }
                             tablero[cox][coy] = " -";
                             tablero[cox+1][coy]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox+1][coy] = "f2";
                             
                             turno_jugador = 1;
                             
                             break;
                             case 2:
                                      salir = 1;
                                if(tablero[cox-1][coy].equals("Bueno1")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox-1][coy].equals("Malo1")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[0][coy]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                   if(tableroS[cox-1][coy].equals("f2")){
                                 System.out.println("Esa jugada es invalida");
                                  salir = 3;
                                 break;
                                 
                             }
                              tablero[cox][coy] = " -";
                             tablero[cox+1][coy]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox+1][coy] = "f2";
                          
                             turno_jugador = 1;
                                  break;
                             case 3:
                                 salir = 1;
                                  if(tablero[cox][coy] == tablero[5][4] && tablero[cox][coy].equals("Bueno")){
                                    ganador = 1;
                                      System.out.println("Usted ah ganao");
                                }
                                if(tablero[cox][coy+1].equals("Bueno1")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy+1].equals("Malo1")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tablero[cox][5]){
                                    System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                                }
                                 if(tableroS[cox][coy+1].equals("f2")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 3;
                                break;
                                 
                             }
                            tablero[cox][coy] = " -";
                             tablero[cox][coy+1]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox][coy+1] = "f2";
                            
                             turno_jugador = 1;
                                  break;
                             case 4:
                                 salir = 1;
                                      if(tablero[cox][coy] == tablero[5][1] && tablero[cox][coy].equals("Bueno")){
                                    ganador = 1;
                                          System.out.println("Usted ah ganao embezhil :D");
                                    turno_jugador = 0;
                                }
                                   
                                if(tablero[cox][coy-1].equals("Bueno1")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy-1].equals("Malo1")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                if(tableroS[cox][coy] == tableroS[cox][0]){
                                    System.out.println("Esta jugada es invalida");
                                    salir = 123;
                                    break;
                                }
                                if(tableroS[cox][coy-1].equals("f2")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 2;
                                 break;
                                }
                              tablero[cox][coy] = " -";
                             tablero[cox][coy-1]= mox;
                             tableroS[cox][coy] = " -";
                             tableroS[cox][coy-1] = "f2";
                             
                                 
                             
                             
                             turno_jugador = 1;
                                  break;
                        
                        
             }
             }else{
                 System.out.println("fantasma no encontrado");
                 break;
             }
         }
             for(int f=0;f<6;f++){
         for(int c=0;c<6;c++){
             System.out.print(tableroS[f][c]);
         }
         System.out.println("");
              }
             }
                         
                         salir=0;
 }
    
    
    
 }
 public void actualizar(){
     for(int f=0;f<6;f++){
         for(int c=0;c<6;c++){
             System.out.print(tableroS[f][c]);
         }
         System.out.println("");
              }
     
 }   
    

 }
 
