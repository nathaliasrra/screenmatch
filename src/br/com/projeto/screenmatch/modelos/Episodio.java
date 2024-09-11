package br.com.projeto.screenmatch.modelos;

import br.com.projeto.screenmatch.calculos.ClassificacaoEstrela;

public class Episodio implements ClassificacaoEstrela {
    private int numeroDeEpisodios;
    private String nome;
    private Serie serie;
    private int totalDeVisulizacoes;

    public int getTotalDeVisulizacoes() {
        return totalDeVisulizacoes;
    }

    public void setTotalDeVisulizacoes(int totalDeVisulizacoes) {
        this.totalDeVisulizacoes = totalDeVisulizacoes;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisulizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
