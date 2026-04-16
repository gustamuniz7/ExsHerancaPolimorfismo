package Main;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("aiiieeee");
    }


    public void escalar(){
        System.out.println("Subindo na árvore...");
    }
}
