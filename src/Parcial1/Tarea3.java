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
public class Tarea3 {
      public static void main (String[]args){   
    Scanner leer=new Scanner(System.in);
    System.out.print ("Cuanos numros desas Capturar :");
        int T= leer.nextInt();
        int a[]=new int [T];
        System.out.print ("Ingrese los ingresa los numeros");
        for(int i=0;i<T;i++)
        {
         a[i]=leer.nextInt();   
        }
        int aux=0;
        for(int j=0;j<T;j++)
        {
            for(int i=0;i<T-1;i++)
            {
       if(a[i]>a[i+1])
       {
           aux=a[i];
           a[i]=a[i+1];
           a[i+1]=aux;
       }
       }
        }
  
         int k= 0;
            System.out.print("Numeros Ordenados :");
            while(k<T)
            {
             System.out.println(a[k]);   
             k++; 
            }
      }
}

