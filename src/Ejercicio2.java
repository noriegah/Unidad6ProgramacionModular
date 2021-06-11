package src;
import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {
       Ejercicio2 ejercicio2 = new Ejercicio2();
    }
    
    int[] numeros= new int[10];
    int mayor=0;
    Scanner scanner=new Scanner(System.in);
    
    public Ejercicio2(){
        for (int i=0; i<10; i++){
        llenarArreglo(i);
        mostrarArreglo(i);
        elementoMayor(i);
    }
        System.out.println("El numero mayor es "+mayor);
        repetidos();
    }
    
    public void llenarArreglo(int num){
        numeros[num]=((int)(Math.random()*100));
    }
    
    public void mostrarArreglo(int num){
        System.out.println("Número en Indice "+num+" ="+numeros[num]);
    }
    
    public int elementoMayor(int num){
        if (numeros[num]> mayor){
        mayor=numeros[num];
        }
        return 0;
    }
    
    public void repetidos(){
        int contador=0;
        for (int i=0; i<10; i++){
            if (numeros[i]==mayor){
                contador=contador+1;
            }
        }
        System.out.println("El numero mayor se repite "+contador+" veces");
    }
    
}