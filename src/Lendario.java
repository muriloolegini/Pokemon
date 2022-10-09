public class Lendario extends Pokemon {

    String habilidadeExtra;
    
    public Lendario(String nome, Integer numero, Integer ataque, Integer defesa, Integer ataquEspecial,
            Integer defesaEspecial, Integer velocidade, Integer saude, String genero) {
        super(nome, numero, ataque, defesa, ataquEspecial, defesaEspecial, velocidade, saude, genero);
    }
    
    public void golpearDuplo(Integer golpe) {
        System.out.println("Dois golpes seguidos: " + golpe);
    }
}