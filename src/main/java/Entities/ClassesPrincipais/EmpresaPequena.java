package Entities.ClassesPrincipais;

import Entities.Abstract.Empresa;

public class EmpresaPequena extends Empresa {
    private Integer numeroIdentificador;
    private long cnpj;
    private Double faturamento;

    public EmpresaPequena(String nome, Integer funcionarios, Integer numeroIdentificador, long cnpj, Double faturamento) {
        super(nome, funcionarios);
        this.numeroIdentificador = numeroIdentificador;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    public Integer getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }
}
