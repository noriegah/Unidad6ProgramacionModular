import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        Ejercicio10 ejercicio10=new Ejercicio10();
    }
    Random rd=new Random();
    int matriz[][]=new int[3][4];
    int[][] matrizT = new int[matriz[0].length][matriz.length];
    int [][]matrizFinal=new int[3][8];

    public Ejercicio10(){

        generarMatriz();
        generarTranspuesta();
        mostrar();

        

    }
    public void generarMatriz(){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //aleatorios a conveniencia.
                matriz[i][j]=rd.nextInt(25);
            }
        }
    }
    public void generarTranspuesta(){
        for (int x=0; x < matriz.length; x++){
            for (int y=0; y < matriz[x].length; y++){
                matrizT[y][x] = matriz[x][y];
            }
        }
            
    }
    public void mostrar(){
        for(int matrizFinal[]:matriz){
            System.out.println(Arrays.toString(matrizFinal));
        }
        for(int matrizFinal[]:matrizT){
            System.out.println(Arrays.toString(matrizFinal));
        }
    }
}