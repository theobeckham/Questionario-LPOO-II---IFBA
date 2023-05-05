package Pacote01;

public class Livro {

    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getQtdPaginas() {
        return qtdPaginas;
    }
    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public Integer getPaginasLidas() {
        return paginasLidas;
    }
    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarProgresso(){
        Integer porcentagem;
        
        porcentagem = (paginasLidas * 100)/ qtdPaginas;

        System.out.printf("Voce ja leu %d por cento do livro\n",porcentagem);

    }
}
