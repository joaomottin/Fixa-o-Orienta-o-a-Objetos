public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario1 = new Funcionario("Airton Verstappen", "Piloto profissional", 1500.01);
        Funcionario funcionario2 = new Funcionario("Albert Tesla", "Eletricista", 900.00);

        funcionario1.calcularImposto();
        funcionario1.exibirFuncionario();

        funcionario2.calcularImposto();
        funcionario2.exibirFuncionario();

    }
}
