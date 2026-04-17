package Main.Funcionario;

public class Basico extends Funcionario{

    String escola;

    public Basico(String nome, int codigo, Comissao cargo, String escola) {
        super(nome, codigo, cargo);
        this.escola = escola;
    }

    public double salario(){
        return 1100 + cargo.valor();
    }
}
