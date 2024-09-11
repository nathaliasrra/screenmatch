import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setDuracaoEmMinutos(180);
        System.out.println(filme1.getNome());
        System.out.println(filme1.getAnoDeLancamento());
        System.out.println(filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5.9);
        filme1.avalia(6.4);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.retornaMediaDasAvaliacoes());

        Serie serie1 = new Serie();
        serie1.setNome("Supernatural");
        serie1.setAnoDeLancamento(2003);
        serie1.exibeFichaTecnica();


    }
}
