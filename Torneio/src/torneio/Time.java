package torneio;

import java.util.Arrays;

public class Time {
    private String nomeTime;
    private String bairro;
    private int vitorias, derrotas, empates, gol;
    private Jogador artilheiro[];
    private Jogador golos;
    private Jogador jogadores[];
    private Tecnico tecnico;

    public Time(String nomeTime, Tecnico tecnico, String bairro, Jogador[] jogadores) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.bairro = bairro;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.gol = 0;
        this.artilheiro = null;
        this.jogadores = jogadores;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

        public int getGol() {
        return gol;
    }
        
    public void setGol(int Gol) {
    	this.gol++;
    }
    
    public Jogador[] getArtilheiro() {
        return artilheiro;
    }

    public void setArtilheiro(Jogador[] artilheiro) {
        this.artilheiro = artilheiro;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    
	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

    @Override
    public String toString() {
        return "Time: " + nomeTime + " | Técnico: " + tecnico.getNome() + " | Telefone: " + tecnico.getTelefone() + "\nBairro: " + bairro + "\nVitorias: " + vitorias +
                " | Derrotas: " + derrotas + " | Empates: " + empates + " | Gols: " + golos +
                "\nArtilheiro: " + Arrays.toString(artilheiro) + "\nJogadores: " +
                Arrays.toString(jogadores);
    }

}
