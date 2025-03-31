public class App {
    public static void main(String[] args) throws Exception {

        // Aluno aluno1 = new Aluno("Jing Woo", 18, 7, 5, new Disciplina("Educação Física", "Saitama"));

        Aluno aluno1 = new Aluno("Jing Woo", 18, 0, 0);
        Disciplina alunoUm = new Disciplina("Educação Física", "Saitama");

        aluno1.atualizarNota();

        aluno1.calcularMedia();

        aluno1.status();
        alunoUm.status();

        aluno1.atualizarNota();
        aluno1.calcularMedia();

        aluno1.status();
        alunoUm.status();

    }
}
