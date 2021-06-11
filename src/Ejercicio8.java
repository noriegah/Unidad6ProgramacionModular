package src;
import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8 ejercicio8=new Ejercicio8();
    }
    
    String[] palabras1=new String [5];
    String[] palabras2=new String [5];  
    Scanner scanner=new Scanner(System.in);
    public Ejercicio8(){
        for(int i=0; i<5; i++){
            llenado(i);
        }
        long tamaño1=palabras1[0].chars().filter(ch -> ch != ' ').count();
        long tamaño2=palabras2[0].chars().filter(ch -> ch != ' ').count();
        System.out.println("COMPARACION ARREGLO 1 Y 2 EN POSICION 0");
        System.out.println("Tamaño palabra Arreglo 1 es "+tamaño1);
        System.out.println("Tamaño palabra Arreglo 2 es "+tamaño2);
        if (tamaño1==tamaño2){
            System.out.println("Tienen el mismo tamaño");
        }else{
            System.out.println("No tienen el mismo tamaño");
        }
        if (palabras1[0].equals(palabras2[0])){
            System.out.println("Tienen la misma palabra");
        }else {
            System.out.println("No tienen la misma palbra");
        }
    }
    
    public void llenado(int num1){
           System.out.println("Ingrese una palabra para Arreglo 1 indice "+num1);
            palabras1[num1]=scanner.nextLine();
            System.out.println("Ingrese una palabra para Arreglo 2 indice "+num1);
            palabras2[num1]=scanner.nextLine(); 
    }
}