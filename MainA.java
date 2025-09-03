public class MainA {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Davi";
        aluno.idade = 17;
        aluno.turma = "2ºC";

        aluno.fichaAluno();

        aluno.bimestre(8.0);
        aluno.bimestre(7.6);
        aluno.bimestre(3.3);

        double mediaBimestral = aluno.mediaBimestre();
        System.out.println("Média bimestral: " + mediaBimestral);
    }
}
