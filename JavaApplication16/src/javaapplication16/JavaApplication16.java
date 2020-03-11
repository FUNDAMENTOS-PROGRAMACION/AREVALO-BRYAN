/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Sistemas
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    
    //Entero -32768 a 32767
   
    int numeroEntero=0;
    double numeroDouble=0.0;
    char letras='A';
    String cadena="Hola mundo cruel de corino";
    boolean valorBool=true;
    //valorBool=true;
    //boolean valorBool=1;
     public static void imprirNombre(){
     System.out.println("Elian");}
    public static int sumae2Numeros(){
    return 0;
       } 
        public static int sumae2Numeros(int num1, int num2){
        int suma=num1+num2;
        return suma;
        }
  
    public static void main(String[] args) {
        // TODO code application logic here
        imprirNombre ();
        sumae2Numeros(1,5);
        System.out.println(sumae2Numeros(1,5));
    }
    
    //comentario de una linea.
    
    /*
    
    */
    
    
}
