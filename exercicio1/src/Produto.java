import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }


    public void venderProduto(){
        System.out.println("\nDigite quantas unidades serão vendidas: ");
        Scanner scanner = new Scanner(System.in);
        int qntVendidos = scanner.nextInt();
            if(qntVendidos > estoque){
                System.out.println("Não é possível realizar essa venda pois o a quantidade requisitada é maior do que o estoque atual; estoque NÃO alterado.");
                return;
            } else {
                System.out.println("Venda realizada com êxito!");
                estoque -= qntVendidos;
            }
    }

    public void exibirInformacoes(){
        System.out.println("\nO produto é: " + nome);
        System.out.println("O preço é: " + preco);
        System.out.println("Quantidade em estoque: "+estoque);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", estoque=" + estoque + "]";
    }

    
}
