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
public class teste {
    public static void main(String[] args) {
        int contador = 0;
        String espaco= "";
            while (contador <= 10){
                espaco += contador + "-";
                contador++;
        }
        System.out.println(espaco);
        String page1 = espaco.substring(0, (espaco.length()-1));
        System.out.println(page1);
    }
}
