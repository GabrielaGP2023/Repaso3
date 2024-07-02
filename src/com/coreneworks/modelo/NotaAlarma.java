package com.coreneworks.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotaAlarma extends Nota{
    private LocalTime hora;

    @Override
    public String toString() {
        return "NotaAlarma{" +
                "hora=" + hora +
                "} " + super.toString();
    }

    public NotaAlarma() {
    }

    public NotaAlarma(int idNota, String texto, LocalTime hora) {
        super(idNota, texto);
        this.hora = hora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
