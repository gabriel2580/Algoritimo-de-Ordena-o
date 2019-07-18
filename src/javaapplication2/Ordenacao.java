
package javaapplication2;


public class Ordenacao {
    
    public static int[] bubbleCrescente(int[] vetorDes) {

        int[] vetorOrdenado = vetorDes;
        int aux = 0;

        for (int i = 0; i < vetorDes.length; i++) {
            for (int j = 0; j < (vetorDes.length - 1); j++) {
                //"<>"altera a ordem crescente e decrescente.
                if (vetorOrdenado[j] < vetorOrdenado[j + 1]) {
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;
                }
            }
        }
        
        return vetorOrdenado;
        
    }
    
}
