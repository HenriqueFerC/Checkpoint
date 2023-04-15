package br.com.fiap.models;

public class Cachorro {
	
	private String nome;
	private String raca;
	private float peso;
	private Dono dono;
	
	public Cachorro(String nome, String raca, float peso, Dono dono) {
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.dono = dono;
	}
	
	public String exibirDados() {
		return "Nome do PET: " + nome + "\n" + "Raca: " + raca + "\n" + "Peso: " + peso;
	}
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	
	
	
	
	

}
