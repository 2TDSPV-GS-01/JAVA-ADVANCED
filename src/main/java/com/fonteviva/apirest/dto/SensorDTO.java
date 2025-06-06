package com.fonteviva.apirest.dto;

public class SensorDTO {
    private Long id;
    private String tipo;
    private String tipoMedida;
    private Long idEstacaoTratamento;

    public SensorDTO() {}

    public SensorDTO(Long id, String tipo, String tipoMedida, Long idEstacaoTratamento) {
        this.id = id;
        this.tipo = tipo;
        this.tipoMedida = tipoMedida;
        this.idEstacaoTratamento = idEstacaoTratamento;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoMedida() {
        return tipoMedida;
    }

    public void setTipoMedida(String tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    public Long getIdEstacaoTratamento() {
        return idEstacaoTratamento;
    }

    public void setIdEstacaoTratamento(Long idEstacaoTratamento) {
        this.idEstacaoTratamento = idEstacaoTratamento;
    }
}
