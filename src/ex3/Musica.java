package ex3;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double totaisavaliacao;
    double numAvaliacoes;


    void fichaTecnica(){
        System.out.println("o nome do artista é: " + artista);
        System.out.println("o titulo da musica é: " + titulo);
    }
    void rate(Double ratings){
        numAvaliacoes += ratings;
        totaisavaliacao++;
    }
    double rateMedia(){
        return numAvaliacoes / totaisavaliacao;
    }



}
