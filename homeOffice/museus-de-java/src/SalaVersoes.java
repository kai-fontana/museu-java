public class SalaVersoes extends Sala{

    public SalaVersoes(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    public void exibirConteudo() {
        System.out.println("""
                Fatos curiosos
                """);
    }
}
