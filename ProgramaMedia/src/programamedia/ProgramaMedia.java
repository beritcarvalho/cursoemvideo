/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author berit
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primeira nota: ");
        float n1 =  entrada.nextFloat();
        
        System.out.println("Segunda nota: ");
        float n2 = entrada.nextFloat();
        float m = (n1 + n2) / 2;
        
        System.out.printf("Sua média é %.2f\n",m);
        
        if (m > 9){
            System.out.println("PARABÉNS");
        }
        
        System.out.println("fim da estrutura condicional SIMPLES");
        
        
        System.out.println("INICIO DA ESTRUTURA CONDICIONAL COMPOSTA");
        
        System.out.println("Digita o ano do seu nascimento: ");
        int nascimento = entrada.nextInt();
        int idade = 2020-nascimento;
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18){
            System.out.println("MAIOR DE IDADE");
        }
        else{
            System.out.println("MENOR DE IDADE");
        }
        
        
        
        
    }
    
}
