package com.corenetworks.presentacion;

import java.util.Scanner;

public class MainEstructuras {
    public static void main(String[] args) {
        // Decir si un número es divisible por 5 y por 3.
        int n1=15;
        if(n1%5==0 && n1%3==0){
            System.out.println("El número es divisible por 5 y 3");
        }else{
            System.out.println("No es divisible por 5 y 3");
        }
        //Declarar una variable de tipo string y decir si es no vacía y su longitud es
        //mayor que 5.
        String v1= "Buenos días";
        if(v1.length()>5){
            System.out.println("No vacía y mayor su longitud que 5");
        }else if(v1==""){
            System.out.println("Cadena vacía");
        }else{
            System.out.println("Tiene menos de 5 letras");
        }
        // Calcular la suma de los números entre un rango.
        // Solicitando por el teclado el limite inferior y el superior.
        //Validar que limite inferior sea un número menor al numero de limite superior
        //1. Declarar variables
//        int limiteInferior, limiteSuperior, suma=0;
        Scanner s1 = new Scanner(System.in);
//        System.out.println("Escriba el límite inferior -> ");
//        limiteInferior = s1.nextInt();
//        System.out.println("Escriba el límite superior ->");
//        limiteSuperior = s1.nextInt();
//        if(limiteInferior<limiteSuperior){
//            //2. Poner la estructura
//            for(int i = limiteInferior; i<=limiteSuperior;i++){
//                suma+=i;
//            }
//            System.out.println("Suma -> " + suma);
//        }else{
//            System.out.println("Datos invalidos, el numero " + limiteInferior +
//                    " debe ser menor al número "+ limiteSuperior);
//        }
        // Declarar una variable de tipo String con el valor de “Sistemas de
        //Información” y por medio de un bucle escribirla a la inversa.
        //1. Declarar variables
        String v2 = "Sistemas de Información";
        //2. Aplicar una estructura
        for(int i=v2.length()-1; i>=0; --i){
            System.out.print(v2.charAt(i));
        }
        System.out.println();
        // Solicitar un número hasta que cumpla con que esté entre 5 y 10.
        //1. Declaramos variables
//        int n3;
//        //2. Estructura
//        do{
//            System.out.println("Escriba un número -> ");
//            n3 = s1.nextInt();
//        }while(n3<5 || n3 > 10);

        // Contar la Frecuencia de un Elemento Específico en un Array int[] numeros
        //= {1, 2, 2, 3, 4, 2, 5};


        //1. Declarar variables
        int[] numeros = {1, 2, 2, 3, 4, 2, 5};
        int n4, contador=0;
        System.out.println("Escriba el número para ver su frecuencia -> ");
        n4 = s1.nextInt();
        //2. Estructuras
        for(int elmento: numeros){
            if(elmento==n4){
                contador++;
            }
        }
        System.out.println("La frecuencia del número " + n4 + " es : " + contador);
        contador=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]==n4){
                contador++;
            }
        }
        System.out.println("La frecuencia del número " + n4 + " es : " + contador);
        //Invertir los Elementos de un Array: int[] numeros = {1, 2, 3, 4, 5};
        //1. Declarar variables
        int[] numeros1 = {1, 2, 3, 4, 5};
        //2, Estructura
        for(int i=numeros1.length-1;i>=0;i--){
            System.out.print(numeros1[i] + " ");
        }


    }
}
