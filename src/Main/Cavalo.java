package Main;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("iiirrrrí");
    }

    @Override
    public void correr(){
        System.out.println("Cavalo Correndo");
    }
}
