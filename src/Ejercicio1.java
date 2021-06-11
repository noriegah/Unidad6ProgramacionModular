package src;
import java.util.*;
public class Ejercicio1 {

    public static void main(String[] args) {
       Ejercicio1 ejercicio1=new Ejercicio1();
    }
    
    int[] numero=new int[5];
    Scanner scanner=new Scanner(System.in);
    
    public Ejercicio1(){
        for (int i=0; i<5; i++){
            ejercicio1.pedirNumeros(i);
        }
        ejercicio1.mostrarNumeros();
    }
    
    public void pedirNumeros(int num){
        System.out.println("Ingrese numero para llenar arreglo");
        numero[num]=scanner.nextInt();
    }
    
    public void mostrarNumeros(){
        for (int i=0; i<5; i++){
         System.out.println("Indice del Arreglo:"+i+" Numero Almacenado: "+numero[i]);   
         }
    }
}