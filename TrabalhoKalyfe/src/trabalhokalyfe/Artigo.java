
package trabalhokalyfe;
//classe Artigo
public class Artigo {
    // atributos da classe
    private String nome;
    private String autor;
    private int ano;
    private String nomeConferencia;
// metodos getters e setters
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

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }
    // construtor pessonalizado
    Artigo(){
    
    nome= "the book";
    autor= "kalyf";
    ano= 2019;
    nomeConferencia="ifba";
    
    
    
    }
    
    
}
