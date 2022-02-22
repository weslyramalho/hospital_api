package dto;

import entities.FuncionariosEntity;

public class FuncionariosDTO {

    private Long id;
    private Long matricula;
    private String nome;
    private String departamento;
    private String cargo;
    private String telefone;

    public FuncionariosDTO() {
    }

    public FuncionariosDTO(Long id, Long matricula, String nome, String departamento, String cargo, String telefone) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefone = telefone;
    }

    public FuncionariosDTO(FuncionariosEntity funcionarios) {
        id = funcionarios.getId();
        matricula = funcionarios.getMatricula();
        nome = funcionarios.getNome();
        departamento = funcionarios.getDepartamento();
        cargo = funcionarios.getCargo();
        telefone = funcionarios.getTelefone();
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
