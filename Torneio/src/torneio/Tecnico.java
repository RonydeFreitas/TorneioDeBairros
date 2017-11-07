package torneio;

public class Tecnico extends Pessoa{
	private static String funcao = "Tecnico";
	private int vitorias;
	
	public Tecnico(String nome, int idade) {
		super(nome, idade);
	}

	public static String getFuncao() {
		return funcao;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
}
