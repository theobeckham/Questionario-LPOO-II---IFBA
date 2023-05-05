import Pacote01.Livro;

public class TestarLivros {
    public static void main(String[] args) throws Exception {
        
        String titulo = ("O pequeno principe"), titulo2 = ("Harry Poter - A pedra Filosofal"), titulo3 = ("A Moreninha");
        Livro livrofavorito = new Livro();
        Livro livrofavorito2 = new Livro();
        Livro livrofavorito3 = new Livro();

        //Livro 01
        livrofavorito.setTitulo(titulo);
        livrofavorito.setQtdPaginas(98);
        System.out.printf("O livro %s possui %d paginas \n",livrofavorito.getTitulo(), livrofavorito.getQtdPaginas());
        livrofavorito.setPaginasLidas(20);
        livrofavorito.verificarProgresso();
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();

        //Livro 02
        livrofavorito2.setTitulo(titulo2);
        livrofavorito2.setQtdPaginas(208);
        System.out.printf("\n O livro %s possui %d paginas \n",livrofavorito2.getTitulo(), livrofavorito2.getQtdPaginas());
        livrofavorito2.setPaginasLidas(20);
        livrofavorito2.verificarProgresso();
        livrofavorito2.setPaginasLidas(50);
        livrofavorito2.verificarProgresso();

        //Livro 03
        livrofavorito3.setTitulo(titulo3);
        livrofavorito3.setQtdPaginas(299);
        System.out.printf("\n O livro %s possui %d paginas \n",livrofavorito3.getTitulo(), livrofavorito3.getQtdPaginas());
        livrofavorito3.setPaginasLidas(20);
        livrofavorito3.verificarProgresso();
        livrofavorito3.setPaginasLidas(50);
        livrofavorito3.verificarProgresso();
    }
}
