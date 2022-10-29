public abstract class PokemonAbstract {
    private String nome;
    private Integer numero;
    private Integer ataque;
    private Integer defesa;
    private Integer ataquEspecial;
    private Integer defesaEspecial;
    private Integer velocidade;
    private Integer saude;
    private String genero;
    
    public abstract void restaurarVida() {
        saude = 10;
        System.out.println("Vida restaurada: " + saude);
    }

    public abstract void golpear(Integer golpe) {
        System.out.println("Golpeado! ");
    }

    public abstract void defender() {
        System.out.println("Defendido!!");
    }
}
