/*
Fa�a um programa que leia uma sequ�ncia de 10 n�meros e armazene-os num vetor. Informe o
total de ocorr�ncias do �ltimo n�mero lido.
Entrada: V = {12, 38, 4, 23, 5, 6, 7, 4, 12, 4}
Sa�da: O n�mero 4 foi informado 3 vezes
 */
package listarevisao;

import java.util.Scanner;

public class ListaRevis�o9 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int v[] = new int [10];
        int occ = 0;
        
         for (int i = 0; i < 10; i++) {
             v[i] = entrada.nextInt(); 
         }
         for (int i = 0; i < 10; i++) {
             if(v[i] == v[9]){
                 occ = occ + 1;
             }             
         }
         System.out.println("O n�mero " + v[9] + " foi informado " + occ + " vezes ");
     }
    
}
