package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto> {

	double getValor();

	String getNome();

	String getDescricao();
	
	String getIsbn();
}
