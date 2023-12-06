package Entities.ClassesPrincipais;

import Entities.Abstract.Empresa;
import Entities.Interface.OperacoesBank;

public class EmpresaMediaGrande extends Empresa {
    private Integer numeroIdentificador;

    private Integer cnpj;
    private Double Faturamento;
    private Integer quantidadeSocio;

    public EmpresaMediaGrande(String nome, Integer funcionarios, Integer numeroIdentificador, Integer cnpj, Double faturamento, Integer quantidadeSocio) {
        super(nome, funcionarios);
        this.numeroIdentificador = numeroIdentificador;
        this.cnpj = cnpj;
        this.Faturamento = faturamento;
        this.quantidadeSocio = quantidadeSocio;
    }

    public Integer getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Double getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(Double faturamento) {
        Faturamento = faturamento;
    }

    public Integer getQuantidadeSocio() {
        return quantidadeSocio;
    }

    public void setQuantidadeSocio(Integer quantidadeSocio) {
        this.quantidadeSocio = quantidadeSocio;
    }

    @Override
    public String toString() {
        return "EmpresaMediaGrande{" +
                "numeroIdentificador=" + numeroIdentificador +
                ", cnpj=" + cnpj +
                ", Faturamento=" + Faturamento +
                ", quantidadeSocio=" + quantidadeSocio +
                '}';
    }


}
