public class Main {
    
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Bubasaur", 1, 10, 10, 15, 15, 10, 10, "F");

        pokemon1.setGolpe1("TRACKLE");
        pokemon1.setGolpe2("GROWL");
        pokemon1.setGolpe3("LEECH SEED");
        pokemon1.setGolpe4("VINE WHIP");

        pokemon1.getGolpe1();
        pokemon1.getGolpe2();
        pokemon1.getGolpe3();
        pokemon1.getGolpe4();

        Lendario pokemonLendario = new Lendario("Mewtwo", 150, 20, 10, 25, 15, 9, 10, "M");

        pokemonLendario.setGolpe1("CONFUSION");
        pokemonLendario.setGolpe2("PYSICHIC");
        pokemonLendario.setGolpe3("PYSTRIKE");
        pokemonLendario.setGolpe4("PSYCHO CUT");
        pokemonLendario.habilidadeExtra = "HIBILIDADE EXTRA";

        pokemonLendario.golpearDuplo(1);
        pokemonLendario.golpear(2);
    }
}