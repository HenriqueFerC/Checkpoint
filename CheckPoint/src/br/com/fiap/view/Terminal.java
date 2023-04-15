package br.com.fiap.view;
import br.com.fiap.models.Cachorro;
import br.com.fiap.models.Dono;
import br.com.fiap.models.Endereco;
import br.com.fiap.models.funcionario;
import br.com.fiap.models.Problema;

public class Terminal {
	public static void main(String [] args) {
		Endereco address = new Endereco("Avenida Lins",(short) 1300,"03632000","Ali perto");
		Dono dono = new Dono("Jorge","525465284-5",address); 
		Cachorro cachorro = new Cachorro("Jorgim","viralata",16.8f,dono);
		funcionario atend = new funcionario("5213213", "Augusto", "Atendente");
		Problema idk = new Problema("Pisou em um caco de vidro", "Estava caminhando com ele e ele pisou no vidro", 2.30);
		System.out.println(address.retornarE());
		System.out.println(cachorro.exibirDados());
		System.out.println(dono.retornarD());
		System.out.println(atend.returnFuncionario());
		System.out.println(idk.returnProb());
	}
	
}



