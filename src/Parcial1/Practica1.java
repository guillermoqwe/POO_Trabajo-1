/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
import java.util.Scanner;
public class Practica1 {
    public static void main (String[]args){   
    Scanner leer=new Scanner(System.in);
    System.out.print ("N");
        int n= leer.nextInt();
        for(int i=0;i<n;i++){
             for(int k=0-1;k>0;k--){
                 System.out.print (" ");
             }
                 for(int k=0;k<i;k++){
                 System.out.print (" *");
                 }
              System.out.println ("");
}
} 
}



