/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author berit
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatorial fator = new Fatorial();
        fator.setValor(5);
        System.out.println(fator.getFormula());
        System.out.println(fator.getFatorial());
    }
    
}
