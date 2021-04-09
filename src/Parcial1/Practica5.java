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
public class Practica5 {

    public static void  main (String []args){
        Scanner entrada = new Scanner (System.in);
        int arreglo [],numero;
        
        arreglo= new int[10]; 
        do{
            System.out.println("Rellenar el Arreglo:");
            for(int i=0 ;i<10;i++){
                System.out.print(i+".Digite un numero "); 
                arreglo[i]=entrada .nextInt();       
        }
        }while(arreglo==arreglo );
        System.out.println("\n digite un numero a buscar en el arreglo :");
          numero=entrada.nextInt();
          int i=0;
          while (i<10 && arreglo[i]<numero){
              i++;
          }
          if(i==10){
              System.out.println("Numero no encontrado");
          }
          else{
              if(arreglo[i]==numero){
                  System.out.println("Numero encontrado y esta en la posision:"+i);
              }
              else{
                  System.out.println("\n Numero no encotrado ");
              }
          }
       }
    }