// Luis Mora - Ariel Montoya
package problemas;

import java.util.Scanner;
import java.util.Locale;

public class Problema3 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String mensaje;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        System.out.println("Ingrese la primera nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota:");
        nota4 = entrada.nextDouble();
        
        mensaje = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.2f %.2f %.2f %.2f es %s\n",
                nota1, nota2, nota3, nota4, mensaje);
        
        
    }
    
    public static String obtenerPromedio(double n1, double n2, double n3, 
            double n4){
        double promedio;
        String cadena = "";
        promedio = (n1 + n2 + n3 + n4)/4;
        
        if(promedio >= 0 && promedio <= 5){
            cadena = "Regular";
        }else if(promedio >= 5.1 && promedio <= 8){
            cadena = "Bueno";
        }else if(promedio >= 8.1 && promedio <= 9){
            cadena = "Muy bueno";
        }else if(promedio >= 9.1 && promedio <= 10){
            cadena = "Sobresaliente";
        }
        
        return cadena;
    }
    
}
