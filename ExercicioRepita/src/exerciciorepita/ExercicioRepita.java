/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author berit
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, soma=0,pares=0, impares=0,maiorCem = 0,quantidade = 0;
        float media;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um valor: <br><em>(para interromper 0)</em></html>","Inserir Valor", JOptionPane.QUESTION_MESSAGE));
            soma += numero;
            
            if (numero % 2 == 0){
                pares++;
            } else{
                impares++;
            }
            
            if (numero > 100) maiorCem++;
            
            quantidade++;
            
        } while (numero != 0);
        
        quantidade -= 1;
        media = (float)soma/quantidade;
        
        
        JOptionPane.showMessageDialog(null,String.format("<html>RESULTADO FINAL:<hr><br>"
                + "<em>Soma total:</em> %d<hr><br>"
                + "<em>Total de numeros pares:</em> %d<hr><br>"
                + "<em>Total de numeros impares:</em> %d<hr><br>"
                + "<em>Total de numero acima de 100:</em> %d<hr><br>"
                + "<em>Quantidade de numeros digitados:</em> %d<hr><br>"
                + "<em>A media dos valores:</em> %.2f<hr><br>"
                + "</html>", soma,pares,impares,maiorCem,quantidade,media));
        
        
        
        
    }
    
}
