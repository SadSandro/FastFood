package br.ufrpe.fastFood.exceptions;

public class ClienteNaoCadastrado extends Exception{

	private String login;

	public ClienteNaoCadastrado(String id){
		super("Cliente de Login " + id + "n�o encontrado.");
		this.login = id;
	} 

	public String getLogin(){
		return this.login;
	}
}
