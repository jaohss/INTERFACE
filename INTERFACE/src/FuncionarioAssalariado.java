public class FuncionarioAssalariado implements Funcionario {
    private double valor;

    public FuncionarioAssalariado(double valor){
        this.valor = valor;
    }

    @Override
    public void calcularBonus(){
        System.out.println("\nFuncionário Assalariado: \nBônus: valor fixo de : "+ valor);
    }
}
