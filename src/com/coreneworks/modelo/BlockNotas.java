package com.coreneworks.modelo;

public class BlockNotas {
    private int indice;
    private Nota[] notas;

    public void insertarNota(Nota n){
        notas[indice]= n;
        indice++;
    }

    public String mostrarNotas(){
        //1. Declarar variables
        String resultado = "";
        //2. Estructura
        for(int i = 0; i<=indice-1;i++){
            if(notas[i]!=null){
            resultado = resultado + notas[i].toString();
            }
        }
        return resultado;
    }

    public boolean eliminarNota(int posicion){
        //Validaciones
        //1. la posición null
        //2. posicion menor que índice
        if(posicion<indice && notas[posicion-1]!=null){
            //todo ok
            notas[posicion-1]=null;
            return true;
        }else{
            return false;
        }
    }

    public int totalNotas(){
        return indice;
    }

    public BlockNotas(int numeroNotas)    {
        notas = new Nota[numeroNotas];
    }


}
