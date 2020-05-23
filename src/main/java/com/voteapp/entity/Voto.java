package com.voteapp.entity;

import com.voteapp.enuns.VotoEnum;

import java.time.LocalDateTime;
import java.util.Objects;

public class Voto extends AbstractEntity{

    private Long associadoId;

    private VotoEnum votoEnum;

    private LocalDateTime horarioVoto;

    public Long getAssociadoId() {
        return associadoId;
    }

    public void setAssociadoId(Long associadoId) {
        this.associadoId = associadoId;
    }

    public VotoEnum getVotoEnum() {
        return votoEnum;
    }

    public void setVotoEnum(VotoEnum votoEnum) {
        this.votoEnum = votoEnum;
    }

    public LocalDateTime getHorarioVoto() {
        return horarioVoto;
    }

    public void setHorarioVoto(LocalDateTime horarioVoto) {
        this.horarioVoto = horarioVoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Voto voto = (Voto) o;
        return Objects.equals(associadoId, voto.associadoId) &&
                votoEnum == voto.votoEnum &&
                Objects.equals(horarioVoto, voto.horarioVoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), associadoId, votoEnum, horarioVoto);
    }

    @Override
    public String toString() {
        return "Voto{" +
                "associadoId=" + associadoId +
                ", votoEnum=" + votoEnum +
                ", horarioVoto=" + horarioVoto +
                '}';
    }
}
