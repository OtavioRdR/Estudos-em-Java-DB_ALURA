package ex5;

import java.util.Locale;

public class MainDoAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();
        aluno.nomeDoAluno = "Otavio";
        aluno.idadeDoAluno = 19;


        aluno.fichaDoAluno();

        aluno.notas(5);
        aluno.notas(8);
        aluno.notas(9);
        //Acima seria certo no caso o Double, mas resolvi fazer diferente pra teste

        System.out.println("Nota Total do primeiro semestre: " + aluno.notaPrimeiroSemestre);
        System.out.println("Total de notas contadas para avaliação: " + aluno.notaTotal);
        System.out.printf("Media das notas: %.2f" , aluno.mediaDasNotas());



    }
}
