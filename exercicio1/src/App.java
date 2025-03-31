//João Pedro Mezzadri Mottin - RGM:36946346


public class App {
    public static void main(String[] args) throws Exception {

        Produto produto1 = new Produto("Banana", 1.99, 10);

        Produto produto2 = new Produto("Abacaxi", 4.99, 5);

        System.out.println("----------ESTOQUE DE PRODUTOS-------");
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

        //TESTE REALIZADO COM O PRODUTO 1 - BANANA
        produto1.venderProduto();

        //produto1.exibirInformacoes();
        //produto2.exibirInformacoes();

        produto1.venderProduto();

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();



    }
}
