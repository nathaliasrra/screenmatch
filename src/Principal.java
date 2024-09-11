public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "O Poderoso Chefão";
        filme1.anoDeLancamento = 1972;
        filme1.duracaoEmMinutos = 180;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5.9);
        filme1.avalia(6.4);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.retornaMediaDasAvaliacoes());


    }
}
