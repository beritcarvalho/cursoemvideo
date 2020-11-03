/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Sandra
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float nota = 8.5f;
        nota = (float)8.5;
        System.out.println("A nota é " + nota);
        System.out.printf("A nota é %.2f\n", nota);
        
        String nome = "Berit";
        
        System.out.printf("A nota do %s é %.2f\n",nome, nota);
        
             
        System.out.print("Escreva um nome: ");
        nome = teclado.nextLine();

        System.out.print("Escreva uma nota: ");
        nota = teclado.nextFloat();
        
        System.out.printf("A nota do %s é %.2f\n",nome, nota);
        
    }
    
}
