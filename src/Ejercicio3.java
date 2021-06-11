package src;
import java.util.*;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Ejercicio3 ejercicio3=new Ejercicio3();
    }
    int[] numeros=new int[8];
    int numBusqueda;
    Scanner scanner=new Scanner(System.in);
    
    public Ejercicio3(){
        for (int i=0; i<8; i++){
        llenarArreglo(i);
        }
        System.out.println("Ingrese numero a buscar");
        numBusqueda=scanner.nextInt();
        int v=busqueda(numBusqueda);
        if (v==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
    public void llenarArreglo(int num){
        System.out.println("Ingrese valor para Arreglo indice: "+num);
        numeros[num]=scanner.nextInt();
    }
    
    public int busqueda(int num){
        int vf=0;
        for (int i=0; i<8; i++){
            if (numeros[i]==num){
                vf=1;
            }
        }
        return vf;
    }
}