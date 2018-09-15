
package proyectoprogamacion2;

import java.util.Scanner;
import java.util.Random;

public class ProyectoProgamacion2 {

   
    public static void main(String[] args) {
 Player jugador=new Player();
 GhostGame logica=new GhostGame();
        Scanner leer= new Scanner(System.in);//Scanner para leer nextInt
          Scanner re=new Scanner(System.in);//Scanner para leer nextLine
          Random ran=new Random();
          int max=0;
          int min=0;
            int opcion=0;
            int opcionMenu=0;
            int salir=0;
            int end=0;//variable que el menu principal regrese despues de terminar un proceso
            String usuario="";
            String contra="";
            String jugador2="";
            String jugador1="";
            int noEncontrado=0;//define si el usuario ingresado para el jugador 2 no existe
            int x=0;//Para determinar la posicion de la creacion del NOMBRE de un usuario en el arreglo y para encontrar usuarios ya ingresados
            int z=0;//Para determinar la posicion de la creacion de la Contrasena de un usuario en el arreglo
            int b = 0;//variable para identificar el primer ingreso
            int v = 0;//identificar usuarios que no existen en el arreglo
            int tucu = 0;//para encontrar un usuario existente en el arreglo
            int ingresa=0;//contador par ingresar al menu principal
             String usuarios[]=new String[100];
               String contras[]=new String[100];
           do{
               do{
              
               int tupe = 0;// posicion de usuario
               System.out.println("\t***Menu De Inicio*** "
                       + "\n 1. Login"
                       + "\n 2. Crear Player"
                       + "\n 3. Salir del sistema"
                       + "\n Ingrese una opcion: ");
               opcion=leer.nextInt();
               
               switch (opcion){
                   case 1:
                       v=0;
                       if(jugador.player.isEmpty()){
                           System.out.println("No hay jugadores creados, proceda a crear uno");
                           break;
                       }
                       System.out.println("Ingrese su nombre de usuario: ");
                       usuario=re.nextLine();
                       for(int f = 0; f<x;f++){
                           tupe++;
                           if(jugador.player.get(f).equals(usuario)){
                               v++;
                               break;
                           }
                       }
                       if(v == 0){
                           System.out.println("Ese usuario no existe");
                           ingresa=0;
                           break;
                       }
                       System.out.println("Ingrese su contraseña: ");
                       contra=re.nextLine();
                       if(jugador.password.get(tupe-1).equals(contra)){
                           System.out.println("La contra es correcta");
                           ingresa=1;
                           jugador1=usuario;
                       }else{
                           System.out.println("La contra es incorrecta");
                       ingresa=0;
                       }
                       break;
                       
                   case 2:
                     tucu=0;
                       System.out.println("Ingrese un nombre de usuario:");
                                                  
                           
                       
                       
                       String user=re.nextLine();
                       
                       for(int f=0;f<x;f++){
                           
                           if(jugador.player.get(f).equals(user)){
                            tucu = 1;
                               
                           }
                      
                       }
                       if(tucu == 1){
                           System.out.println("ESE USUARIO YA EXISTE");
                           ingresa=0;
                           break;
                       }
                       jugador.setNombre(user);
                       
                       System.out.println("Ingrese su contraseña: ");
                       
                       String Ncontra=re.nextLine();
                       jugador.setContra(Ncontra);
                       jugador1=user;
                       ingresa=1;
                       z++;
                       x++;
                       jugador.setpuntuacion(0);
                        
                       break;
                       
                   case 3:
                      
                      break;
                      
                   default:
                       System.out.println("Ingrese una opcion valida");

                      
               } 
                  
               
               }while(opcion !=3 && ingresa !=1) ;
               if(ingresa==1){//se ejecuta solo si ingreso normal o con un usuario
                   do{
               System.out.println("\t***Menu Principal***");
               System.out.println("1. Jugar Ghost"
                       + "\n2. Configuracion"
                       + "\n3. Reportes"
                       + "\n4. Mi Perfil"
                       + "\n5. Cerrar Sesion"
                       + "\n Seleccione una opcion");
               
               opcionMenu=leer.nextInt();
               switch(opcionMenu){
                   case 1:
                      
                        
                      
                       
                       
                       System.out.println("Ingrese el username del jugador 2:");
                       jugador2=re.nextLine();
                       for(String us: jugador.player){
                           if(jugador2.equals(us)){
                               System.out.println("Username encontrado!");
                               noEncontrado=1;
                           }
                       }
                       if(jugador2.equals(usuario)){
                       System.out.println("Ese usuario es el jugador 1!!!");
                       break;
                   }else if(jugador2.equals(jugador.player.get(x-1))){
                        System.out.println("Ese usuario es el jugador 1!!!");
                        break;
                   }
                   if(noEncontrado==0){
                               System.out.println("Usuario no existente, ingrese uno ya creado!!!!!");
                               break;
                           }else if(noEncontrado==1){
                              
                              logica.Tablero();
                              logica.actualizar();
                              logica.movimiento(jugador1, jugador2);
                              
                               
                              
                           }
                   break;
                   case 2:
                       System.out.println("Confirguracion: "
                               + "\n1.Dificultad"
                               + "\n2.Modo de juego");
                       int confi=leer.nextInt();
                       switch (confi){
                           case 1:
                               logica.dificultad();
                               break;
                           case 2:
                               logica.Modo();
                               break;
                       }
                       
                   default:
                       System.out.println("Ingrese opcion valida");
                       break;
                   
               }
                   }while(end !=1 && opcionMenu !=5);
               }
               else if(opcion==3){//se ejecuta solo si se salio en el menu de inicio
                   opcion=3;
                   opcionMenu=5;
               }
             
               
               
               
           }while(opcion!=3);
        
        
        
        
        
        
        
        }
        
       
    }
    

