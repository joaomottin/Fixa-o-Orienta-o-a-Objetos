import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private float nota1 = 0, nota2 = 0;
    private double media;
    
    Scanner scanner = new Scanner(System.in);
    
    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void atualizarNota(){
        System.out.println("\nDigite a nova nota1: ");
        Float novaNota1 = scanner.nextFloat();
        scanner.nextLine();
            if (novaNota1 > nota1){
                this.nota1 = novaNota1;
            } else {
                System.out.println("A nota1 permanece inalterada de seu valor inicial.\n");
            }

        System.out.println("Digite a nova nota2: ");
        Float novaNota2 = scanner.nextFloat();
        scanner.nextLine();
            if (novaNota2 > nota2) {
                this.nota2 = novaNota2;
        } else {
            System.out.println("A nota2 permanece inalterada de seu valor inicial.\n");
        }
    }

    public void calcularMedia(){
        media = ((nota1 + nota2) / 2);
        System.out.println("Média: " + media);
    }

    public void status(){
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        if (media >= 7){System.out.println("Aprovado");}
        if (media < 7 && media > 2){System.out.println("Recuperação");}
        if (media <= 2){System.out.println("Reprovado");}
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (this.media != media){
            System.out.println("Valor incorreto. Favor utilizar a função calcularMedia() para obter o resultado correto.");
            return;
        } else {
        this.media = media;
        }

    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media
                + "]";
    }
}
