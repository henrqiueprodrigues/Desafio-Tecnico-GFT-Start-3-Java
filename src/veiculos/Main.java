package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo= new Veiculo();
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Uno");
        veiculo.setCor("vermelho");
        veiculo.setKm("1000km");
        veiculo.setLigado(false);
        veiculo.setVelocidade(0);
        veiculo.setPreco(30000);

        System.out.println("Marca: "+veiculo.getMarca());
        System.out.println("Modelo: "+veiculo.getModelo());
        System.out.println("Cor: "+veiculo.getCor());
        System.out.println("Kilometragem: "+ veiculo.getKm());
        System.out.println("Esta ligado?\n "+veiculo.isLigado());
        System.out.println("Velocidade atual: "+ veiculo.getVelocidade());
        System.out.println("Preço do veículo: "+ veiculo.getPreco());

        veiculo.acelerar();
        veiculo.abastecer(40);
        veiculo.abastecer(70);
        veiculo.frear();
        veiculo.frear();
        veiculo.pintar("Laranja");
        System.out.println("Cor: "+veiculo.getCor());
        veiculo.ligar();
        veiculo.ligar();
        veiculo.desligar();
        veiculo.desligar();



    }
}
