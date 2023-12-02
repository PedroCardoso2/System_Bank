package Entities.ClassesPrincipais;

import Entities.Abstract.Cliente;

import javax.xml.crypto.Data;

public class ClientePJ extends Cliente {
    private long cnpj;
    private String naturalidade;

    public ClientePJ(String nome, Data dataNascimento, String endereco, long cnpj, String naturalidade) {
        super(nome, dataNascimento, endereco);
        this.cnpj = cnpj;
        this.naturalidade = naturalidade;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "cnpj=" + cnpj +
                ", naturalidade='" + naturalidade + '\'' +
                '}';
    }
}
