import java.util.ArrayList;

public class Acao implements II_Ibovespa {

    /*
    - nome (string)
    - preco (float)
    - valorizacao (float)
    */
    private String nome;
    private float preco;
    private float valorizacao;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getValorizacao() {
        return valorizacao;
    }
    public void setValorizacao(float valorizacao) {
        this.valorizacao = valorizacao;
    }

    @Override
    public String toString() {
        return "Acao [nome=" + nome + ", preco=" + preco + ", valorizacao=" + valorizacao + "]";
    }

    @Override
    public void listar(ArrayList<Acao> acoes) {
        System.out.println("Lista evolução da PETROBRAS");
        for (Acao minhaAcao : acoes) {
            System.out.println(minhaAcao);
        }   
        
    }

    @Override
    public void ordenar(ArrayList<Acao> acoes) {
        //Dever de casa
        System.out.println("Fazer o ordenar");
        
    }

    
}