import br.alura.screemmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.filmeFavorito = "A culpa é das Estrelas";

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5.6);
        meuFilme.avalia(10);
        System.out.println(meuFilme.gettotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        meuFilme.exibeFilmeFavorito();
    }
}
