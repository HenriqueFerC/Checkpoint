package br.com.fiap.models;

public class Endereco {
	
	private String logradouro;
	private short numero;
	private String cep;
	private String complemento;
	
	public Endereco(String logradouro, short numero, String cep, String complemento){
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	public String retornarE() {
		return "logradouro: " + logradouro + "\n" + " Numero: " + numero + "\n" + " CEP: " + cep + "\n" +" Complemento: " + complemento + "\n";
	}
	
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	

}
