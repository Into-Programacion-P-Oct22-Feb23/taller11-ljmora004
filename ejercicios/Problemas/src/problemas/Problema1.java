// Luis Mora - Ariel Montoya
package problemas;


public class Problema1 {


    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        
        int fila;
        int columna;
        
        for(fila = 0; fila < datos.length; fila++){
            for(columna = 0; columna < datos[fila].length; columna++){
                if(datos[fila][columna] % 2 == 0){
                    System.out.printf("%d\n", datos[fila][columna]);
                }
            }
        }

    }

}
