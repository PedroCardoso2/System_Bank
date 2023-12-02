package Entities.Abstract;

public abstract class Empresa {
    public String Nome;
    public Integer funcionarios;

    public Empresa(String nome, Integer funcionarios) {
        Nome = nome;
        this.funcionarios = funcionarios;
    }
}
