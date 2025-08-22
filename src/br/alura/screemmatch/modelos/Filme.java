package br.alura.screemmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public String filmeFavorito;

    public int gettotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void exibeFilmeFavorito(){
        System.out.println("Meu filme favorito é: " + filmeFavorito);
    }
}
