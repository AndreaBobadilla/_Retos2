package Retos2;
// Importar clase scanner
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        // Declarar variable 
        int cantcompeti;
        double menortiem;
        //Instanciar clase 
        Scanner capturar=new Scanner (System.in);
        //Solicitar cantidad de competidores
        System.out.println("Digite la cantidad de competidores que va a ingresar: ");
        //Capturar cantidad de competidores
        cantcompeti = capturar.nextInt();
        //Declarar array competidor y tiempo
        String competidor [] = new String[cantcompeti];
        double tiempo [] = new double[cantcompeti];
        //Realizar ciclo for
        for(int i=0; i<competidor.length; i++){ 
            //Solicitar nombre del competidor 
            System.out.println("Ingrese el nombre del competidor "+(i+1)+": ");
            //Capturar nombre del competidor 
            competidor[i] = capturar.next();
            //Solicitar tiempo del competidor
            System.out.println("Ingrese el tiempo completo (contando todos los ceros) del competidor "+(i+1)+" en (horas o minutos o segundos): ");
            //Capturar tiempo del competidor
            tiempo[i] = capturar.nextDouble();
        }
        //Inicializar variable menortiem -> dato que se deposite en el tiempo en la posicion 0
        menortiem = tiempo[0];
        // Realizar 2 ciclo for
        for(int i=0; i<tiempo.length; i++){
            // Utilizar condicional if para evaluar cual es el tiempo menor de todos 
            if(tiempo[i]<menortiem){
                menortiem = tiempo[i];
            }
        }
        System.out.println("Los competidores con sus respectivos tiempos son: ");
        // Realizar 3 ciclo for para mostrar los datos ingresados
        for(int i=0; i<cantcompeti; i++){
            // Mostrar datos ingresdados nombres y tiempo de los competidores
            System.out.println(competidor[i] + ": " + tiempo[i] + "\t");
        }
        // Mostrar menor tiempo de todos
        System.out.println("El competidor ganador con el menor tiempo es: "+ menortiem);
              
    // Limpiar Buffer
    capturar.close();
}
}
