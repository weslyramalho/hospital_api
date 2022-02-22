package dto;

import entities.HistoricoEntity;

import java.util.Date;

public class HistoricoDTO {
    private Long id;
    private Date data_e_hora_de_entrada;
    private Date data_e_hora_de_saida;
    private String diagnostico;
    private Long id_pacientes;
    private Long id_funcionarios;

    public HistoricoDTO() {
    }

    public HistoricoDTO(Long id, Date data_e_hora_de_entrada, Date data_e_hora_de_saida, String diagnostico, Long id_pacientes, Long id_funcionarios) {
        this.id = id;
        this.data_e_hora_de_entrada = data_e_hora_de_entrada;
        this.data_e_hora_de_saida = data_e_hora_de_saida;
        this.diagnostico = diagnostico;
        this.id_pacientes = id_pacientes;
        this.id_funcionarios = id_funcionarios;
    }

    public HistoricoDTO(HistoricoEntity historico) {
        id = historico.getId();
        data_e_hora_de_entrada = historico.getData_e_hora_de_entrada();
        data_e_hora_de_saida = historico.getData_e_hora_de_saida();
        diagnostico = historico.getDiagnostico();
        id_pacientes = historico.getId_pacientes();
        id_funcionarios = historico.getId_funcionarios();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_e_hora_de_entrada() {
        return data_e_hora_de_entrada;
    }

    public void setData_e_hora_de_entrada(Date data_e_hora_de_entrada) {
        this.data_e_hora_de_entrada = data_e_hora_de_entrada;
    }

    public Date getData_e_hora_de_saida() {
        return data_e_hora_de_saida;
    }

    public void setData_e_hora_de_saida(Date data_e_hora_de_saida) {
        this.data_e_hora_de_saida = data_e_hora_de_saida;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Long getId_pacientes() {
        return id_pacientes;
    }

    public void setId_pacientes(Long id_pacientes) {
        this.id_pacientes = id_pacientes;
    }

    public Long getId_funcionarios() {
        return id_funcionarios;
    }

    public void setId_funcionarios(Long id_funcionarios) {
        this.id_funcionarios = id_funcionarios;
    }
}
