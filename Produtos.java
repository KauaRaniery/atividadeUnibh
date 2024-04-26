package classes;

public class Produtos {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    
    public void Produto() {
        this.id = 0;
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    
    public void Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    
    public void atualizarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

   
    public void atualizarPreco(double preco) {
        this.preco = preco;
    }
}

