package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//mantem a anota��o ate a execu��o
@Target(ElementType.FIELD) //anota��o que pode ser usada em atributos

public @interface Coluna {

	//@collum serve para mostar o nome que o atributo tera
	
	String nome();
	
	boolean nullable();
	
}
