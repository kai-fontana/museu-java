package br.com.programacao.da.museu;

public class Visitante {
    //Atributos
    private String nome;
    private int idade;

    //Construtores
    Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public void explorarSala(Sala sala){
        sala.exibirConteudo();
    }

}
