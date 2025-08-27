package br.com.programacao.da.museu;

public class SalaVersoes extends Sala {

    //Atributo especifico
    private String recursosChave;

    //Construtor
    public SalaVersoes(String nome, String descricao, int anoCriacao, String recursosChave) {

        this.recursosChave = recursosChave;
    }
    @Override
    public void exibirConteud() {

    }
}
