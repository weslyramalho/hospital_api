package entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "pacientes")
public class PacientesEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome", nullable = false)
    private Long nome;

    @Column(name = "data_de_nascimento", nullable = false)
    private Date data_de_nascimentoicula;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    public PacientesEntity() {
    }

    public PacientesEntity(Long id, Long nome, Date data_de_nascimentoicula, String telefone) {
        this.id = id;
        this.nome = nome;
        this.data_de_nascimentoicula = data_de_nascimentoicula;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNome() {
        return nome;
    }

    public void setNome(Long nome) {
        this.nome = nome;
    }

    public Date getData_de_nascimentoicula() {
        return data_de_nascimentoicula;
    }

    public void setData_de_nascimentoicula(Date data_de_nascimentoicula) {
        this.data_de_nascimentoicula = data_de_nascimentoicula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
