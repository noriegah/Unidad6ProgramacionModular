package src;
import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        Ejercicio9 ejercicio9=new Ejercicio9();
    }
    
    int[][] numeros1=new int[2][2];
    int[][] numeros2=new int [2][2];
    int [][] suma=new int[2][2];
    Scanner scanner=new Scanner(System.in);
    public Ejercicio9(){
        System.out.println("Matriz de 2x2");
        for (int i=0; i<2; i++){
            for (int k=0; k<2; k++){
        llenarArreglo1(i,k);
        llenarArreglo2(i,k);
        sumar(i,k);
                }
        impresion();
                }
    }
    
    public void llenarArreglo1(int num1,int num2){
        System.out.println("Arreglo 1. Ingrese el numero en la posicion "+num1+","+num2);
        numeros1[num1][num2]=scanner.nextInt();
    }
    
    public void llenarArreglo2(int num1,int num2){
        System.out.println("Arreglo 1. Ingrese el numero en la posicion "+num1+","+num2);
        numeros2[num1][num2]=scanner.nextInt();
    }
    
    public void sumar(int num1, int num2){
        suma[num1][num2]=numeros1[num1][num2]+numeros2[num1][num2];
    }
    public void impresion(){
        for (int i=0;i<2; i++){
            for (int k=0;k<2; k++){
                System.out.println("El resultado de la suma es Indice "+i+","+k+" es "+suma[i][k]);
            }
        }
    }
    
}