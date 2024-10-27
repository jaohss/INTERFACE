public class FuncionarioHorista implements Funcionario {
    private double totalAnualRecebido;

    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    @Override
    public void calcularBonus() {
        double bonus = totalAnualRecebido * 0.10;
        System.out.println("\nFuncionário Horista: \nBônus: 10% do total anual recebido: R$" + bonus);
    }
}
