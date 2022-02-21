package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historico_do_paciente")
public class HistoricoEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "data_e_hora_de_entrada", nullable = false)
    private Date data_e_hora_de_entrada;

    @Column(name = "data_e_hora_de_saida", nullable = false)
    private Date data_e_hora_de_saida;

    @Column(name = "diagnostico", nullable = false)
    private String diagnostico;

    @Column(name = "id_pacientes", nullable = false)
    private Long id_pacientes;

    @Column(name = "id_funcionarios", nullable = false)
    private Long id_funcionarios;

    public HistoricoEntity() {
    }

    public HistoricoEntity(Long id, Date data_e_hora_de_entrada, Date data_e_hora_de_saida, String diagnostico, Long id_pacientes, Long id_funcionarios) {
        this.id = id;
        this.data_e_hora_de_entrada = data_e_hora_de_entrada;
        this.data_e_hora_de_saida = data_e_hora_de_saida;
        this.diagnostico = diagnostico;
        this.id_pacientes = id_pacientes;
        this.id_funcionarios = id_funcionarios;
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
