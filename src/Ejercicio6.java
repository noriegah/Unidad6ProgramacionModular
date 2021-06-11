package src;

import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 ejercicio6=new Ejercicio6();
    }
    int numeros[][]={{5,6,13},{14,2,4},{21,7,6}};
    
    public Ejercicio6 (){
        for (int i=0; i<3; i++){//filas
            for(int k=0; k<3; k++){
                multiplicar2(i,k);
            }
        }
    }
    
    public void multiplicar2(int num1, int num2){
        int multi=numeros[num1][num2]*2;
        System.out.println("El numero en el indice "+num1+","+num2+" multiplicado por 2 es "+multi);
    }
    
}