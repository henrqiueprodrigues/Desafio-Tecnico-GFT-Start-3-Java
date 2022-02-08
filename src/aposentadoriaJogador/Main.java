package aposentadoriaJogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador= new Jogador("João","meio-campo","24/03/1997");
        jogador.imprimeDados();
        System.out.println("Idade de "+ jogador.getNome()+" é: " + jogador.calculaIdade());
        jogador.tempoAposentadoria();
        jogador.setPosicao("defesa");
        jogador.tempoAposentadoria();
        jogador.setPosicao("atacante");
        jogador.tempoAposentadoria();
        jogador.setDataNacimento("24/02/1956");
        System.out.println("Idade de "+ jogador.getNome()+" é: " + jogador.calculaIdade());
        jogador.tempoAposentadoria();
    }
}
