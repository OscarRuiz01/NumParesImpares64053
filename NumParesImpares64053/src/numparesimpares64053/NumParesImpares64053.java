/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares64053;

/**
 *
 * @author OscarRuiz
 */
public class NumParesImpares64053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Recorrer con un ciclo los primeros 100 números naturales 
        //( Del 1 al 100 ) e imprimir la suma de los impares y de los pares
        int contenedorA = 0;
        int contenedorB = 0;
        
        for (int i = 0; i <= 100; i++){
            if (i%2 == 0){
                contenedorA = contenedorA + i;
            }
            else {
                contenedorB = contenedorB + i;
            }
        }
         System.out.println("la suma de los impares es: " + contenedorB);
         System.out.println("La suma de los numeros pares es: " + contenedorA);    
    }
   
}
