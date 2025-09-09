import java.util.Scanner;

public class Visitante {
    private String nome;
    private int idade;
    Scanner leitura = new Scanner(System.in);

    public void explorarSala() {
    System.out.println("""
            -----------------------------------
            
                  
                 MENU
            1. Sala dos Fundadores;
            2. Sala de Versões;
            3. Sala de Curiosidades.
            
                    
            -----------------------------------
            """);
    int entradaUsuario = leitura.nextInt();

        switch (entradaUsuario) {
            case 1:
                System.out.println(SalaFundadores.class);
                break;
            case 2:
                System.out.println(SalaVersoes.class);
                break;
            case 3:
                System.out.println(SalaCuriosidades.class);
                break;
            default:
                System.out.println("Erro");
        }

    }


}

