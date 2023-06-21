/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicacorchetes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PracticaCorchetes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        
        String cadena = teclado.nextLine();
        
        Queue<Character> cola = new LinkedList<>();
        
        for(char caracter : cadena.toCharArray()){
            if(caracter == '{' || caracter == '[' || caracter == '('){
                cola.add(caracter);
                System.out.println(cola);
            }else if(caracter == '}' || caracter == ']' || caracter == ')'){
                cola.poll();
                System.out.println(cola);
            }
        }
        System.out.println("Cola final: \n"+cola);
    }
}

