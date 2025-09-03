public class MainCa {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Porsche";
        carro.cor = "Preto";
        carro.anoDoCarro = 2022;

        carro.fichaCarro();

        System.out.println("Idade do Carro: " + carro.calculaIdade() + " anos");
    }

}
