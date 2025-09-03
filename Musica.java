public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;
    double somaDasAvaliacoes;

    void fichaMusica(){
        System.out.println("Título da Música: " + titulo);
        System.out.println("Nome do Arsista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
