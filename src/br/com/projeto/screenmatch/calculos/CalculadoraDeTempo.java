package br.com.projeto.screenmatch.calculos;
import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void somaDaDuracao(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
