package Retos2;
// Importar clase Scanner
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        // Declarar variables
        int cantnot;
        float suma = 0, prome = 0;
        //Instanciar clase 
        Scanner capturar=new Scanner (System.in);
        //Solicitar cantidad de notas
        System.out.println("Digite la cantidad de notas que va a ingresar: ");
        //Capturar cantidad de notas
        cantnot = capturar.nextInt();
        //Declarar array notas
        int [] notas=new int[cantnot];
        //Realizar ciclo for
        for(float dato:notas){
            //Solicitar nota
            System.out.println("Digite la nota: ");
            //Capturar nota
            dato = capturar.nextFloat();
            //Suma de las notas
            suma = suma + dato;
        }
        // Mostrar mensaje con la suma de las notas
        System.out.println("La suma de todas las notas es: " + suma);
        // Calcular el promedio de la suma de las notas
        prome = suma / cantnot;
        // Mostrar mensaje con el promedio de las notas
        System.out.println("El promedio de todas las notas es: " + prome);
        // Realizar condicional if para saber si pasa o no pasa (promedio es menor a 3 Reprobo, promedio esta entre 3 y 4.0 Aprobo Raspando, promedio es mayor a 4.0 Aprobo con buenos resultados)
        if(prome<3.0){
            System.out.println("Usted Reprobó");
        }else if(prome==3.0 || prome==4.0){
            System.out.println("Usted Paso Raspando");
        }else if(prome>4.0){
            System.out.println("Usted Aprobó con buenos resultados");
        }else{
            // Si no es ninguna de las anteriores se termina la condicion  con:
            System.out.println("El promedio no es valido");
        }
        // Limpiar Buffer 
        capturar.close();
    }
    }

