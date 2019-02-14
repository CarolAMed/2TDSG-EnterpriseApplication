package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//mantem a anotação ate a execução
@Target(ElementType.FIELD) //anotação que pode ser usada em atributos

public @interface Coluna {

	//@collum serve para mostar o nome que o atributo tera
	
	String nome();
	
	boolean nullable();
	
}
