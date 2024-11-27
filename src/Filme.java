public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);

    }
    void avalia(Double nota){
        somaDasAvaliacao += nota;
        totalAvaliacoes++;

    }
    double pegaMedia(){
        return somaDasAvaliacao / totalAvaliacoes;
    }

}
