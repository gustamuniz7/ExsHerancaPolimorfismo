package Main.Funcionario;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[10];

        f[0] = new Basico("Julia", 1, new Vendedor(),"Escola A");
        f[1] = new Basico("João", 2, new Vendedor(), "Escola B");
        f[2] = new Basico("Lucas", 3, new Supervisor(), "Escola C");
        f[3] = new Basico("Alessandro", 4, new Supervisor(), "Escola D");

        f[4] = new Medio("Davi", 5, new Vendedor(), "Escola E");
        f[5] = new Medio("Henrique", 6, new Vendedor(), "Escola F");
        f[6] = new Medio("Pedro", 7, new Supervisor(), "Escola G");
        f[7] = new Medio("Fernando", 8, new Gerente(), "Escola H");

        f[8] = new Superior("Felipe", 9, new Gerente(), "USP");
        f[9] = new Superior("Gustavo Muniz", 10, new Gerente(),"SPTech");

        double total = 0;

        for (int i = 0; i < f.length; i++){
            total += f[i].salario();
            System.out.println(f[i].nome + " = " + f[i].salario());
        }

        System.out.println("Total: " + total);
    }
}
