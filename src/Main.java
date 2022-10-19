public class Main {
    
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Bubasauro", 1, 10, 10, 15, 15, 10, 10, "M");

        pokemon1.setGolpe1("Chute");
        pokemon1.setGolpe2("Soco");
        pokemon1.setGolpe3("Chicote");
        pokemon1.setGolpe4("Tiro de folhas");
        pokemon1.getGolpe1();
        pokemon1.getGolpe2();
        pokemon1.getGolpe3();
        pokemon1.getGolpe4();

        System.out.println("O pokémon é: " + pokemon1.nome);
        pokemon1.restaurarVida();

        Pokemon pokemon2 = new Pokemon("Bubasauro", 1, 10, 10, 15, 15, 10, 10, "M");

        pokemon2.setGolpe1("Chute");
        pokemon2.setGolpe2("Soco");
        pokemon2.setGolpe3("Chicote");
        pokemon2.setGolpe4("Tiro de folhas");

        pokemon2.getGolpe1();
        pokemon2.getGolpe2();
        pokemon2.getGolpe3();
        pokemon2.getGolpe4();

        System.out.println("O pokémon é: " + pokemon2.nome);
        pokemon2.restaurarVida();


        Lendario pokemonLendario = new Lendario("Mewtwo", 150, 20, 10, 25, 15, 9, 10, "M");

        pokemonLendario.setGolpe1("CONFUSION");
        pokemonLendario.setGolpe2("PYSICHIC");
        pokemonLendario.setGolpe3("PYSTRIKE");
        pokemonLendario.setGolpe4("PSYCHO CUT");
        pokemonLendario.habilidadeExtra = "HIBILIDADE EXTRA";

        System.out.println("O pokémon é: " + pokemonLendario.nome);
        pokemonLendario.restaurarVida();
        
        pokemonLendario.golpearDuplo(1);
        pokemonLendario.golpear(2);
    }
}