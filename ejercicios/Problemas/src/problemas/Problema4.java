// Luis Mora - Ariel Montoya
package problemas;

import java.util.Scanner;
import java.util.Locale;

public class Problema4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        int opcionDos;
        boolean bandera = true;
        String nombre;
        int cedula;

        while (bandera == true) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula:");
            cedula = entrada.nextInt();
            System.out.println("Ingrese 1 para calcular el valor de la luz:\n"
                    + "Ingrese 2 para calcular el valor del predio:");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                obtenerValorLuz(nombre, cedula);
            } else if (opcion == 2) {
                obtenerValorPredio(nombre, cedula);
            } else {
                System.out.println("Error, esa opcion NO EXISTE.");
            }
            System.out.println("Ingrese 1 para salir del programa:\n"
                    + "Ingrese 2 para continuar:");
            opcionDos = entrada.nextInt();
            if (opcionDos == 1) {
                bandera = false;
            }
        }

    }

    public static void obtenerValorLuz(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valorK;
        double consumo;
        double resultado;

        System.out.println("Ingrese costo del kilowatio:");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios consumidos en "
                + "el mes:");
        consumo = entrada.nextDouble();
        
        resultado = valorK * consumo;
        System.out.printf("\nCliente %s con cedula %d debe cancelar el valor "
                + "de $%.2f\n\n", nombre, cedula, resultado);

    }

    public static void obtenerValorPredio(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valor;
        double resultado;
        double descuento = 2;
        
        System.out.println("Ingrese valor del bien inmueble:");
        valor = entrada.nextDouble();
        
        resultado = (valor * descuento)/100;
        System.out.printf("\nCliente %s con cedula %d tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n\n", 
                nombre, cedula, valor, resultado);

    }

}
