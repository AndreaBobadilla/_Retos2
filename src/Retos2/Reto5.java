package Retos2;
// Importar clase Scanner
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        // Declarar matriz
        String [][] caritas;
        int fila, columna, filas, columnas;
        // Instanciar clase scanner
        Scanner capturar = new Scanner (System.in);
        // Inicializar la matriz
        caritas = new String[3][4];
        // LLenar matriz
        caritas[0][0]= ":v";
        caritas[0][1]= ":(";
        caritas[0][2]= ":3";
        caritas[0][3]= ":)";
        caritas[1][0]= "._.";
        caritas[1][1]= ":v";
        caritas[1][2]= ":3";
        caritas[1][3]= "^_^";
        caritas[2][0]= "._.";
        caritas[2][1]= ":(";
        caritas[2][2]= ":)";
        caritas[2][3]= "^_^";

        // Realizar ciclo for
        for(int i=0; i<2; i++){
            // Solicitar posiciones 
            System.out.println("Digite la fila de su preferencia: ");
            // Capturar posiciones
            fila = capturar.nextInt();
            // Solicitar posiciones
            System.out.println("Digite la columna de su preferencia: ");
            // Capturar posiciones
            columna = capturar.nextInt();
            if(fila<=3 && columna<=4){
            System.out.println(caritas[fila][columna]);
            }else{
            System.out.println("Valor invalido");
        }
        }
        // Incompleto :((((

/* 
        // Mostrar matriz 
        System.out.print(caritas[0][0] + "\t");
        System.out.print(caritas[0][1] + "\t");
        System.out.print(caritas[0][2] + "\t");
        System.out.print(caritas[0][3] + "\t");
        System.out.print(caritas[1][0] + "\t");
        System.out.print(caritas[1][1] + "\t");
        System.out.print(caritas[1][2] + "\t");
        System.out.print(caritas[1][3] + "\t");
        System.out.print(caritas[2][0] + "\t");
        System.out.print(caritas[2][1] + "\t");
        System.out.print(caritas[2][2] + "\t");
        System.out.print(caritas[2][3] + "\t");
*/
    }
}
