
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class ManejoCadena {

    public static void main(String nada[]) {
        int cadena1[] = {1,2,3};
        int cadena2[] = {1,2};
//        int cadena1[] = new int[5];
//        int cadena2[] = new int[5];
       String a="hola., hola,";
//        llenarVector(cadena1);
//         llenarVector(cadena2);
        System.out.print("cadena 1: ");
        imprimir(cadena1);
        System.out.print("cadena 2: ");
        imprimir(cadena2);
//        System.out.print("cadena 1 copiada en 2: ");
////        cadena2=copiarCadena1EnCadena2(cadena1, cadena2);
//        imprimir(cadena2);
        int union[]=añadirAlFinal(cadena1, cadena2);
        imprimir(union);
      
       
    
//        int c=contadorDeFrases(a);
        System.out.print(contadorDeFrases(a));
        System.out.print(similares(cadena1, cadena2));
        System.out.print(cadenaContenida(cadena1, cadena2));

    }
    /**
     * Método para llenar el vectro con números aleatorios
     * @param v: recibe un vector como parametro para ser llenado
     */
    public static void llenarVector(int v[]) {

        for (int i = 0; i < v.length; i++) {
            int dato = (int) (Math.random() * 20);
            v[i] = dato;
        }
    }
    /**
     * Método que retona la cadena de caracteres del vector
     * @param v: recibe un vector de tipo entero como parámetro
     * @return retorna la cadena de caracteres
     */
    public static String toString(int v[]) {

        String msg = "";
        for (int dato : v) {
            msg += dato + ",";
        }
        return (msg);
    }

    /**
     * Método para realizar la impresión del vector
     * @param v: recibe un vector de tipo entero como parámetro
     */
    public static void imprimir(int v[]) {
        System.out.println(toString(v));

    }
    
    /**
     *Método que raliza la copia de los elementos que se encuentran en el vector "v" en el vector "v2"
     * @param v: vector lleno de tipo entero 
     * @param v2: vector vacio de tipo entero, que será llenado respectivamente
     * @return retorna el vector con la copia de los  elementos del vector 1
     */
    public static int [] copiarCadena1EnCadena2 (int v[], int v2[]){
        
        for (int i=0; i<v.length;i++){
            v2[i]=v[i];
        }
     return v2;   
    }
    
    /**
     * Método que une dos vectores
     * @param v: vector de tipo entero 
     * @param v2: vector de tipo entero
     * @return retorna un nuevo vector con los elementos del vector "v" y "v2"
     */
    public static int[] añadirAlFinal (int v[], int v2[]){
        int union[]= new int [v.length+v2.length];
        int cont=0;
        for (int i=0; i<v.length;i++){
            union[cont++]= v[i];
        }
        for (int i=0; i<v2.length;i++){
            union[cont++]=v2[i];
           
        }
        
        return union;
    }
    
    /**
     * 
     * @param frase
     * @return 
     */
    public static String [] crearMatriz(String frase){
        
        String  m[]=frase.split(",");
        return m;
    }
    
    /**
     *  Método que retona la cadena de caracteres del vector de tipo String
     * @param v: recibe como parámetro un vector de tipo String
     * @return retorna la cadena de caracteres
     */
      
    public static String toString(String v[]) {

        String msg = "";
        for (String dato : v) {
            msg += dato + ",";
        }
        return (msg);
    }
    
    /**
     * Método que realiza la impresion del vector de tipo String
     * @param v: recibe como parámetro el vector de Strings
     */
    public static void imprimir(String v[]) {
        System.out.println(toString(v));

    }
    
    /**
     * 
     * @param frase
     * @return 
     */
    public static int contadorDeFrases (String frase){
     return 0;
    
}
    
    /**
     * Método que realiza la compracion entre dos vectores y determina si son similares:son similares si tienen la misma longitud y la
     información de L1 esta en L2 en cualquier orden.
     * @param v: vector de tipo entero
     * @param v2: vector de tipo entero
     * @return retorna un valor booleano como respuesta "true" si son similares, "false" si no lo son.
     */
    public static boolean similares(int v[], int v2[]) {
        int cont = 0;
        if (v.length == v2.length) {

            for (int i = 0; i < v.length; i++) {

                for (int j = 0; j < v2.length; j++) {
                    if (v[i] == v2[j]) {
                        cont++;
                        break;

                    }
                }
            }

        }
        if (cont == v.length) {
            return true;
        }


        return false;
    }
    
    
    /**
     * 
     * @param v
     * @param v2
     * @return 
     */
    public static int cadenaContenida (int v[], int v2[]){
        int cont =0;
        for (int i=0;i<v.length;i++){
            for (int j=0;j<v2.length;j++){
                
                if (v[i]==v2[j]){
                    j++;
                    cont ++;
                    break;
                }
                  if (cont==v2.length&&i>v2.length){
                  j=0;
            }
           
               
           }
        }
        
        
        return cont;
        
    }
}
