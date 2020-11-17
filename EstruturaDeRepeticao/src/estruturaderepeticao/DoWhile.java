/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author berit
 */
public class DoWhile {
    public static void main(String[] args) {
            
    int cc = 0;
    do {
            System.out.println(cc);
            cc++;
    } while (cc <= 4);
    
    
    int n, s=0;
    String resposta;
    Scanner teclado = new Scanner(System.in);
    
    do {
        System.out.println("Digite um numero: ");
        n = teclado.nextInt();
        s += n;
        System.out.println("Quer continuar? S/N ");
        resposta = teclado.next();
    } while (resposta.equals("S"));
        System.out.println("A soma de todos os numeros é " + s);

    }
}
    
        
    

