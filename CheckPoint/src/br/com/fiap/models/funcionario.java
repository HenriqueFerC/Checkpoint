package br.com.fiap.models;

public class funcionario {
	private String id;
	private String nome;
	private String login;
	private String senha;
	private String cargo;
	
	public funcionario (String id, String nome, String cargo) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
	}
	public String returnFuncionario() {
		return "Dados do Funcionario" + "\n" + "ID do Funcionario: " + id + "\n" + "Nome do Funcionario: " + nome + "\n" + "Cargo: " + cargo;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	

}
