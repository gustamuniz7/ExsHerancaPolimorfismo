package Main.Funcionario;

public class Superior extends Funcionario{

    String universidade;


    public Superior(String nome, int codigo, Comissao cargo, String universidade) {
        super(nome, codigo, cargo);
        this.universidade = universidade;
    }

    @Override
    public double salario() {
        return 3300 + cargo.valor();

    }
}
