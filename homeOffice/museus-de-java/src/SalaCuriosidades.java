public class SalaCuriosidades extends Sala{

    public SalaCuriosidades(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    public void exibirConteudo() {
        System.out.println("""
                Java 1.0:
                Java 5.0:
                Java 8.0:
                Java 17.0:
                Java 21.0:
                """);
    }
}
