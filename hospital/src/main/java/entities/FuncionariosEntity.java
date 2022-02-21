package entities;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
public class FuncionariosEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "matricula", nullable = false)
    private Long matricula;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "departamento", nullable = false)
    private String departamento;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    public FuncionariosEntity() {
    }

    public FuncionariosEntity(Long id, Long matricula, String nome, String departamento, String cargo, String telefone) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
