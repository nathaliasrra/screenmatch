package br.com.projeto.screenmatch.modelos;

import br.com.projeto.screenmatch.calculos.ClassificacaoEstrela;

public class Filme extends Titulo implements ClassificacaoEstrela {

    @Override
    public int getClassificacao() {
        return 0;
    }
}
