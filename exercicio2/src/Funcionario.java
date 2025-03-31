public class Funcionario {
    private String nome, cargo;
    private double salario;
    
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularImposto(){
        if (salario <= 1500){
            double imposto = salario * 0.05;
            return imposto;
        } else {
            double imposto = salario * 0.1;
            return imposto;
        }
    }


    public void exibirFuncionario(){
        System.out.println("\nFuncionario: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Valor do imposto sobre seu salario: R$" + calcularImposto());
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }
}
