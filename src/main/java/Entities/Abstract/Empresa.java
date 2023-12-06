package Entities.Abstract;

public abstract class Empresa extends Banco{
    public String Nome;
    public Integer funcionarios;

    public Empresa(String nome, Integer funcionarios) {
        Nome = nome;
        this.funcionarios = funcionarios;
    }
}
