package Retos2;
// Importar clase Scanner
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        // Declarar variables 
        String let, letra;
        String [] pala;
        int inte = 0, let1 = 0, let2 = 0;
        // Instanciar clase scanner
        Scanner capturar = new Scanner(System.in);
        // Solicitar numero de letras de la palabra
        System.out.println("Digita la cantidad de letras que tiene tu palabra");
        // Capturar la cantidad de letras
        pala = new String[let1 = capturar.nextInt()];
        // Realizar ciclo for 
        for (int i = 0; i < pala.length; i++){
            // Solicitar letras
            System.out.print("Ingresa la letra "+(i+1)+" de tu palabra: ");
            // Capturar letras
            let = capturar.next().toLowerCase();
            pala[i] = let;
            // Realizar 2 ciclo for
            for(int j = 0; j < pala.length; j++){
                // Condicion while validando intentos
                while(inte <= 5){
                    System.out.print("Ingrese la letra" + (j+1) + ": ");
                    letra = capturar.next().toLowerCase();
                    // Comparar letras segun su posicion
                    if (pala[j].equalsIgnoreCase(letra)) {
                        System.out.println("Muyyy bien, La letra" + j + " es " + letra + "\n");
                        break;
                    } else {
                        System.out.println("Letra ingresada no valida");
                        // Aumentando el numero de intentos si llega a 5 pierde
                        inte += 1;
                    }
                }
            }
        }
        // Condicional if para evaluar si completo la palabra correctamente y mostrar la palabra
        if(let2 == pala.length){
            System.out.println("Felicitaciones-> Su palabra era:");
            for (int i = 0; i < pala.length; i++){
                System.out.print(pala[i]);
            }
            // En dado caso que se haya pasado de intentos le va a mostrar
        }else if(inte >= 5){
            System.out.println("Se paso del numero de intentos");
        }
        // Limpiar Buffer
        capturar.close();
    }
        }
        

