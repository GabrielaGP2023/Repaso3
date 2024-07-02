package com.corenetworks.presentacion;

import java.time.Period;

import java.time.LocalDate;
import java.util.Arrays;

public class MainVariables {
    public static void main(String[] args) {
        //Ejercicio 1
        int n1 = 5;
        int n2 = 3;
        System.out.println("Ej 1. suma -> "+(n1 + n2));
        //Ejercicio 2
        int a=8, b=10;
        System.out.println("Ej 2. resto -> "+ (b%a));
        float n3=10f, n4=3f;
        System.out.println("Ej 3. division -> " + (n3/n4));
        double cEuros=10, factorConversion = 1.10;
        System.out.println("Ej. 4 Multiplicación -> "+ (cEuros*factorConversion) + " Dolares");
        double cEuros2=5, factorConversionLibra = 0.85, resultado;
        resultado=cEuros2*factorConversionLibra;
        System.out.println("Ej. 5 Conversion a libras -> " + resultado + " Libras");
        double cEuros3=20, factorConversionYen = 130_000, resultadoYen;
        resultadoYen = cEuros3 * factorConversionYen;
        System.out.println("Ej. 6 conversion a Yens " + resultadoYen + " Yens");
        double cEuros4=4, factorConversionFS=1.05, resulatodoFS;
        resulatodoFS = cEuros4 * factorConversionFS;
        System.out.println("Ej 7 conversion a FS "+ resulatodoFS + " Francos Suizos");

        double cGalones=3, factorConversionLitros=3.7, resultadosLitros;
        resultadosLitros = cGalones *factorConversionLitros;
        System.out.println("Ej 8 Conversion de Galones a litros -> " + resultadosLitros + " litros");

        double cGramos=1000, factorConversionLibra1 =0.00220462, resultadoGramos;
        resultadoGramos = cGramos * factorConversionLibra1;
        System.out.println("Ej 9 conversion de gramos a libras "+ resultadoGramos + " libras");

        double cEuro5 = 50, factorConversionDA = 1.60, resultadoDA;
        resultadoDA = cEuro5 * factorConversionDA;
        System.out.println("Ej 10 conversion a Dolares Australianos " + resultadoDA + "Dolares Australianos");

        String v1 = "Buenos", v2="Dias", v3;
        v3 = v1 +" "+ v2;
        System.out.println("Ej. 11 "+ v3);
        String v4 = "Programador de java";
        System.out.println("Ejercicio 12 " + v4.toLowerCase());
        System.out.println("Ejercicio 12 " +v4.toUpperCase());
        String v5 = "Aprendiendo java";
        int caracteres;
        caracteres = v5.length();
        System.out.println("Ejercicio 13 ->" + caracteres);
        String v6 = "La guerra de las Galaxias";
        System.out.println("Ej 14 -> " + v6.replace("a", "@"));
        String v7 = "Uno, Dos, Tres, Cuatro";
        String[] palabras = v7.split(",");
        System.out.println("Ej 15 -> " + Arrays.toString(palabras));
        String v8 = "La guerra de las Galaxias",v9;
        v9 = v8.substring(v8.indexOf("guerra"), v8.indexOf("guerra")+"guerra".length());
        System.out.println("("+ v9+")");
        System.out.println(LocalDate.now());
        LocalDate fExamen = LocalDate.of(2024, 7,8);
        System.out.println("Ej. 18 -> " + fExamen);
        System.out.println("Ej 19 -> "+ Period.between(LocalDate.now(),fExamen).getDays());
        System.out.println("Ej 20 -> "+ fExamen.plusMonths(1).plusDays(5));
        LocalDate fCumple = LocalDate.of(2024,07,07);
        System.out.println("Ej 21 -> " + fExamen.isBefore(fCumple));
        int n10 = 20;
        if(n10 >=18 && n10<=65){
            System.out.println("Está en edad trabajadora");
        }else{
            System.out.println("No está en edad trabajadora");
        }

        int edad=20;
        String nombre = "Xarlos";
        if(edad>=18 && nombre.startsWith("C")){
            System.out.println("Es mayor de edad y comienza con C");
        }else{
            System.out.println("Ni es mayor de Edad, ni comienza con C");
        }



        System.out.println();


    }
}