package Retos2;
//Importar clase Scanner
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
       // Declarar matriz nombre y precio producto
       String [][] nombreprodu;
       int [][] precioprodu;
       // Instanciar clase scanner
       Scanner capturar = new Scanner (System.in);
       // Inicializar la matriz
       nombreprodu=new String [4][4];
       precioprodu=new int [4][4];
       // Realizar ciclo for
       for(int filas=0; filas<4; filas++){
        for(int columnas=0; columnas<4; columnas++){
            // Solicitar nombre del producto
            System.out.println("Ingrese el nombre del producto");
            // Capturar nombre del producto
            nombreprodu[filas][columnas]=capturar.next();
            // Solicitar precio del producto
            System.out.println("Ingrese el precio del producto");
            // Capturar precio del producto      
            precioprodu[filas][columnas]=capturar.nextInt();
    }
}   // Realizar 2 ciclo for 
    for(int fila=0; fila<4; fila++){
        System.out.println("\n");
        for(int columna=0; columna<4; columna++){
            // Mostrar la fila y la columna de la matriz, el nombre y el precio del producto
            System.out.print("" + fila + "" + "" + columna + "" + "\t" + nombreprodu[fila][columna] + "\t" + precioprodu[fila][columna] + "\t");
    }
}
    // Limpiar Buffer
    capturar.close();
    }
    
}
