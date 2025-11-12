package model;

import interfaces.TomadorEmprestimo;

public class Instituicao implements TomadorEmprestimo {
    private String nome;
    private String CNPJ;
    private String cidade;

    public Instituicao(String nome, String CNPJ, String cidade){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.CNPJ);
        System.out.println("Cidade: " + this.cidade);

    }
}
