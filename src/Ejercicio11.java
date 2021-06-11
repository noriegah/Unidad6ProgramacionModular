package src;
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Ejercicio11 ejercicio11=new Ejercicio11();
    }
    public Ejercicio11(){
        pedirDatos();
        promedio();
        mostrarResultados();
    }
    Scanner scanner=new Scanner(System.in);
    String[] nombres=new String [5];
    String[] notas=new String[5];
    String[] estado=new String[5];
    int i=0;
    int j=0;
    int notasInt[]=new int [5];
    int promedioNotas=0;
    int contNotas=0;

    public void pedirDatos(){
        do{
            System.out.println("Dame el nombre el estudiante:");
            nombres[i]=scanner.nextLine();
            i++;

            System.out.println("Dame el la nota el estudiante rango 0-10:");
            notas[j]=scanner.nextLine();
            j++;

            notasInt[i]=Integer.parseInt(notas[j]);

        }while(notasInt[i]>=0 && notasInt[i]<=10);
    }
    public void promedio(){
        for(int i =0;i<=10;i++){
            for(int j=0;j<5;j++){
                if(i<=5){
                    estado[j]="Reprobado";
                }if(i>5 && i<=7){
                    estado[j]="Bien";
                }if(i>7 && i<=9){
                    estado[j]="Notable";
                }if(i==10){
                    estado[j]="Sobresaliente";
                }
            }
        }  
    for(int i=0;i<notas.length;i++){

        if(notasInt[i]>=0){
            contNotas=contNotas+notasInt[i];
        }

       
    }
        
        
    }
    public void mostrarResultados(){
        for(int i=0;i<5;i++){
            System.out.println("Nombre: "+nombres[i]+ "Nota: "+notas[i]+"Estado: "+estado[i]);
        }
    }

}