package entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class HistoricoPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_pacientes")
    private PacientesEntity pacientesEntity;

    @ManyToOne
    @JoinColumn(name = "id_funcionarios")
    private FuncionariosEntity funcionariosEntity;

    public HistoricoPK() {
    }

    public PacientesEntity getPacientesEntity() {
        return pacientesEntity;
    }

    public void setPacientesEntity(PacientesEntity pacientesEntity) {
        this.pacientesEntity = pacientesEntity;
    }

    public FuncionariosEntity getFuncionariosEntity() {
        return funcionariosEntity;
    }

    public void setFuncionariosEntity(FuncionariosEntity funcionariosEntity) {
        this.funcionariosEntity = funcionariosEntity;
    }
}
