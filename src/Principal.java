public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Gente Grande"; //atribuicao
        meuFilme.anoDeLancamento = 1998;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8.0);
        meuFilme.avalia(4.0);
        meuFilme.avalia(10.0);

        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
        meuFilme.somaDasAvaliacao = 10;
        meuFilme.totalAvaliacoes = 1;
        System.out.println("Alterando a soma Mostrando alterção interna: " + meuFilme.somaDasAvaliacao);
        System.out.println("Mudando a soma: " + meuFilme.totalAvaliacoes);
    }
}
