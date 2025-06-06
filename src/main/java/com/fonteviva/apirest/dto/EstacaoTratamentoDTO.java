package com.fonteviva.apirest.dto;
import java.util.Date;
import java.util.List;

public class EstacaoTratamentoDTO {
    private Long id;
    private Date dataInstalacao;
    private String status;
    private String cpfResponsavel;
    private List<SensorDTO> sensores;

    public EstacaoTratamentoDTO() {}

    public EstacaoTratamentoDTO(Long id, Date dataInstalacao, String status, String cpfResponsavel, List<SensorDTO> sensores) {
        this.id = id;
        this.dataInstalacao = dataInstalacao;
        this.status = status;
        this.cpfResponsavel = cpfResponsavel;
        this.sensores = sensores;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Date dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public List<SensorDTO> getSensores() {
        return sensores;
    }

    public void setSensores(List<SensorDTO> sensores) {
        this.sensores = sensores;
    }
}
