package br.com.programacao.da.museu;

public abstract class Sala {
    //Atributos

     private String nome;
     private String descricao;
     private int anoCriacao;

    //Construtor

    Sala(String nome, String descricao, int anoCriacao) {
        this.nome = nome;
        this.descricao =  descricao;
        this.anoCriacao = anoCriacao;
    }

    //Métodos

    public abstract void exibirConteudo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
