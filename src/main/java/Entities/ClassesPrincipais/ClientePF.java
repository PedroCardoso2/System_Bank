package Entities.ClassesPrincipais;

import Entities.Abstract.Cliente;
import Entities.Interface.OperacoesBank;

import javax.xml.crypto.Data;

public class ClientePF extends Cliente implements OperacoesBank {
    private long cpf;
    private String naturalidade;

    private Double saldo;
    public ClientePF(String nome, Data dataNascimento, String endereco, long cpf, String naturalidade, Double saldo) {
        super(nome, dataNascimento, endereco);
        this.cpf = cpf;
        this.naturalidade = naturalidade;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
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

    @Override
    public void depositar(double valor) {

        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        // Lógica para realizar um saque
        // Verificar se há saldo suficiente antes de permitir o saque
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }


}
