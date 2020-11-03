/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Sandra
 */
public class TesteTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
             
        int numInt,numInt2;
        String numString,numString2;
        
        System.out.println("Digite um numero para convertelo para String: ");
        numInt = teclado.nextInt();
        
        System.out.println(numInt + " Está em Int");
        
        System.out.println("Aguarde a conversão");
        
        numString = Integer.toString(numInt);
        System.out.printf("Agora %s está em String\n", numString);
        
        
        numString2 = "30";
        System.out.println(numString2 + "Está em String");
        System.out.println("Convertendo");
        
        numInt2 = Integer.parseInt(numString2);
        
        
        System.out.printf("Agora %d está em Int\n", numInt2);

        


        
        
        
        
        
    }
    
}
