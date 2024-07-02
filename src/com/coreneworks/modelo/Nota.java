package com.coreneworks.modelo;

public class Nota {
    private int idNota;
    private String texto;

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", texto='" + texto + '\'' +
                '}';
    }

    public Nota() {
    }

    public Nota(int idNota, String texto) {
        this.idNota = idNota;
        this.texto = texto;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
