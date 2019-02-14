package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Animal;

public class TesteParam {

	public static void main(String[] args) {
		
		Animal anim = new Animal();
	
		//Recupera a anotação @Tabela
		Tabela anotacao =  anim.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM  "+anotacao.nome());
		

	}

}
