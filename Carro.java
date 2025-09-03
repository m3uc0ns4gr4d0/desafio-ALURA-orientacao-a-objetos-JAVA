public class Carro {

    String modelo;
    String cor;
    int anoDoCarro;


    void fichaCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Cor do carro: " + cor);
    }

    int calculaIdade(){
        return 2025 - anoDoCarro;
    }
}
