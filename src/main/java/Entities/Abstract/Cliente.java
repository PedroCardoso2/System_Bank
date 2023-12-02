package Entities.Abstract;

import javax.xml.crypto.Data;

public abstract class Cliente {
    public String Nome;
    public Data dataNascimento;
    public String endereco;
    public Cliente(String nome, Data dataNascimento, String endereco) {
        Nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
