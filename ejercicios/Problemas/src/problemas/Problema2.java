// Luis Mora - Ariel Montoya
package problemas;

import java.util.Scanner;
import java.util.Locale;

public class Problema2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        System.out.println("Ingrese 1 para calcular el area de un cuadrado.\n"
                + "Ingrese 2 para calcular el area de un triangulo.\n"
                + "Ingrese 3 para calcular el area de un rectangulo.");
        opcion = entrada.nextInt();
        
        if(opcion == 1){
            obtenerAreaCuadrado();
        }else if(opcion == 2){
            obtenerAreaTriangulo();
        }else if(opcion == 3){
            obtenerAreaRectangulo();
        }else{
            System.out.println("Error, la opcion que ingreso no existe.");
        }
    }
    
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double resultado;
        System.out.println("Ingrese la medida de un lado del cuadrado:");
        lado = entrada.nextDouble();
        resultado = lado * 4;
        System.out.printf("El area del cuadrado es: %.2f\n", resultado);
    }
    
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double resultado;
        System.out.println("Ingrese la medida de la base del triangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura del triangulo:");
        altura = entrada.nextDouble();
        resultado = (base * altura)/2;
        System.out.printf("El area del triangulo es: %.2f\n", resultado);
    }
    
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double resultado;
        System.out.println("Ingrese la medida de la base del rectangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura del rectangulo:");
        altura = entrada.nextDouble();
        resultado = base * altura;
        System.out.printf("El area del rectangulo es: %.2f\n", resultado);
    }
}
