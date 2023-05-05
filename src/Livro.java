public class Livro {
    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;

    public Livro(String titulo, Integer qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarProgresso() {
        Integer porcentagem = (paginasLidas * 100) / qtdPaginas;
        System.out.printf("Você já leu %d por cento do livro\n", porcentagem);
    }
}