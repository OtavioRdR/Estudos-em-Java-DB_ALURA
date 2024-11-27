package ex3;

import java.util.Locale;

public class MusicaMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Musica musica = new Musica();
        musica.artista = "Chico Boarque";
        musica.titulo = "João e Maria";
        musica.anoLancamento = 1990;

        musica.fichaTecnica();

        musica.rate(2.23);
        musica.rate(8.56);
        musica.rate(9.99);

        System.out.println("Total de todas avaliações feitas: " + musica.numAvaliacoes);
        System.out.println("Numero de Pessoa que avaliaram: "+musica.totaisavaliacao);
        System.out.printf("Média de avaliações: %.2f",musica.rateMedia());


    }
}
