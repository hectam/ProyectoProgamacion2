/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamacion2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class pruebas {
    public static void main(String[] args) {
        int salir=0;
        GhostGame probar=new GhostGame();
        int encontrado=0;
         Scanner leer=new Scanner(System.in);
        Player prueba=new Player();
        
        probar.Tablero();
        probar.actualizar();
        
        
        
        do{
       
        System.out.println("Ingrese nombre: ");
        String nombre=leer.next();
        prueba.setNombre(nombre);
        System.out.println("Ingrese contra:");
        String contra=leer.next();
        prueba.setContra(contra);
        System.out.println("1. no"
                + "\n2. si");
        salir=leer.nextInt();
        }while(salir!=1);
        System.out.println("a quien desea buscar?");
            String buscar=leer.next();
        for(int i=0;i<prueba.player.size();i++){
            
            if(buscar.equals(prueba.player.get(i))){
                System.out.println("ese jugar esta en la posicion "+ (i));
                encontrado=1;
            }
            
            }
        if(encontrado==1){
            encontrado=0;
            System.out.println("busqueda existosa");
        }else if(encontrado==0){
            System.out.println("no se encontro");
        }
        
    
        
        
        
    }
    
    
    
}
