package Entities.ClassesPrincipais;

import Entities.Abstract.Cliente;

import javax.xml.crypto.Data;

public class ClientePF extends Cliente {
    private long cpf;
    private String naturalidade;

    public ClientePF(String nome, Data dataNascimento, String endereco, long cpf, String naturalidade) {
        super(nome, dataNascimento, endereco);
        this.cpf = cpf;
        this.naturalidade = naturalidade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "cpf=" + cpf +
                ", naturalidade='" + naturalidade + '\'' +
                '}';
    }
}
