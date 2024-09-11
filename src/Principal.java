import br.com.projeto.screenmatch.calculos.CalculadoraDeTempo;
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
        serie1.setTemporadas(17);
        serie1.setEpisodiosPorTemporada(22);
        serie1.setMinutosPorEpisodio(40);
        serie1.exibeFichaTecnica(); //imprimirá a duração por causa do metodo
        System.out.println("Duração total da série: " + serie1.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("O Poderoso Chefão");
        filme2.setAnoDeLancamento(1972);
        filme2.setDuracaoEmMinutos(100);
        System.out.println(filme2.getNome());
        System.out.println(filme2.getAnoDeLancamento());
        System.out.println(filme2.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora1 = new CalculadoraDeTempo();
        calculadora1.somaDaDuracao(filme1);
        calculadora1.somaDaDuracao(filme2);
        System.out.println(calculadora1.getTempoTotal());


    }
}
