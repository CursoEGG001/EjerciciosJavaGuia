/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroimpar;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class ParoImpar {

    /**
     *Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
    int num;
    Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un numero:");
        num=leer.nextInt();
        
        if (num %2==0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        
        }
    
}
