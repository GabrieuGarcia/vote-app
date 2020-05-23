package com.voteapp.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Pauta extends AbstractEntity{

    private List<Voto> votos;

    private LocalDateTime horarioPauta;

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public LocalDateTime getHorarioPauta() {
        return horarioPauta;
    }

    public void setHorarioPauta(LocalDateTime horarioPauta) {
        this.horarioPauta = horarioPauta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pauta pauta = (Pauta) o;
        return Objects.equals(votos, pauta.votos) &&
                Objects.equals(horarioPauta, pauta.horarioPauta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), votos, horarioPauta);
    }

    @Override
    public String toString() {
        return "Pauta{" +
                "votos=" + votos +
                ", horarioPauta=" + horarioPauta +
                '}';
    }
}
