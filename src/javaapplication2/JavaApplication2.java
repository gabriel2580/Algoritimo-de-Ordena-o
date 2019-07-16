
package javaapplication2;

import java.util.Arrays;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        
        int[] arrayDesordenado = {9, 2, 3, 4, 7, 1, 5};
        
        for (int i = 0; i < arrayDesordenado.length; i++) {
            System.out.println(arrayDesordenado[i]);
        }
        
        System.out.println("\n Array ordenado:");
        
        Arrays.sort(arrayDesordenado);
        
        for (int i = 0; i < arrayDesordenado.length; i++) {
            System.out.println();
        }
        
    }
    
}
