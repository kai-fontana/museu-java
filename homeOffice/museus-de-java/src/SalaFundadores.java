public class SalaFundadores extends Sala{

    //Construtor
    public SalaFundadores(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    //Métodos
    public void exibirConteudo() {
        System.out.println("""
                James Gosling
                Sun Microsystems
                """);
    }



}
