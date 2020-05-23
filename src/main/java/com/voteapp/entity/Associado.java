package com.voteapp.entity;

import java.util.Objects;

public class Associado extends AbstractEntity{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Associado associado = (Associado) o;
        return Objects.equals(cpf, associado.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf);
    }

    @Override
    public String toString() {
        return "Associado{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
