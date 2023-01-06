// Luis Mora - Ariel Montoya
package problemas;


public class Problema5 {
    public static void main(String[] args) {
        int [][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int resultado;
        
        resultado = obtenerSuma(informacion);
        System.out.println(resultado);
    }
    
    public static int obtenerSuma(int [][] suma){
        int sumar = 0;
        int fila;
        int columna;
        
        for(fila = 0; fila < suma.length; fila++){
            for(columna = 0; columna < suma[fila].length; columna++){
                sumar = sumar + suma[fila][columna];
            }
        }
        
        return sumar;
        
    }
}
