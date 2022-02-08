package aposentadoriaJogador;
import java.util.Calendar;

public class Jogador {
    private String nome;
    private String posicao;
    private String dataNacimento;

    public Jogador(String nome, String posicao, String dataNacimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Posição: "+ this.getPosicao());
        System.out.println("Data de nascimento: "+ this.getDataNacimento());
    }

    public int calculaIdade(){
        Calendar calendar= Calendar.getInstance();
        int idade= Integer.parseInt(dataNacimento.substring(dataNacimento.length()-4));
        return calendar.get(Calendar.YEAR)-idade;
    }

    public void tempoAposentadoria(){
        int idade= calculaIdade();
        if(idade>=40){
            System.out.println("Já pode se aposentar");
        } else if(posicao.equals("defesa")){
            System.out.println("Faltam "+(40-idade)+ " anos para se aposentar");
        } else if (posicao.equals("meio-campo")){
            if(idade>=38){
                System.out.println("Já pode se aposentar");
            } else {
                System.out.println("Faltam "+(38-idade)+ " anos para se aposentar");
            }
        }else if (posicao.equals("atacante")){
            if(idade>=35){
                System.out.println("Já pode se aposentar");
            } else {
                System.out.println("Faltam "+(35-idade)+ " anos para se aposentar");
            }
        }
    }
}
