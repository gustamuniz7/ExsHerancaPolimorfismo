package Main;

public class Teste {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Bob",5);
        Animal a2 = new Cavalo("Pé de pano", 7);
        Animal a3 = new Preguica("Maria", 10);

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();


        Veterinario v1 = new Veterinario();

        v1.examinar(new Cachorro("Rex", 4));
        v1.examinar(new Cavalo("Jobson", 6));
        v1.examinar(new Preguica("Sono", 8));
    }
}
