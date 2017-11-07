package torneio;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private int telefone;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
       
}
