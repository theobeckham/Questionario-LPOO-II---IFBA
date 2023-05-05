# Questionario-LPOO-II---IFBA
// Exemplo de fatoração simples para questionário de LPOO II - IFBA
// Classe pricipal refatorada

public class TestarLivros {
    public static void main(String[] args) throws Exception {
        Livro livrofavorito = new Livro("O pequeno principe", 98);
        Livro livrofavorito2 = new Livro("Harry Poter - A pedra Filosofal", 208);
        Livro livrofavorito3 = new Livro("A Moreninha", 299);

        // Livro 01
        System.out.printf("O livro %s possui %d paginas \n", livrofavorito.getTitulo(), livrofavorito.getQtdPaginas());
        livrofavorito.setPaginasLidas(20);
        livrofavorito.verificarProgresso();
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();

        // Livro 02
        System.out.printf("\n O livro %s possui %d paginas \n", livrofavorito2.getTitulo(), livrofavorito2.getQtdPaginas());
        livrofavorito2.setPaginasLidas(20);
        livrofavorito2.verificarProgresso();
        livrofavorito2.setPaginasLidas(50);
        livrofavorito2.verificarProgresso();

        // Livro 03
        System.out.printf("\n O livro %s possui %d paginas \n", livrofavorito3.getTitulo(), livrofavorito3.getQtdPaginas());
        livrofavorito3.setPaginasLidas(20);
        livrofavorito3.verificarProgresso();
        livrofavorito3.setPaginasLidas(50);
        livrofavorito3.verificarProgresso();
    }
}
