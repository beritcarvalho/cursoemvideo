
import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berit
 */
public class VetorForEch {
    public static void main(String[] args) {
        
        int num[] = {3,5,1,8,4};
        
        //deixar os valores em ordem
        Arrays.sort(num);
        for (int valorDoVetor: num){
            System.out.println(valorDoVetor);
        }
        
        
        //buscar um valor no vetor, se nao encontrar sempre vai retornar um indice negativo. pois nao existem indices negativos.
        int pos = (Arrays.binarySearch(num, 10));
        System.out.println("Encontrei o valor na posicao: "+pos);
        
        int vetor[] = new int[10];
        
        
        //preencher todas posicoes com 8
        Arrays.fill(vetor, 0);
        for(int valor: vetor){
            System.out.print(valor + " ");
        }
        
    }
    
}
