package model;

public class Revista extends Material{
    private String edicao;

   
    public void descricao(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Ano de Publicação: " + this.getAnoPublicacao());
        System.out.println("Edição: " + this.getEdicao());
    }

     public Revista(String titulo, Integer anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
}
