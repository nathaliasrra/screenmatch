package br.com.projeto.screenmatch.calculos;
import br.com.projeto.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void somaDaDuracao(Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
