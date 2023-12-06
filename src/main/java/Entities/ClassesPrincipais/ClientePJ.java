package Entities.ClassesPrincipais;

import Entities.Abstract.Cliente;
import Entities.Interface.OperacoesBank;

import javax.xml.crypto.Data;

public class ClientePJ extends Cliente implements OperacoesBank {
    private long cnpj;
    private String naturalidade;
    private Double saldo;
    public ClientePJ(String nome, Data dataNascimento, String endereco, long cnpj, String naturalidade, Double saldo) {
        super(nome, dataNascimento, endereco);
        this.cnpj = cnpj;
        this.naturalidade = naturalidade;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
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

    @Override
    public void depositar(double valor) {
        // Lógica para realizar um depósito
        // Por exemplo, adicionar o valor ao saldo da conta
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
