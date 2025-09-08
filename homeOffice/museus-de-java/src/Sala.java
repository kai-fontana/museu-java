public abstract class Sala {
    //Atributos
    private String nome;
    private String descricao;
    private int anoCriacao;

    //Construtores

    public Sala(String nome, String descricao, int anoCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoCriacao = anoCriacao;
    }

    //Método
    public abstract void exibirConteudo();


}
