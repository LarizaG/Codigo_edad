/*
 * Author :Astrit Lariza Garcia Castillo
 * Fecha  :19_10_2021
 */

/*Realizar un codigo que determine si el usuario es mayor o menor de edad dependiendo del año de nacimiento*/

import java.util.Scanner;

public class codigojava{

 public static void main(String []args){

   int fechaNac, fechaAct = 2021, dif = 0;
   Scanner teclado = new Scanner(System.in);

   System.out.println("ingresa el año de nacimiento\n");

   fechaNac = teclado.nextInt();
   dif = fechaAct-fechaNac;

   if(dif>=18){

      System.out.println("El usuario tiene  " + dif +" Es mayor de edad");

   }else{

     System.out.println("El usuario tiene "+ dif +" Es menor de edad");
   }   

 }
} 
