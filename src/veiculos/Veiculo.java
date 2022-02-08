package veiculos;

public class Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private  String km;
    private boolean isLigado;
    private int litroCombustivel;
    private int velocidade;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litroCombustivel;
    }

    public void setCombustivel(int combustivel) {
        this.litroCombustivel = combustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar(){
        this.velocidade += 20;
        System.out.println("Acelerando, velocidade atual= "+ getVelocidade() + "Km/h");
    }

    public void abastecer (int qtd){
        if(qtd>60 || this.litroCombustivel+qtd>60){
            System.out.println("Quantidade excede o valor maximo do tanque");
        } else {
            this.litroCombustivel += qtd;
            System.out.println("Abastecido, combustivel atual "+ getLitrosCombustivel()+ "L");
        }
    }

    public void frear(){
        if(this.velocidade==0){
            System.out.println("O veículo já está parado");
        }else {
            this.velocidade -= 20;
            System.out.println("Freiando... velocidade atual= "+ getVelocidade()+ " Km/h");
        }
    }

    public void pintar(String cor){
        this.cor= cor;
    }

    public void ligar(){
        if(this.isLigado){
            System.out.println("O veículo já está ligado");
        } else {
            this.isLigado= true;
            System.out.println("O veículo foi ligado");
        }
    }

    public void  desligar(){
        if(this.isLigado){
            if(this.velocidade==0){
                this.isLigado= false;
                System.out.println("O veículo foi desligado");
            } else {
                System.out.println("O veículo não pode ser desligado emquanto está em movimento");
            }
        } else {
            System.out.println("o veículo já está desligado");
        }
    }
}
