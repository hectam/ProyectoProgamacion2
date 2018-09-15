/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamacion2;

import java.util.ArrayList;
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
 Player play=new Player();
 Random ran=new Random();
ArrayList<String> frasesV=new ArrayList<String>();
 Scanner leer=new Scanner(System.in);
 String tableroS[][]=new String[6][6];
 int cox;//variable para determinar donde esta el fantasma en el eje x
 int coy;//variable para determinar donde esta el fantasma en el eje y
 String mox;//variable para determinar donde mover el fantasma en el eje x
 int moy;//variable para determinar donde mover el fantasma en el eje y
 int gana1;
 int gana2;
 int gana3;
 int max=0;
 int min=0;
 int direccion=0;
 int dificultad=0;
 int modo=0;
 int cambio=0;
 int biribiri=0;
 int fila;
 int columna;
 String Vfrase="";
 int j=0;
 
 
 public void dificultad(){
     System.out.println("Escoja la dificultad: "
             + "\n1. Normal"
             + "\n2. Expert"
             + "\n3. Genius");
     int selec=leer.nextInt();
     switch(selec){
         case 1:
             dificultad=0;
          break;
         case 2:
             dificultad=1;
             break;
         case 3:
             dificultad=2;
             break;
     }
     
     
 }
 public void Modo(){
     System.out.println("Escoja el modo: "
     +"\n1. Aleatorio"
             + "\n2. Manual");
     int Modo=leer.nextInt();
     switch(Modo){
         case 1:
             modo=0;
             break;
         case 2:
             modo=1;
             break;
         default:
             System.out.println("Ingrese una opcion valida");
             break;
     }
 }
                           
                           
 public void Tablero(){
     if(dificultad==0){
     if(modo==0){
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
     if(modo==1){
         for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
         
         while(biribiri<8){
             System.out.println("ingreso de fantasmas del jugador 1");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno1"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo1"));
             }
         }
         biribiri=0;
         
         while(biribiri<8){
             System.out.println("ingreso de fantasmas del jugador 2");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=1;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo"));
                 
             }
         }
         
         
         
   
                           
                            
     }
     }
     if(dificultad==1){
     if(modo==0){
     for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
     while(max!=2 || min!=2){
                           
                            for(int f=0;f<1;f++){
                                for(int c=1;c<5;c++){
                                    tableroS[f][c]="f2";
                                    tablero[f][c]=tFantasmas[ran.nextInt(2)];
                                    if(tablero[f][c].equals("Bueno")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo")){
                                        min++;
                                    }
                                    if(max>2&&min>2){
                                        max=0;
                                min=0;
                                    }
                                }
                            }
                            if(max==2 && min==2){
                                max=0;
                                min=0;
                                break;
                            }
           
                        }
     
     
     
     max=0;
     min=0;
     
     while(max!=2 || min!=2){
                            
                            for(int f=5;f<6;f++){
                                for(int c=1;c<5;c++){
                                    tableroS[f][c]="f1";
                                    tablero[f][c]=tFantasmas1[ran.nextInt(2)];
                                    
                                    if(tablero[f][c].equals("Bueno1")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo1")){
                                        min++;
                                    }
                                     if(max>2&&min>2){
                                        max=0;
                                min=0;}
                                }
                            }
                            if(max==2 && min==2){
                                break;
                            }
                            
                            
                            
                            
                        }
     
     
     
 }
     
     if(modo==1){
         for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
         
         while(biribiri<4){
             System.out.println("ingreso de fantasmas del jugador 1");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno1"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo1"));
             }
         }
         biribiri=0;
         
         while(biribiri<4){
             System.out.println("ingreso de fantasmas del jugador 2");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=1;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo"));
                 
             }
         }
         
         
         
   
                           
                            
     }
     }
      if(dificultad==2){
     if(modo==0){
     for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
     while(max!=1 || min!=1){
                           
                            for(int f=0;f<1;f++){
                                for(int c=2;c<4;c++){
                                    tableroS[f][c]="f2";
                                    tablero[f][c]=tFantasmas[ran.nextInt(2)];
                                    if(tablero[f][c].equals("Bueno")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo")){
                                        min++;
                                    }
                                    if(max>1 && min>1){
                                        max=0;
                                min=0;
                                    }
                                }
                            }
                            if(max==1 && min==1){
                                max=0;
                                min=0;
                                break;
                            }
           
                        }
     
     
     
     max=0;
     min=0;
     
     while(max!=1 || min!=1){
                            
                            for(int f=5;f<6;f++){
                                for(int c=2;c<4;c++){
                                    tableroS[f][c]="f1";
                                    tablero[f][c]=tFantasmas1[ran.nextInt(2)];
                                    
                                    if(tablero[f][c].equals("Bueno1")){
                                        max++;
                                    }
                                    if(tablero[f][c].equals("Malo1")){
                                        min++;
                                    }
                                     if(max>1&&min>1){
                                        max=0;
                                min=0;}
                                }
                            }
                            if(max==1 && min==1){
                                break;
                            }
                            
                            
                            
                            
                        }
     
     
     }
     if(modo==1){
         for(int f=0;f<6;f++){
                                   for(int c=0;c<6;c++){
                                       tableroS[f][c]=" -";
                                       tablero[f][c]=" -";
                                       
                                       
                                   }
                       }
         
         while(biribiri<2){
             System.out.println("ingreso de fantasmas del jugador 1");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno1"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"5\" (fila trasera)");
                 System.out.println("fila \"4\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo1";
                 tableroS[fila][columna]="f1";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo1")|| tablero[fila][columna].equals("Bueno1")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo1"));
             }
         }
         biribiri=0;
         
         while(biribiri<2){
             System.out.println("ingreso de fantasmas del jugador 2");
             if(cambio==0){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma bueno:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Bueno";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=1;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Bueno"));
             }
             if(cambio==1){
                 do{
                 do{
                 System.out.println("Ingrese la coordenada para colocar un fantasma Malo:");
                     System.out.println("Ingrese una de las siguientes filas( solo el numero):");
                 System.out.println("fila \"0\" (fila trasera)");
                 System.out.println("fila \"1\" (fila delantera) ");
                 fila=leer.nextInt();
                 if(fila<4 || fila >5){
                     System.out.println("No puede ingresar una Fila fuera de las establecidas.");  
                 } 
                 }while(fila <4 && fila >5);
                 do{
                     System.out.println("Ingrese una de las Siguientes columanas (solo el numero): "
                             + "\nColumna \"1\""
                             + "\ncolumna \"2\""
                             + "\ncolumna \"3\""
                             + "\ncolumna \"4\"");
                     columna=leer.nextInt();
                  if(columna<1||columna>4){
                      System.out.println("No puede ingresar una Columna fuera de las establecidas.");
                  }
                 }while(columna <1 && columna>4);
                 if(tablero[fila][columna].equals(" -")){
                 tablero[fila][columna]="Malo";
                 tableroS[fila][columna]="f2";
                 biribiri++;
                 cambio=0;
                 }else if
                 (tablero[fila][columna].equals("Malo")|| tablero[fila][columna].equals("Bueno")){
                     System.out.println("Esa posicion ya esta ocupada");
                 }
                 }while(tablero[fila][columna].equals("Malo"));
                 
             }
         }
         
         
         
   
                           
                            
     }
 }
 
 
 }
 public void movimiento(String _jugador1, String _jugador2){
     int salir = 0;
     int turno_jugador=1;
     while(ganador==0){
         if(turno_jugador==1){
             System.out.println("Que fantasma desea mover "+_jugador1+"?\n"
                     + "Ingrese la coordenada de su fantasma: "
                     + "\nColumna:");
             coy=leer.nextInt();
             System.out.println("Fila");
             cox=leer.nextInt();
             mox=tablero[cox][coy];
             if(cox != 0){
               if(tableroS[cox-1][coy].equals("f1")&&tableroS[cox][coy-1].equals("f1")&&tableroS[cox][coy+1].equals("f1")){
                     System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro");
                    salir = 1; 
                 }
               else if(tableroS[cox-1][coy].equals("f1")&& tableroS[cox][coy+1].equals("f1")&& cox==5 && coy==1){
                 System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro2");
              salir = 1;
             }
            else if(tableroS[cox-1][coy].equals("f1")&&tableroS[cox][coy-1].equals("f1")&& cox==5 && coy==4){
                  System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro2");
                  salir = 1;
                         
            }
             }
             while(salir != 1 && ganador==0){
             if(tableroS[cox][coy].equals("f1")){
                 
                 System.out.println("Donde desea mover su fantasma "+_jugador1+"?");
                 System.out.println("1. Adelante \n2. Atraz \n3. Derecha \n4. Izquierda ");
                        direccion=leer.nextInt();
                        switch (direccion){
                            case 1:
                                salir = 1;
                                
                                if(tablero[cox][coy]==tablero[0][coy]){
                                   System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                               }
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
                                      if(tablero[cox][coy]==tablero[5][coy]){
                                   System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                               }
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
                                  
                                if(tablero[cox][coy+1].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy+1].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                
                                 if(tableroS[cox][coy+1].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 3;
                                break;
                                 
                             }
                                 if(coy==4){
                                     if(coy == 4 && cox == 0 && tablero[cox][coy].equals("Bueno1")){
                                         System.out.println("gano"+_jugador1
                                                 + "\n Un fantasma Bueno logro salir por el castillo enemigo");
                                     ganador = 1;
                                     salir=1;
                                     Vfrase=_jugador1+" Triunfo al sacar un fantasma bueno por el castillo";
                                     frasesV.add(Vfrase);
                                         break;
                                     }else if(coy == 4 && cox == 0 && tablero[cox][coy].equals("Malo1")){
                                         tablero[cox][coy] = " -";
                                         tableroS[cox][coy] = " -";
                                         System.out.println("Usted saco un fantasma malo del castillo");
                                         break;
                                     }
                                     System.out.println("USteh ejecuto la jugada proybidah, tons su fantasma se murio alv y usted pierde >:v");
                                     System.out.println("gano"+ _jugador2);
                                      Vfrase=_jugador2+" Triunfo porque "+_jugador1+" Saco a un fantasma ilegalmente";
                                     frasesV.add(Vfrase);
                                     ganador = 1;
                                     salir=1;
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
                                     
                                if(tablero[cox][coy-1].equals("Bueno")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy-1].equals("Malo")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                
                                if(tableroS[cox][coy-1].equals("f1")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 2;
                                 break;
                                }
                                if(coy==1){
                                    if(coy == 1 && cox == 0 && tablero[cox][coy].equals("Bueno1")){
                                         System.out.println("gano"+_jugador1
                                                 + "\n Un fantasma Bueno logro salir por el castillo enemigo");
                                     ganador = 1;
                                      Vfrase=_jugador1+" Triunfo al sacar un fantasma bueno por el castillo";
                                     frasesV.add(Vfrase);
                                     salir=1;
                                         break;
                                     }else if(coy == 1 && cox == 0&& tablero[cox][coy].equals("Malo1")){
                                         tablero[cox][coy] = " -";
                                         tableroS[cox][coy] = " -";
                                         System.out.println("Usted saco un fantasma malo del castillo");
                                         break;
                                     }
                                     System.out.println("USteh ejecuto la jugada proybidah, tons su fantasma se murio alv y usted pierde >:v");
                                     System.out.println("gano"+_jugador2);
                                      Vfrase=_jugador2+" Triunfo porque "+_jugador1+" Saco a un fantasma ilegalmente";
                                     frasesV.add(Vfrase);
                                     ganador = 1;
                                     salir=1;
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
             moy=0;
             gana1=0;
             gana2=0;
             gana3=0;
             for(int f=0;f<6;f++){
         for(int c=0;c<6;c++){
             if(j==0){
                System.out.println("\n  Columnas"
                        + "\n------------"
                        + "\n 0 1 2 3 4 5|Filas");
                        
                        
                j=1;
            }
             System.out.print(tableroS[f][c]);
             if(tablero[f][c].equals("Bueno1")){
                moy++;     
             }
         if(tablero[f][c].equals("Malo1")){
             gana1++;
         }
         if(tablero[f][c].equals("Bueno")){
             gana2++;
         }
         if(tablero[f][c].equals("Malo")){
             gana3++;
         }
         }
         System.out.println("| "+f);
              }
             j=0;
             if(moy==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador2+" ha ganado"
                         + "\nVencio a todos los fantasmas Buenos del jugador 1");
                  Vfrase=_jugador2+" Triunfo Sobre "+_jugador1+" porque capturó todos sus fantasmas buenos!";
                                     frasesV.add(Vfrase);
             }
             if(gana1==0){
                 ganador=1;
                 System.out.println("El jugador"+_jugador1+" ha ganado"
                         + "\nYa no le quedan fantasmas malos al jugador 1");
                 Vfrase=_jugador1+" Triunfo porque "+_jugador2+ " le capturó todos sus fantasmas malos!";
                                     frasesV.add(Vfrase);
             }
             if(gana2==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador1+" ha ganado"
                         + "\nVencio a todos los fantasmas Buenos del jugador 2");
                 Vfrase=_jugador1+" Triunfo Sobre "+_jugador2+" porque capturó todos sus fantasmas buenos!";
                                     frasesV.add(Vfrase);
             }
             if(gana3==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador2+" ha ganado"
                         + "\nYa no le quedan fantasmas malos al jugador 1");
                  Vfrase=_jugador2+" Triunfo porque "+_jugador1+ " le capturó todos sus fantasmas malos!";
                                     frasesV.add(Vfrase);
             }
             }
                         
                         salir=0;
                       if(turno_jugador==2){
             System.out.println("Que fantasma desea mover "+_jugador2+"?\n"
                     + "Ingrese la coordenada de su fantasma: "
                     + "\nColumna:");
             coy=leer.nextInt();
             System.out.println("Fila");
             cox=leer.nextInt();
             mox=tablero[cox][coy];
             if(cox != 5){
             if(tableroS[cox+1][coy].equals("f2")&&tableroS[cox][coy-1].equals("f2")&&tableroS[cox][coy+1].equals("f2")){
                     System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro");
                     salir = 1;
                 }
             if(tableroS[cox+1][coy].equals("f2")&&tableroS[cox][coy-1].equals("f2")&& coy == 4 && cox == 0){
                 System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro");
                 salir = 1;
             }
             if(tableroS[cox+1][coy].equals("f2")&&tableroS[cox][coy+1].equals("f2")&& coy == 1 && cox == 0){
                  System.out.println("Ese fantasma no se puede mover a ninguna parte, seleccione otro");
                  salir = 1;
             }
             }
             while(salir != 1){
             if(tableroS[cox][coy].equals("f2")){
                 
                 System.out.println("Donde desea mover su fantasma "+_jugador2+"?");
                 System.out.println("1. Adelante \n2. Atraz \n3. Derecha \n4. Izquierda ");
                        direccion=leer.nextInt();
                        switch (direccion){
                            case 1:
                                salir = 1;
                               if(tablero[cox][coy]==tablero[5][coy]){
                                   System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                               }
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
                                      if(tablero[cox][coy]==tablero[0][coy]){
                                   System.out.println("Esta jugada es invalida");
                                     salir = 3;
                                    break;
                               }
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
                                 if(coy==4){
                                     if(coy == 4 && cox == 5 && tablero[cox][coy].equals("Bueno")){
                                         System.out.println("gano "+_jugador2
                                                 + "\n Un fantasma Bueno logro salir por el castillo enemigo");
                                     ganador = 1;
                                     salir=1;
                                      Vfrase=_jugador2+" Triunfo al sacar un fantasma bueno por el castillo";
                                     frasesV.add(Vfrase);
                                         break;
                                     }else if( coy == 4 && cox == 5 && tablero[cox][coy].equals("Malo")){
                                         tablero[cox][coy] = " -";
                                         tableroS[cox][coy] = " -";
                                         System.out.println("Usted saco un fantasma malo del castillo");
                                         break;
                                     }
                                      if(coy == 4 && cox == 0){
                                        System.out.println("No puede sacar fantasmas por su propia salida");
                                         salir = 2;
                                 break;
                                    }
                                     System.out.println("USteh ejecuto la jugada proybidah, tons su fantasma se murio alv y usted pierde >:v");
                                     System.out.println("gano"+_jugador1);
                                      Vfrase=_jugador1+" Triunfo porque "+_jugador2+" Saco a un fantasma ilegalmente";
                                     frasesV.add(Vfrase);
                                     ganador = 1;
                                     salir=1;
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
                                      
                                   
                                if(tablero[cox][coy-1].equals("Bueno1")){
                                 System.out.println("Usted se comio a un fantasma bueno");
                             }
                             if(tablero[cox][coy-1].equals("Malo1")){
                                 System.out.println("Usted se comio a un fantasma malo");
                             }
                                
                                if(tableroS[cox][coy-1].equals("f2")){
                                 System.out.println("Esa jugada es invalida");
                                 salir = 2;
                                 break;
                                }
                                if(coy==1){
                                    if(coy == 1 && cox == 5 && tablero[cox][coy].equals("Bueno")){
                                         System.out.println("gano "+_jugador2
                                                 + "\n Un fantasma Bueno logro salir por el castillo enemigo");
                                          Vfrase=_jugador2+" Triunfo al sacar un fantasma bueno por el castillo";
                                     frasesV.add(Vfrase);
                                     ganador = 1;
                                     salir=1;
                                         break;
                                     }else if((coy == 1 && cox == 5)&& tablero[cox][coy].equals("Malo")){
                                         tablero[cox][coy] = " -";
                                         tableroS[cox][coy] = " -";
                                         System.out.println("Usted saco un fantasma malo del castillo");
                                         break;
                                     }
                                    if(coy == 1 && cox == 0){
                                        System.out.println("No puede sacar fantasmas por su propia salida");
                                         salir = 2;
                                 break;
                                    }
                                     System.out.println("USteh ejecuto la jugada proybidah, tons su fantasma se murio alv y usted pierde >:v");
                                     System.out.println("gano "+_jugador1);
                                      Vfrase=_jugador1+" Triunfo porque "+_jugador2+" Saco a un fantasma ilegalmente";
                                     frasesV.add(Vfrase);
                                     ganador = 1;
                                     salir=1;
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
             moy=0;
             gana1=0;
             gana2=0;
             gana3=0;
             for(int f=0;f<6;f++){
         for(int c=0;c<6;c++){
             if(j==0){
                System.out.println("\n  Columnas"
                        + "\n------------"
                        + "\n 0 1 2 3 4 5|Filas");
                        
                        
                j=1;
            }
             System.out.print(tableroS[f][c]);
             if(tablero[f][c].equals("Bueno1")){
                moy++;     
             }
         if(tablero[f][c].equals("Malo1")){
             gana1++;
         }
         if(tablero[f][c].equals("Bueno")){
             gana2++;
         }
         if(tablero[f][c].equals("Malo")){
             gana3++;
         }
         }
         System.out.println("| "+f);
              }
             j=0;
             if(moy==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador2+" ha ganado"
                         + "\nVencio a todos los fantasmas Buenos del jugador 1");
                  Vfrase=_jugador2+" Triunfo Sobre "+_jugador1+" porque capturó todos sus fantasmas buenos!";
                                     frasesV.add(Vfrase);
             }
             if(gana1==0){
                 ganador=1;
                 System.out.println("El jugador"+_jugador1+" ha ganado"
                         + "\nYa no le quedan fantasmas malos al jugador 1");
                 Vfrase=_jugador1+" Triunfo porque "+_jugador2+ " le capturó todos sus fantasmas malos!";
                                     frasesV.add(Vfrase);
             }
             if(gana2==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador1+" ha ganado"
                         + "\nVencio a todos los fantasmas Buenos del jugador 2");
                 Vfrase=_jugador1+" Triunfo Sobre "+_jugador2+" porque capturó todos sus fantasmas buenos!";
                                     frasesV.add(Vfrase);
             }
             if(gana3==0){
                 ganador=1;
                 System.out.println("El jugador "+_jugador2+" ha ganado"
                         + "\nYa no le quedan fantasmas malos al jugador 1");
                  Vfrase=_jugador2+" Triunfo porque "+_jugador1+ " le capturó todos sus fantasmas malos!";
                                     frasesV.add(Vfrase);
             }
             }
                         
                         salir=0;
 }
    
    
    
 }
 public void actualizar(){
     int j=0;
     for(int f=0;f<6;f++){
          
         for(int c=0;c<6;c++){
             
            if(j==0){
                System.out.println("\n  Columnas"
                        + "\n------------"
                        + "\n 0 1 2 3 4 5|Filas");
                        
                        
                j=1;
            }
             System.out.print(tableroS[f][c]); 
             
         }
        System.out.println("| "+f);
              }
     
 }   
    

 }
 
