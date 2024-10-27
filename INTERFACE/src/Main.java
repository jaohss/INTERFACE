public class Main{
    public static void main(String[] args) {
        Funcionario fa = new FuncionarioAssalariado(5000);
        Funcionario fh = new FuncionarioHorista(80000);

        fh.calcularBonus();
        fa.calcularBonus();
    }
}