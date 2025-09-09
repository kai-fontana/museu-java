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

    //Get e Set

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

    //Método
    public abstract void exibirConteudo();

}
