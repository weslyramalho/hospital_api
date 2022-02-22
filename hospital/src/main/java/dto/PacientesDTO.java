package dto;

import entities.PacientesEntity;

import java.util.Date;

public class PacientesDTO {
    private Long id;
    private Date nascimento;
    private String telefone;

    public PacientesDTO() {
    }

    public PacientesDTO(Long id, Date nascimento, String telefone) {
        this.id = id;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    public PacientesDTO(PacientesEntity pacientes) {
        id = pacientes.getId();
        nascimento = pacientes.getNascimento();
        telefone = pacientes.getTelefone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
