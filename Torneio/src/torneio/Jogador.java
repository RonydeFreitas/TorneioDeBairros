package torneio;
public class Jogador extends Pessoa{
    private int numeroCamisa;
    private int gols = 1;

    public Jogador(String nome, int idade) {
        super(nome, idade);
        this.numeroCamisa = 0;
        this.gols = 0;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getGols() {
        return gols;
    }

    public void setGols() {
        this.gols ++;
    }

    @Override
    public String toString() {
        return "\nJogador: " + this.getNome() + " | Idade: " + this.getIdade() + 
                " | Camisa: " + this.getNumeroCamisa() + " | Gols: " + this.getGols();
    }

}
