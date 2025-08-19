public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    String favoriteMovie;

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
    }

    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }

    void exibeFilmeFavorito(){
        System.out.println("Meu filme favorito é: " + favoriteMovie);
    }
}
