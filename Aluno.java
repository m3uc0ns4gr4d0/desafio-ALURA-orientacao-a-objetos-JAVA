public class Aluno {

    String nome;
    int idade;
    String turma;
    double somaBimestre;
    int numNotas;


    void fichaAluno(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do " + nome + ": " + idade);
        System.out.println("Turma do " + nome + ": " + turma);
    }

    void bimestre (double nota){
        somaBimestre += nota;
        numNotas++;
    }

    double mediaBimestre(){
        return somaBimestre / numNotas;
    }
}
