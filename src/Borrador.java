import java.util.*;
 
public class Borrador {
 
	public static void main (String [] args) {
 
		Scanner leer=new Scanner (System.in);
		 boolean elNumero = false;
 
		int opcion;
 
 
		System.out.println("=================================");
		System.out.println("Menú");
		System.out.println("Para Buscar elige:   '1' ");
		System.out.println("Para Editar elige:   '2' ");
		System.out.println("para Eliminar elige: '3' ");
		System.out.println("Para Salir elige:    '0'");
		System.out.println("==================================");
		opcion= leer.nextInt();
 
 
		switch (opcion){
		case '1':
			int num[]=new int[0];
	        int a;
	        for(a=0;a<num.length;a++){
	            System.out.print("ingrese un número: ");
	            num[a]=leer.nextInt();
	        }
	        for(a=0;a<num.length;a++){
	            System.out.println(num[a]);
	        }
 
	        System.out.print("Buscar un número: ");
	        int numero;
	        numero=leer.nextInt();
 
	        for(a=0;a<num.length;a++){
	            if (numero == num[a]) {
	                System.out.println("El número esta en el indice "+a+", en la posicion "+(a+1));
	                elNumero = true;
	            }
	        }
 
	        if(elNumero==false) {
	            System.out.println("El numero no esta");
	        }
					break;
		case '2':
 
			System.out.print("Número de elementos del arreglo");
			int numero1=leer.nextInt();
			int[] arreglo=new int[numero1];
			for(int a1=0;a1<numero1;a1++){
			System.out.print("Elemento del campo"+(a1+1));
			arreglo[a1]=leer.nextInt();
			}
			System.out.print("Que elemento del arreglo quiere cambiar");
			int a1=leer.nextInt();
			System.out.print("Por cual elemento lo quiere cambiar");
			int b=leer.nextInt();
			arreglo[b]=a1;
			System.out.print("el arreglo queda");
			for(int b1=0;b1<numero1;b1++){
			System.out.print(""+arreglo[b1]);
			}
			break;
		case '3':
 
			System.out.println("Ingrese la posicion que desea eliminar");
			int a2 = new Scanner(System.in).nextInt();
			int[] arreglo1 = new int[0];
			if (a2 == arreglo1.length - 1) {
			arreglo1[a2] = 0;
			} else {
 
			for (int b1 = a2 + 1; b1 < arreglo1.length; b1++) {
			arreglo1[b1 - 1] = arreglo1[b1];
			}
 
			arreglo1[arreglo1.length - 1] = 0;
 
 
			for (int b1 = 0; b1 < arreglo1.length; b1++) {
			System.out.print(arreglo1[b1] + " - ");
			}
 
			System.out.println();
			}
			break;
		default:
			System.out.println("Ingrese un opción válida");
 
		}//Fin del Switch
 
 
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("| Gracias por usar mi programa       |");
		System.out.println("--------------------------------------");
	}
}