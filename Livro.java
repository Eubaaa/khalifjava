


package trabalhokalyfe;

//classe Livro

public class Livro {
   // atributos
    
    private String nome;
    private String autor;
    private int ano;
    private int edicao;
    
// metodos getters e stters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    // construtor personalizado
    
    Livro(){
      nome ="the book";
      autor ="Kalyf";
     ano = 2019;
     edicao = 3;
    }
    
}
