package Main.Funcionario;

public class Funcionario {
    String nome;
    int codigo;
    Comissao cargo;

    public Funcionario(String nome, int codigo, Comissao cargo) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public double salario(){
        return 1000.0 + cargo.valor();
    }

    public String toString(){
        return nome + " - R$ " + salario();
    }
}
