package br.com.fiap.bean;

import java.lang.annotation.ElementType;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;



@Tabela(nome="TB_ANIMAL")
public class Animal {
	
	@Coluna(nome="cd_animal",nullable = false)
	private int codigo;
	
	@Coluna(nome="patas",nullable = false)
	private int patas;
	
	@Coluna(nome="ds_especie",nullable = true)
	private String especie;
	
	@Coluna(nome="ds_voador",nullable = true)
	private boolean voador;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isVoador() {
		return voador;
	}

	public void setVoador(boolean voador) {
		this.voador = voador;
	}
	
	

}
