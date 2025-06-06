package com.fonteviva.apirest.dto;
import java.util.List;

public class ResponsavelDTO {
    private String cpf;
    private String nome;
    private List<Long> idsEstacoes;

    public ResponsavelDTO() {}

    public ResponsavelDTO(String cpf, String nome, List<Long> idsEstacoes) {
        this.cpf = cpf;
        this.nome = nome;
        this.idsEstacoes = idsEstacoes;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getIdsEstacoes() {
        return idsEstacoes;
    }

    public void setIdsEstacoes(List<Long> idsEstacoes) {
        this.idsEstacoes = idsEstacoes;
    }
}

