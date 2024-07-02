package com.corenetworks.presentacion;

import com.coreneworks.modelo.BlockNotas;
import com.coreneworks.modelo.Nota;
import com.coreneworks.modelo.NotaAlarma;

import java.time.LocalTime;

public class ProbarNotas {

    public static void main(String[] args) {
        Nota n1 = new Nota(1, "Crear log");
        Nota n2 = new NotaAlarma(2, "Crear BBDD", LocalTime.now());
        BlockNotas b1 = new BlockNotas(4);
        b1.insertarNota(n1);
        b1.insertarNota(n2);
        System.out.println(b1.mostrarNotas());
        System.out.println(b1.totalNotas());
        System.out.println("Se pudo eliminar -> " +b1.eliminarNota(5));
        System.out.println("Se pudo eliminar -> " +b1.eliminarNota(1));
        System.out.println(b1.mostrarNotas());




    }
}
