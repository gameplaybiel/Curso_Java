package br.edu.curso.secao26.Model;

import br.edu.curso.secao25.Helper.Utils;

import java.util.Date;

public class Cliente {
    private static int contador = 101;
    private int codigo;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNacimento;
    private Date dataCadastro;

    public Cliente(String nome, String email, String cpf, Date dataNacimento){
        this.codigo = Cliente.contador;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
        this.dataCadastro = new Date();
        Cliente.contador += 1;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public Date getDataCadastro() {
        return this.dataCadastro;
    }

    @Override
    public String toString() {
        return "Código: " + this.getCodigo() +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nCpf: " + this.getCpf() +
                "\nData de nascimento: " + Utils.dateParaString(this.getDataNacimento()) +
                "\nData de cadastro: " + Utils.dateParaString(this.getDataCadastro());
    }
}
