public class MainM {
    public static void main(String[] args) {
        Musica musicaFamosa = new Musica();

        musicaFamosa.titulo = "Viva La Vida";
        musicaFamosa.artista = "Coldplay";
        musicaFamosa.anoDeLancamento = 2008;

        musicaFamosa.fichaMusica();

        musicaFamosa.avalia(7.5);
        musicaFamosa.avalia(10);
        musicaFamosa.avalia(4.3);

        double mediaAvaliacoes = musicaFamosa.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
