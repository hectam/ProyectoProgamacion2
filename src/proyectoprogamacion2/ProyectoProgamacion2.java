
package proyectoprogamacion2;

import java.util.Scanner;


public class ProyectoProgamacion2 {

   
    public static void main(String[] args) {
 
        Scanner leer= new Scanner(System.in);//Scanner para leer nextInt
          Scanner re=new Scanner(System.in);//Scanner para leer nextLine
            int opcion=0;
            int opcionMenu=0;
            int salir=0;
            String usuario="";
            String contra="";
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
                       if(z == 0){
                           System.out.println("No hay jugadores creados, proceda a crear uno");
                           break;
                       }
                       System.out.println("Ingrese su nombre de usuario: ");
                       usuario=re.nextLine();
                       for(int f = 0; f<x;f++){
                           tupe++;
                           if(usuarios[f].equals(usuario)){
                               v++;
                               break;
                           }
                       }
                       if(v == 0){
                           System.out.println("Ese usuario no existe");
                           break;
                       }
                       System.out.println("Ingrese su contraseña: ");
                       contra=re.nextLine();
                       if(contras[tupe-1].equals(contra)){
                           System.out.println("La contra es correcta");
                           ingresa=1;
                       }else
                           System.out.println("La contra es incorrecta");
                       
                       break;
                       
                   case 2:
                     if(b == 0){
                                                  System.out.println("Ingrese un nombre de usuario:");
                       
                       usuarios[b] = re.nextLine();
                 
                       System.out.println("Ingrese su contraseña: ");
                       
                       contras[b] = re.nextLine();
                       ingresa=1;
                        b++;
                        x++;
                        z++;
                       break;
                       }
                       System.out.println("Ingrese un nombre de usuario:");
                                                  
                           
                       
                       
                       String user=re.nextLine();
                       for(int f=0;f<x;f++){
                           
                           if(usuarios[f].equals(user)){
                            tucu = 1;
                               
                           }
                      
                       }
                       if(tucu == 1){
                           System.out.println("ESE USUARIO YA EXISTE");
                           break;
                       }
                       usuarios[x] = user;
                       
                       System.out.println("Ingrese su contraseña: ");
                       
                       contras[z]=re.nextLine();
                       ingresa=1;
                       z++;
                       x++;
                        
                       break;
                       
                   case 3:
                      
                      break;
                      
                   default:
                       System.out.println("Ingrese una opcion valida");

                      
               } 
                  
               
               }while(opcion !=3 && ingresa !=1) ;
               if(ingresa==1){//se ejecuta solo si ingreso normal o con un usuario
               System.out.println("\t***Menu Principal***");
               System.out.println("1. Jugar Ghost"
                       + "\n2. Configuracion"
                       + "\n3. Reportes"
                       + "\n4. Mi Perfil"
                       + "\n5. Salir"
                       + "\n Seleccione una opcion");
               
               opcionMenu=leer.nextInt();
               switch(opcionMenu){
                   
               }
               }
               else if(opcion==3){//se ejecuta solo si se salio en el menu de inicio
                   opcion=3;
                   opcionMenu=5;
               }
               switch(opcionMenu){
                  
                   
               
                   
                   
                   
               }
               
               
               
           }while(opcion!=3&& opcionMenu!=5);
        
        
        
        
        
        
        
        }
        
       
    }
    

