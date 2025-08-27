package br.com.programacao.da.museu;

public class Main {
    public static void main(String[] args) {
        Visitante visitante01 = new Visitante("Maria", 25);

        Visitante visitante02 = new Visitante("Paulo", 19);
        System.out.println("Visitante: " + visitante01);


        Sala salaFundadores = new SalaFundadores("Fundadores: ", "Conheça os criadores do Java.", 1991);
    }
}
