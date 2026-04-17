package Main.Funcionario;

public class Medio extends Funcionario{

    String escola;

    public Medio(String nome, int codigo, Comissao cargo, String escola) {
        super(nome, codigo, cargo);
        this.escola = escola;
    }

    public double salario() {
        return 1650 + cargo.valor();
    }
}
