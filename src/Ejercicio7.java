package src;
import java.util.*;
public class Ejercicio7 {

    public static void main(String[] args) {
        Ejercicio7 ejercicio7=new Ejercicio7();
    }
    int[][] numeros= new int[4][3];
    int sumaT=0;
    
    public Ejercicio7(){
        for (int i=0; i<4; i++){//filas
            for(int k=0; k<3; k++){
                llenadoArreglo(i,k);
                suma(i,k);
            }
        }
        System.out.println("La suma de todos los elementos del arreglo es "+sumaT);
    }
    public void llenadoArreglo(int num1,int num2){
        numeros[num1][num2]=((int)(Math.random()*556));
        System.out.println("Numero generado en el indice "+num1+","+num2+" es "+numeros[num1][num2]);
    }
    
    public void suma(int num1, int num2){
        sumaT+=numeros[num1][num2];
    }
}
