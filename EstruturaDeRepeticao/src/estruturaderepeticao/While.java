/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticao;

/**
 *
 * @author berit
 */
public class While {
    public static void main(String[] args) {
        int contador = 0;
        
        while (contador<20){
            System.out.println("Contador " + contador);
            contador++;
        }
        System.out.println("fim do 1° while\n");
        
        contador = 0;
        
        //continue ele ignora aquela momento e reinicia o ciclo.
        while (contador < 20){
            contador++;
            if ( contador == 3 || contador == 6 || contador == 9 ){
            continue;
            }
            System.out.println("contador " + contador);
        }
        System.out.println("fim do 2° while utilizando o continue\n");
        
        
        contador = 0;
        while (contador < 20){
            contador++;
            if (contador == 7){
                break;
            }
                System.out.println("contador " + contador);
            }
            System.out.println("fim do 3 while break contador==7");
    }
}
