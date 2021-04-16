
public class Voto implements Comparable<Voto> {
	
	private String nome;
	private Integer qtdVotos;
	
	//construtor
	public Voto (String nome, Integer qtdVotos)
	{
		this.nome = nome;
		this.qtdVotos = qtdVotos;
	}

	//getters/setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(Integer qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	@Override
	public int compareTo(Voto outro) {
		if(this.qtdVotos < outro.getQtdVotos())
			return -1;
		else if(this.qtdVotos > outro.getQtdVotos())
			return 1;
		else
			return 0;
	}
	
	

}
