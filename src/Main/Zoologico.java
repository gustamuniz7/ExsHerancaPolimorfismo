package Main;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Rex",5);
        jaulas[1] = new Cavalo("Bolt",7);
        jaulas[2] = new Preguica("Sono",8);
        jaulas[3] = new Cachorro("Raio",3);
        jaulas[4] = new Cavalo("Thor",8);
        jaulas[5] = new Preguica("Bob",9);
        jaulas[6] = new Cachorro("Max",10);
        jaulas[7] = new Cavalo("Trovão",2);
        jaulas[8] = new Preguica("Moleza",6);
        jaulas[9] = new Cachorro("Tony",4);

        for (int i = 0; i <= 9; i++){
            jaulas[i].emitirSom();

            if (jaulas[i] instanceof Preguica){
                ((Preguica) jaulas[i]).escalar();
            } else {
                jaulas[i].correr();
            }
        }

    }

}
