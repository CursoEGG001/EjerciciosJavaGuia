/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.eje4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        
         System.out.println("Ingrese los datos del rectangulo");
         System.out.println("Ingrese la base");
         int base=leer.nextInt();
         System.out.println("Ingrese la altura");
         int altura=leer.nextInt();
         
         Rectangulo R1= new Rectangulo(base,altura);
         
   
        int option;
        
        do { System.out.println("MENU");
            System.out.println("1-CALCULAR SUPERFICIE");
            System.out.println("2-CALCULAR EL PERIMETRO");
            System.out.println("3-DIBUJAR");
            System.out.println("4-SALIR");
            System.out.println("");
            System.out.println("INGRESE UNA OPCION");
            option=leer.nextInt();
            switch (option){
                case 1: R1.CalculaSuperficie();
                break;
                case 2: R1.CalcularPerimetro();
                break;
                case 3: R1.Dibujar();
                default:
                                          
            }
          
        }while (option<4);
    }
    
}
