import java.util.*;
public final class Ejercicio4 {

    public static void main(String[] args) {
        Ejercicio4 ejercicio4=new Ejercicio4();
    }
    int[] numeros=new int[10];
    int mayor=0;
    Scanner scanner=new Scanner(System.in);
    
    public Ejercicio4(){
        for(int i=0; i<10; i++){
            llenarArreglo(i);
            numeroMayor(i);
            impresion(i);
        }
        separacion();
    }
    
    public void llenarArreglo(int num){
        numeros[num]=((int)(Math.random()*16+1));
    }
    
    public void numeroMayor(int num){
        if (numeros[num]>mayor){
            mayor=numeros[num];
        }
    }
    public void impresion(int num){
        System.out.println("Numero en indice:"+num+" es "+numeros[num]);
    }
    public void separacion(){
        System.out.println("El numero mayor es "+mayor);
        for (int i=0; i<10; i++ ){
         int separacion=mayor-numeros[i];
         System.out.println("La separacion entre "+numeros[i]+" y "+mayor+" es "+separacion);
        } 
    }
}