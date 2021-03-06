/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author Guillermolp
 */
public class Tarea2 {
     public static void main (String[]args){   
    Scanner leer=new Scanner(System.in);
    System.out.print ("Numero de filas ");
        int n= leer.nextInt();
        for(int i=0;i<n;i++){
        
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
             }
                 for(int j=0;j<i;j++){
                System.out.print(" *");
                 }
              System.out.println("");
}
 
} 
}


