package ex5;

public class Aluno {
    String nomeDoAluno;
    int idadeDoAluno;
    double notaPrimeiroSemestre;
    double notaTotal;


    void fichaDoAluno(){
        System.out.println("Nome do Aluno: " + nomeDoAluno);
        System.out.println("Idade do Aluno: " + idadeDoAluno);
    }

    void notas(int notasDoAluno){
        notaPrimeiroSemestre += notasDoAluno;
        notaTotal++;
    }
    double mediaDasNotas(){
        return notaPrimeiroSemestre / notaTotal;
    }

}
